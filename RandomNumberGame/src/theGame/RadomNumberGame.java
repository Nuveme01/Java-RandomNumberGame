package theGame;
import java.util.Scanner;
import java.util.Random;

public class RadomNumberGame {
	public static void main(String[] args) {
		int a, i;
		
		Random g = new Random();
		
		a = g.nextInt(10);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Test your luck by guessing the right number 0..9");
		
		int b = scan.nextInt();
		
		if(b == a) {
			System.out.println("Holly molly, first try, congratulations!");
		}
		else {
			System.out.println("Yikes, unfortunately, thats the wrong number");
			for (i = 4; i != 0; i--) {
				b = scan.nextInt();
				
				if(b == a) {
					System.out.println("Congratulations you win!");
					i = 1;
				}
				else {
					System.out.println("Yikes, unfortunately, thats the wrong number");
					if(i == 1) {
						System.out.println("This is the correct number: " +a);
					}
				}
			}
		}
		
		scan.close();
	}
}
