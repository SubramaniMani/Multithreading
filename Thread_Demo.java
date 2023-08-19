package multithread;

public class Thread_Demo {

	public static void main(String[] args) {
		
		Thread_class object=new Thread_class();
		object.start();
		Thread_class object1=new Thread_class();
		object1.start();
		Thread_class object2=new Thread_class();
		object2.start();
		for(int no=0; no<=2; no++)
		{
			System.out.println("thread_Demo"+no);
		}
		
		
	}

}

