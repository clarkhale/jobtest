package net.deadvax.examples;

import java.lang.Thread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws java.lang.InterruptedException
    {
        System.out.println( "Hello World!" );

	int i = 5;

	while( i > 0 ) {
		System.out.println("Environment Definition:  " + System.getProperty("JOB_TEST"));
		Thread.sleep(1);

	}
    }
}
