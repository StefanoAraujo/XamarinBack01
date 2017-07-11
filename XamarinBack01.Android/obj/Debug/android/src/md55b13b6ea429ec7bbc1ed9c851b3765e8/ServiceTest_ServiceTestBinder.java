package md55b13b6ea429ec7bbc1ed9c851b3765e8;


public class ServiceTest_ServiceTestBinder
	extends android.os.Binder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XamarinBack01.Droid.ServiceTest+ServiceTestBinder, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ServiceTest_ServiceTestBinder.class, __md_methods);
	}


	public ServiceTest_ServiceTestBinder () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ServiceTest_ServiceTestBinder.class)
			mono.android.TypeManager.Activate ("XamarinBack01.Droid.ServiceTest+ServiceTestBinder, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public ServiceTest_ServiceTestBinder (md55b13b6ea429ec7bbc1ed9c851b3765e8.ServiceTest p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == ServiceTest_ServiceTestBinder.class)
			mono.android.TypeManager.Activate ("XamarinBack01.Droid.ServiceTest+ServiceTestBinder, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinBack01.Droid.ServiceTest, XamarinBack01.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}

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
