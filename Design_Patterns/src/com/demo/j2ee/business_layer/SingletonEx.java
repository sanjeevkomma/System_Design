package j2ee.business_layer;

//Java code to explain double check locking
public class SingletonEx
{
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingletonEx instance;

	private SingletonEx()
	{
		// private constructor
	}

	public static SingletonEx getInstance()
	{
		if (instance == null)
		{
			//synchronized block to remove overhead
			synchronized (SingletonEx.class)
			{
				if(instance==null)
				{
					// if instance is null, initialize
					instance = new SingletonEx();
				}

			}
		}
		return instance;
	}
}