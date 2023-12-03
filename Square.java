package com.threadprocess.example;

public class Square extends Thread{

	int[] arr = {1, 20, 50, 15, 30};
	 
	public void run() 
    {
		System.out.print("Squares of given numbers:");
		
		for (int i = 0; i <arr.length; i++) {
            
			System.out.print(arr[i] * arr[i] + " ");
                
                try
                    {
                       sleep(1000);  
                    }
                    
                catch(Exception e)
                    {
                           System.out.println(e);                                
                     }
		}
    }
}
            
           
