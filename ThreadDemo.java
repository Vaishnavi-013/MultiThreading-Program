package com.threadprocess.example;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Square s = new Square();
		AverageThread avg = new AverageThread();
		
		Thread square = new Thread(s);
		Thread average = new Thread(avg);
		
		square.start();
		average.start();
	}

}
