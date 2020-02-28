package saothienhat.javademo.performance;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class ForLoopPerformanceTest {
	
	public void testForLoopPerformance() {
		List<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < 10000000; index++) {
			list.add(index);
		}
		
		long startTime = 0;
		long endTime = 0;
		int size = list.size();
		
		System.out.println("Test Performance of For loop of 10.000.000 items: ");
		//Type 1
        startTime = Calendar.getInstance().getTimeInMillis();
        for(Integer i : list) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("\tUsing for(Integer i : list) :: " + (endTime - startTime) + " ms");
        
        // Type 2
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int j = 0; j < list.size() ; j++) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("\tUsing collection.size() :: " + (endTime - startTime) + " ms");
        
       // Type 3
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int j = 0; j < size ; j++) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("\tUsing [int size = list.size(); int j = 0; j < size ; j++] :: " + (endTime - startTime) + " ms");
 
        // Type 4
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int j = list.size(); j > size ; j--) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("\tUsing [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms");
	}

}
