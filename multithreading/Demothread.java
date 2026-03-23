package multithreading;
//Program for creating a thread using Thread class
public class Demothread extends Thread {
	
	public void run() {
		
		try {
			System.out.println("This thread is"+Thread.currentThread().getId()+"running...");
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
		
		
	}
//Driver class
public class Mainthread {
	public static void main(String[] args) {
           int n=5;
           for(int i=0;i<n;i++) {
           	Demothread ob=new Demothread();
           	ob.start();
           }
	}
}
