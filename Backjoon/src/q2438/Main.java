package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		
		for(int i=1; i<=inp; i++) {			
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}