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

namespace XamarinBack01.Droid
{
    [BroadcastReceiver]
    public class ReceiverCall : BroadcastReceiver
    {
        public override void OnReceive(Context context, Intent intent)
        {
            //Toast.MakeText(context, "Received intent!", ToastLength.Short).Show();

            if(intent.Action.Equals(Intent.ActionBootCompleted))
            //if ("android.intent.action.BOOT_COMPLETED".Equals(intent.Action))
            //if (intent.Action.Equals("android.intent.action.BOOT_COMPLETED"))
            {
                Intent startServiceIntent = new Intent(Android.App.Application.Context, typeof(ServiceTest));
                context.StartService(startServiceIntent);
            }
            else
            {
                context.StartService(new Intent(Android.App.Application.Context, typeof(ServiceTest)));

            }



        }

    }
}