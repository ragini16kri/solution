import java.util.*;
class guess_number{
	public static void main(String str[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("\n\n Guess the number  ");
		System.out.print("\n-------------------\n");
		System.out.print("\n Rule  ");
		System.out.print("\n 1) You have to guess a number to match your number with computer from 1-100");
		System.out.print("\n 2) You have 3 chance to guess correct number ");
		
		System.out.print("\n\n Name  = ");
		String name=scan.nextLine();
		char op='y';
		while(op=='Y' || op=='y')
		{
			int score=0;
			int attempt=0;
			
			while(attempt<3)
			{
				Random random =new Random();
				int n1=random.nextInt(100);
				
				System.out.print("\n\n Guess your number  = ");
				int n2=scan.nextInt();
				
				System.out.print("\n\n Computer number is = "+n1);
				System.out.print("\n Your number is = "+n2);
				
				if(n1==n2){
					System.out.print("\n\n Your number has matched");
					score++;
				}
				else{
					System.out.print("\n\n Your number has not matched");
				}
				attempt++;
			}
			System.out.print("\n\n\n"+name+" , You have scored "+score+".");
			System.out.print("\n\n Do You want to play Again ? y or n > ");
			op=scan.next().charAt(0);
		}
	}
}
