package saothienhat.javademo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import saothienhat.javademo.export.ExportDataController;
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
        
        // testForLoopPerformance();
        
        // testJMHBenchmark();
    	
    	/** Export Excel file using Apache POI */
    	// textExportExcelFile("D:\\");
    	
    }

    /** Export Excel file */
	private static void textExportExcelFile(String exportPath) {
		ExportDataController controller = new ExportDataController();
		try {
			controller.setExportPath(exportPath);
			controller.exportExcel();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
