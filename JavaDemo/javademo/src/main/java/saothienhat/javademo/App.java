package saothienhat.javademo;

import saothienhat.javademo.performance.ForLoopPerformanceTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
        
        ForLoopPerformanceTest forLoopPerformanceTest = new ForLoopPerformanceTest();
        forLoopPerformanceTest.testForLoopPerformance();
    }
}
