package threadpkg;

public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println("Current Thread is : "+(Thread.currentThread().getName()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<10;i++){
			ThreadDemo t1 = new ThreadDemo();
			t1.start();
		}
		
//		Thread t = new Thread();
//		System.out.println("Current Thread is : "+(t.currentThread().getName()));
//		t.setName("My thread");
//		System.out.println("After name change  "+t);
	}

}
