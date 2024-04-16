import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
<<<<<<< HEAD
		Scanner in = new Scanner(System.in);
 
		int A = in.nextInt();
		int B = in.nextInt();
        
		in.close();
=======
		Scanner scn = new Scanner(System.in);
 
		int A = scn.nextInt();
		int B = scn.nextInt();
>>>>>>> d19002a5a71aa0dcc487d1e7f973e04be7924694
 
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
        
    }

}
