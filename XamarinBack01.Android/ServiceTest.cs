using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.Locations;

using System.Threading.Tasks;
using System.Timers;


namespace XamarinBack01.Droid
{
    [Service(Label = "XamarinBack01.Android.ServiceTest", Name = "XamarinBack01.Android.ServiceTest")]
    public class ServiceTest: Service
    {
        IBinder _binder;
        public override IBinder OnBind(Intent intent)
        {
            _binder = new ServiceTestBinder(this);
            return _binder;
        }
        public override StartCommandResult OnStartCommand(Intent intent, StartCommandFlags flags, int startId)
        {
            new Task(() =>
            {

                Toast.MakeText(this, "GSFamily Iniciado", ToastLength.Short).Show();
                var newIntent = new Intent(this, typeof(ReceiverCall));
                StartService(newIntent);

            }).Start();

            return StartCommandResult.Sticky;
        }
        public class ServiceTestBinder : Binder
        {
            public ServiceTest Service { get { return this.LocService; } }
            protected ServiceTest LocService;
            public bool IsBound { get; set; }
            public ServiceTestBinder(ServiceTest service) { this.LocService = service; }
        }
        public class ServiceTestConnection : Java.Lang.Object, IServiceConnection
        {

            ServiceTestBinder _binder;

            public event Action Connected;
            public ServiceTestConnection(ServiceTestBinder binder)
            {
                if (binder != null)
                    this._binder = binder;
            }

            public void OnServiceConnected(ComponentName name, IBinder service)
            {
                ServiceTestBinder serviceBinder = (ServiceTestBinder)service;

                if (serviceBinder != null)
                {
                    this._binder = serviceBinder;
                    this._binder.IsBound = true;
                    //serviceBinder.Service.StartLocationUpdates();
                    if (Connected != null)
                        Connected.Invoke();
                }
            }
            public void OnServiceDisconnected(ComponentName name) { this._binder.IsBound = false; }
        }

        public override void OnCreate()
        {
            base.OnCreate();
            //Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
            Toast.MakeText(Android.App.Application.Context, "Service Started", ToastLength.Long).Show();
        }

        public override void OnDestroy ()
        {
            Intent intent = new Intent("com.android.XamarinBack01");
            intent.PutExtra("yourvalue", "torestore");
            SendBroadcast(intent);

        }

    }
}