import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
	    
		Scanner scn = new Scanner(System.in);
 
		int A = scn.nextInt();
		int B = scn.nextInt();
 
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
        
    }

}
