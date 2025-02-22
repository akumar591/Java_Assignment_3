import java.util.*;
public class Factors_of_no{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		System.out.println("Factors of "+Num+" are:");

		for(int i = 1; i <= Num; i++){

			if(Num % i == 0){
			  
				System.out.println(i);
			}

		}


	}


}