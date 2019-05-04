package Racing;

public class Racer implements Runnable{

	private static  String winner;
	public long time;
	static String  success;
	public void run()
	{
		for(int distance = 1; distance <= 100; distance++)
		{
			time = System.nanoTime();
			System.out.println("Distance covered by " +Thread.currentThread().getName() +" is:" +distance +" meter" +" in " +time);
			boolean w = isRaceWon(distance);
			if(w == true)
			{
				 success = winner;
				 w = false;
			}
		}
		System.out.println();
		System.out.println("Winner is " + success +" and time taken by him is: " +time);
		
	}
	
	public boolean isRaceWon(int distanceCovered)
	{
		boolean isRaceWon = false;
		if((Racer.winner == null) && (distanceCovered == 100))
		{
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			//System.out.println("Winner is " + Racer.winner +" and time taken by him is: " +time);	
			isRaceWon = true;
		}
		else
		{
			isRaceWon = false;
		}
		return isRaceWon;
	}

	
	
}
