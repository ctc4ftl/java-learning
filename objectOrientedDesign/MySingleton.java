package objectOrientedDesign;

public class MySingleton {
	// placeholder for current singleton object
	private static MySingleton __me = null;
	// private contstructor - now no other class can instantiate
	private MySingleton() {}
	// this is how you ask for the singleton
	public static MySingleton getInstance() {
		// do i exist?
		if (__me == null ) {
			// if not, instantiate and store
			__me = new MySingleton();
		}
		return __me;
	}

	// add additional functionality
	// public someMethod() {}		
}

/*
 * using a singleton in java
 * 
 * ask for the singleton
 * MySinglton single = MySingleton.getInstance();
 * 
 * use it
 * single.someMethod();
 * 
 * or even just call directly
 * MySingleton.getInstance().someMethod();
 */
