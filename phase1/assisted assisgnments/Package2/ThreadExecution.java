package Package2;


public class ThreadExecution extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadExecution mt = new ThreadExecution();
  		mt.start();
 	}

}

