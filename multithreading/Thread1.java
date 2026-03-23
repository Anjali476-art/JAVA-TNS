package multithreading;
public class Thread1 extends Thread{
	DemoThreadComm ob;
	
	Thread1(DemoThreadComm ob){
		this.ob=ob;
	}
	
	public void run() {
		for(int j=1;j<5;j++) {
			ob.deliver(j);
		}
	}
}
