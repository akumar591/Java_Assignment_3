import java.util.*;
public class Hcf_lcm {

	public static int calculateHCF(int Num1,int Num2){
		int HCF = 0;
		for(int i = 2; i <= Num1 && i <= Num2; i++){
			if( Num1 % i == 0 && Num2 % i == 0 ){
			   
 				HCF = i;
			}

		}
		return HCF;
	}
	public static int calculateLCM(int Num1, int Num2, int HCF){

			return(Num1*Num2)/HCF;
	}

	public static void main(String [] args){

		Scanner sc = new Scanner (System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
        
		int HCF = calculateHCF(Num1, Num2);
		int lcm = calculateLCM(Num1, Num2, HCF);
	
	System.out.println(HCF);
	System.out.println(lcm);


	}


}