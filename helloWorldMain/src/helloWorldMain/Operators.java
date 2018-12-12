package helloWorldMain;

public class Operators {

		public static void main(String[] args) {
			int num1 = 4;
			int num2 = 5;		

			int sum = (num1 + num2);	
			
			iteration();
		}
		
		public void Operators(int num1,int num2) 
		{
			int sum = num1 + num2;
			System.out.println(sum);
		}
		
		
		public int conditionals(int num1, int num2, boolean thing)
		{
			if(num1 == 0)
			{
				return num2;
			}
			if(num2 == 0)
			{
				return num1;
			}
					
			if(thing == true)
			{
				return num1 + num2;
			}
			else 
			{
				return num1 * num2;
			}
		}
		
		public void iteration()
		{
			for(int i = 0; i < 5; i ++)
			{
				System.out.println(conditionals(i,2,true));
			}
		}
		
		public void arrays()
		{
			int[] listofnumbers = {1,2,3,4,5,6,7,8,9,10};
			
			for(int i = 0; i < 10; i++)
			{
				System.out.println(conditionals(listofnumbers));
			}
		}
}
