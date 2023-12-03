package com.threadprocess.example;

public class AverageThread extends Thread {

	
	double average;
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 
	public void run() 
    {
	        
		int sum = 0;

	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }

	        average = (double) sum / numbers.length;

	        System.out.println("\n Average of given numbers: " + average);
                
	            try
                    {
                       sleep(100);  
                    }
                    
                catch(Exception e)
                    {
                           System.out.println(e);                                
                    }
    }
}
