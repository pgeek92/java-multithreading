package multithreading.starting_threads;

class RunnerUsingThread extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		RunnerUsingThread runner1 = new RunnerUsingThread();
		runner1.start();
		
		//If i'll again start the same thread, which is already completed it's execution
		//then it will throw 'java.lang.IllegalThreadStateException', to check uncomment
		//below line
		//runner1.start();
		
		RunnerUsingThread runner2 = new RunnerUsingThread();
		runner2.start();
		
		//We can't directly call run method to start a thread, you need to call start method to 
		//create a new thread, if you call run method directly, it won't create a new thread and it will
		//be in same stack as main, please uncomment below to test
		
		//runner1.run();
		//runner2.run();
	}

}
