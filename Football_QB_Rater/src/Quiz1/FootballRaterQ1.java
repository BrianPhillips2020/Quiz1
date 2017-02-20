package Quiz1;

import java.util.Scanner;

public class FootballRaterQ1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Pass Attempts: ");
		int attempts = input.nextInt();

		System.out.print("Completions: ");
		int completions = input.nextInt();

		System.out.print("Passing Yards: ");
		int yards = input.nextInt();

		System.out.print("Touchdown Passes: ");
		int touchdowns = input.nextInt();

		System.out.print("Interceptions: ");
		int interceptions = input.nextInt();
		
		input.close();

		double a = ((completions / attempts) - 0.3) * 5;
		double b = ((yards / attempts) - 3) * 0.25;
		double c = (touchdowns / attempts) * 20;
		double d = 2.375 - ((interceptions / attempts) * 25);

		double PR = ((a + b + c + d) / 6) * 100;

		System.out.println("Passer Rating = " + PR);

	}
}
