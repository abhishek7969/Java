package thread;

import java.util.Scanner;

/**
 * use of volatile key word
 * @author Abhishek.Kumar
 *
 */
public class ThreadSynchronization {

	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("Press enter to shut down");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		p1.shutDown();
	}
}

class Processor extends Thread{
	
	private volatile boolean  running = true;  // adding of volatile guarantee it to work on every environment,
	/**
	 * Thread running this run method might cache the value of the variable "running" .says "running" value is not change i will cache 
	 * this value, and will not the value of this from the main memory, it happens when java tries to optimize the code.
	 * I am not care checking the value of the variable.
	 * Volatile is use to prevent the thread cache the variables
	 */
	public void run(){
		
		while(running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutDown(){
		running = false;
	}
}
