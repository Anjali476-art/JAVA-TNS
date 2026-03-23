package multithreading;
//executor class for Runnable interface
public class RunnableDemo {
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		UsingRunnable ur = new UsingRunnable(10, 20, "Hello");
		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();

}}