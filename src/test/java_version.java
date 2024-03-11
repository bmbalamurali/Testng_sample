package test;

import org.testng.annotations.Test;

public class java_version {
	
	@Test
	public void javaVersion() {
	    System.out.println(System.getProperty("java.version"));
	    System.out.println(System.getProperty("java.runtime.version"));
	    System.out.println(System.getProperty("java.home"));
	    System.out.println(System.getProperty("java.vendor"));
	    System.out.println(System.getProperty("java.vendor.url"));
	    System.out.println(System.getProperty("java.class.path"));
	}

}
