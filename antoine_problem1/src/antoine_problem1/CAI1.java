package antoine_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	       // declare SecureRandom object
	       SecureRandom rand = new SecureRandom();

	       // generate two signle digit random numbers
	       int first = rand.nextInt(10);
	       int second = rand.nextInt(10);

	       // show the question
	       int ans = first * second;
	       System.out.println("How much is " + first + " times " + second + "? ");

	       // start a infinite loop
	       while (true) {

	           // ask user for input
	           System.out.print("Ans. ");
	           int user = sc.nextInt();

	           // check answer
	           if (user == ans) {
	               // show congratulate user for right answer
	               System.out.println();
	               System.out.println("Very good!");
	               break;
	           }

	           // ask another another answer when first answer is wrong
	           System.out.println();
	           System.out.println("No. Please try again.");
	       }

	       sc.close();

	   }

	}

