//Remainder calculation
package Numbers;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Dividend:");
        int dividend = obj.nextInt();
        System.out.print("Enter Divisor:");
        int divisor = obj.nextInt();
        System.out.print("Remainder is "+(dividend%divisor));
	}

}
