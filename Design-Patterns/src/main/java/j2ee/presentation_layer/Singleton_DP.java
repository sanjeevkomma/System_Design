package j2se.creational;

// double check locking
public class Singleton_DP {

	// private instance, so that it can be accessed by only by getInstance() method

	private static Singleton_DP instance ;

	private Singleton_DP() {

	}

	public static Singleton_DP getInstance() {

		if ( instance == null ) {

			synchronized ( Singleton_DP.class ) {

				if( instance == null ) {

					instance = new Singleton_DP();
				}

			}
		}
		return instance;
	}
}
