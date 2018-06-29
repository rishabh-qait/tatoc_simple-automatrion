package newpackage;
import java.util.Random;
import java.util.Scanner;
public class Dice {
	int sides=0;
	
	
	/*public static int getRandomNumber( ) 
	{
		rn = random.nextInt(6);
	return rn;
	}*/
	
	
	
	
	
	public Dice(int sides1)
	{
		sides=sides1;
		
		Random random = new Random() ;
		int	rn = random.nextInt(sides1);	
		
		
		if(sides==6) {
			System.out.println(" You have choosen a 6 sided dice  and your random roll is");
		System.out.println(rn);
			
		}
		if(sides==4) {
			System.out.println(" You have choosen a 4 sided dice  and your random roll is");
			System.out.println(rn);
		}
		
		if(sides==2) {
			System.out.println(" You have choosen a 2 sided dice and your random roll is");
		if(rn==0)
		{
			String a =Integer.toString(rn);
			a="Heads";
			System.out.println(a);
		}
		if(rn==1)
		{
			String a =Integer.toString(rn);
			a="Tails";
			System.out.println(a);
	
		}
			
		}
		

	}
	
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("First tell me how many times do you want to roll the dice");
		int nu=scanner.nextInt();
		System.out.println("How many sides does your dice contains."
				+ " It may be either 6sided"
				+" 4sided "
				+" 2sided");
		
		int no = scanner.nextInt();
		if(no!=2 ||no!=4||no!=6 ) 
		{
		System.out.println("You can only choose either of 2 sided dice or 4 sided dice or 6 sided dice");

		}
		for(int i=0;i<nu;i++) {
		Dice dice1= new Dice(no);
		}
	}

	
}
