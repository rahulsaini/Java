public class DisplayMessage
{
	
	/*public void showMessage(String msg)
	{
		System.out.print("[" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}*/

	/*
	 *  Method is synchronized
	 */
	public synchronized void showMessage(String msg)
	{
		System.out.print("[" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
