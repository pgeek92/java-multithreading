package multithreading.thread_synchronization;

import java.util.Scanner;
/**
 * 
 * @author prashant
 * 
 * 
 *
 */
class Processor extends Thread {
	// 'volatile' keyword is used to prevent threads caching variables when they're not changed from 
	// within that thread
	private volatile boolean running = true;
	
	// this thread has its own copy of running and it's not expecting other thread (Main thread) to
	// modify, if we use 'volatile' keyword than this code will work and stop the thread by entering return key in
	// all the systems
	public void run() {
		while(running) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		this.running = false;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press return to stop ...");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		proc1.shutdown();
		in.close();
	}
}
