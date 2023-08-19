package multithread;

public class Thread_child1 extends Thread {
	
	public void run()
	{
		for(int no=1; no<=3; no++)
		{
			System.err.println("thread_child1"+no);
		}
	}

}
