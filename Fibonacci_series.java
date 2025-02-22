import java.util.*;
public class Fibonacci{

	public static void main(String [] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number of Term to print Fibonacci Series " );
		int N = sc.nextInt();

		int Num1 = 1;
		int Num2 = 1;

	 System.out.println("Fibonacci Series");
         System.out.print(Num1 + " " + Num2 + " ");

         for(int i = 3; i <= N; i++){


		int Nextterm = Num1 + Num2;
		System.out.print(Nextterm+" ");

		Num1 = Num2;
                Num2 = Nextterm;

		
		}

	}

}