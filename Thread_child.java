package multithread;

public class Thread_child {

	public static void main(String[] args) {
		
		Thread_child1 object =new Thread_child1();
		object.start();
		
		System.out.println("getId----"+object.getId());
		System.out.println("getName----"+object.getName());
		System.out.println("grt.priority----"+object.getPriority());
		System.out.println("isalive----"+object.isAlive());
		System.out.println("is daemon----"+object.isDaemon());
		
		Thread_child1 object1 =new Thread_child1();
		object1.start();
		
		System.out.println("getId----"+object1.getId());
		System.out.println("getName----"+object1.getName());
		System.out.println("grt.priority----"+object1.getPriority());
		System.out.println("isalive-----"+object1.isAlive());
		System.out.println("is daemon-----"+object1.isDaemon());
		
		for(int no=1; no<=3; no++)
		{
			System.out.println("thread_child"+no);
		}
	}

}
