using System;

using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Content;
using Xamarin.Forms.Platform.Android;

namespace XamarinBack01.Droid
{
    [Activity(Label = "XamarinBack01", Icon = "@drawable/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]    
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsApplicationActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
            FormsAppCompatActivity.TabLayoutResource = Resource.Layout.Tabbar;
            FormsAppCompatActivity.ToolbarResource = Resource.Layout.Toolbar;

            base.OnCreate(bundle);

            global::Xamarin.Forms.Forms.Init(this, bundle);

            StartService(new Intent(Android.App.Application.Context, typeof(ServiceTest)));

            LoadApplication(new App());
        }
    }
}

