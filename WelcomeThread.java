package com.threadprocess.example;

public class WelcomeThread implements Runnable {
	
	private String[] names;
	
	
	public void dipslay(String name)
	{
		System.out.println("Welcome to Multithreading "+ name);
	}
		
	public WelcomeThread(String[] name)
		{
			names=name;
		}
		
	public void run()
		{
			System.out.println("Thread started");
			
			for(int i=0;i<names.length;i++)
			{
				dipslay(names[i]);
				
				try
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					System.out.println(e.toString());
				}
			}
		}
	}
