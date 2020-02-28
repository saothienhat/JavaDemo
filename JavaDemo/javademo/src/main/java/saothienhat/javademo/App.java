package saothienhat.javademo;

import saothienhat.javademo.performance.BenchmarkLoop;
import saothienhat.javademo.performance.ForLoopPerformanceTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
        
//        testForLoopPerformance();
        
//        testJMHBenchmark();
    }

	private static void testForLoopPerformance() {
		ForLoopPerformanceTest forLoopPerformanceTest = new ForLoopPerformanceTest();
        forLoopPerformanceTest.testForLoopPerformance();
	}

	private static void testJMHBenchmark() {
		BenchmarkLoop tester = new BenchmarkLoop();
		tester.run();
	}
}
