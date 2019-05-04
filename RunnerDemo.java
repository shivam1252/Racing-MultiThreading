package Racing;

public class RunnerDemo {
	public static void main(String args[])
	{
		Racer r = new Racer();
		Thread t1 = new Thread(r, "Shivam");
		Thread t2 = new Thread(r, "Shikhar");
		Thread t3 = new Thread(r, "Abhishek");
		Thread t4 = new Thread(r, "Rishabh");
		Thread t5 = new Thread(r, "Thakur");
		Thread t6 = new Thread(r, "Punit");
		Thread t7 = new Thread(r, "Vaibhav");
		Thread t8 = new Thread(r, "Ayush");
		Thread t9 = new Thread(r, "Gaurav");
		Thread t10 = new Thread(r, "Prashant");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		
	}

}
