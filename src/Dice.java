import java.util.Random;

public class Dice 
{
	//create fields
	//fields always get private acess
	
	private int numRolls = 0;
	
	public int roll ()
	{
		Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		numRolls++;
		return num;
	}
	
	
	public int getnumRolls()
	{
		
		return numRolls; 
	}
	
	public void reset()
	{
		numRolls = 0;
	}
}


