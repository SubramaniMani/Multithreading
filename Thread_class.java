package multithread;

public class Thread_class  extends Thread{
	public void run()
	{
		for(int no=1; no<=3; no++)
		{
			System.out.println("thread_class="+no);
		}
	}

}
