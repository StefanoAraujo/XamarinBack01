package md55b13b6ea429ec7bbc1ed9c851b3765e8;


public class ServiceTest_ServiceTestConnection
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.ServiceConnection
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onServiceConnected:(Landroid/content/ComponentName;Landroid/os/IBinder;)V:GetOnServiceConnected_Landroid_content_ComponentName_Landroid_os_IBinder_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onServiceDisconnected:(Landroid/content/ComponentName;)V:GetOnServiceDisconnected_Landroid_content_ComponentName_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XamarinBack01.Droid.ServiceTest+ServiceTestConnection, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ServiceTest_ServiceTestConnection.class, __md_methods);
	}


	public ServiceTest_ServiceTestConnection () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ServiceTest_ServiceTestConnection.class)
			mono.android.TypeManager.Activate ("XamarinBack01.Droid.ServiceTest+ServiceTestConnection, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public ServiceTest_ServiceTestConnection (md55b13b6ea429ec7bbc1ed9c851b3765e8.ServiceTest_ServiceTestBinder p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == ServiceTest_ServiceTestConnection.class)
			mono.android.TypeManager.Activate ("XamarinBack01.Droid.ServiceTest+ServiceTestConnection, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinBack01.Droid.ServiceTest+ServiceTestBinder, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1)
	{
		n_onServiceConnected (p0, p1);
	}

	private native void n_onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1);


	public void onServiceDisconnected (android.content.ComponentName p0)
	{
		n_onServiceDisconnected (p0);
	}

	private native void n_onServiceDisconnected (android.content.ComponentName p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}