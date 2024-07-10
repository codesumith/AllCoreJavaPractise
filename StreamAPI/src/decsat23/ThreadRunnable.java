package decsat23;


class Run implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable");
		System.out.println(Thread.currentThread().getName());
		Thread t = Thread.currentThread();
		try {
		t.join();
		}
		catch(Exception e ) {
			e.printStackTrace();
			
		}
		
	}
	
}
public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main started");
		Run r = new Run();
		
		Thread t1 =new Thread(r,"Child-1");
		t1.start();
		
		Thread t2 =new Thread(r,"Child-2");
		t2.start();
		
	t2.join();
		System.out.println("Main ended");
		
	
		
	}

}
