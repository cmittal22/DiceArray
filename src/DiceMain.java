
public class DiceMain {

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		for(int i = 0;   i<1000; i++)
			{
			System.out.println(dice1.roll() + dice2.roll());
			}
		int count[] = {2,3,4,5,6,7,8,9,10,11,12};
		

		
	}

}
