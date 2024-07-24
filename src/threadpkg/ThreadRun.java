package threadpkg;

public class ThreadRun implements Runnable {
	public void run() {
		System.out.println("Currently working Thread is : "+Thread.currentThread().getName());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		for(int i = 0;i<5;i++) {
			ThreadRun tr = new ThreadRun();
			Thread t = new Thread(tr);
			t.start();
			t.sleep(5000);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
