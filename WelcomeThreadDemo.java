package com.threadprocess.example;

public class WelcomeThreadDemo {

		public static void main(String[] args) {
			String[] s= {"shreya", "rakshu", "keerthi","kushi", "kiran"};
			String[] s1= {"vaishnavi", "saraswathi", "bunny","sarika", "vikas"};
			WelcomeThread d1 = new WelcomeThread(s);
			WelcomeThread d2 = new WelcomeThread(s1);
			
			Thread t1 = new Thread(d1);
			Thread t2 = new Thread(d2);
			
			t1.start();
			t2.start();
			

		}

	}
