package com.quizzes.starters;

public class CounterThread extends Thread{
	// add volatile to avoid infinite loop
	private volatile boolean stop = false;
	//private boolean stop = false; 
	private long count = 0;
	
	public void run(){
		while(!stop){
			count++;
		}
		
		System.out.println("Count -> " + count);
	}
	
	public void setStop(boolean stop){
		this.stop = stop;
	}
	
	public static void main(String ... args){
		final CounterThread t = new CounterThread();
		t.start();
		
		// no lambda
		/*new Thread(){
			public void run(){
				try{
					Thread.sleep(1000);
					t.setStop(true);
				}catch(Exception e){}	
			}			
		}.start();		*/
				
		new Thread(() -> {
				try{
					Thread.sleep(1000);
					t.setStop(true);
				}catch(Exception e){}	
		}).start();		

	}
}	