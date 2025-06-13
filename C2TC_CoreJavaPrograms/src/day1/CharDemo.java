package day1;

public class CharDemo {

	public static void main(String[] args) {
		char ch ='a';
		System.out.println(ch);
		
		char ch1 =65;
		System.out.println(ch1);
		
		char var1 ='\u00A7'; //unicode 
		System.out.println(var1);
		
		char var2 ='\u20a7'; //unicode 
		System.out.println(var2);

		int a = 'A';
		System.out.println(a);
		
		char[] arr = {66,'b','c'};   //char array
		for(char c:arr)
		{
			System.out.print(c+" ");
		}

	}

}
