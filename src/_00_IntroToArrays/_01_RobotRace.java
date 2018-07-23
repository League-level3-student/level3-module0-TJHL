package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int numRobots = 5;
	static boolean isCircularTrack = true;

	// 1. make a main method
	public static void main(String[] args) {
		Robot[] bot = new Robot[numRobots];
		Random distance = new Random();

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		if (isCircularTrack == false) {
			for (int i = 0; i < bot.length; i++) {
				bot[i] = new Robot(i * 100 + 200, 550);
			}
		}
		if (isCircularTrack == true) {
			for (int i = 0; i < bot.length; i++) {
				bot[i] = new Robot(200, 350);
			}

			// 4. make each robot start at the bottom of the screen, side by side, facing up

			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			boolean raceOver = false;
			while (!raceOver) {
				if (isCircularTrack == false) {
					for (int i = 0; i < bot.length; i++) {
						bot[i].move(distance.nextInt(50));
						if (bot[i].getY() <= 0) {
							raceOver = true;
							System.out.println(
									"BOT " + bot[i] + " is the winner!!! Party Comencing MF, booting up SkyNet!");
						}
					}
				}
				if (isCircularTrack == true) {
					for (int i = 0; i < bot.length; i++) {
						for (int j = 0; j < distance.nextInt(50); j++) {
							bot[i].move(1);
							bot[i].turn(1);
						}
						if (bot[i].getY() >= 350 && bot[i].getX() == 200) {
							raceOver = true;
							System.out.println(
									"BOT " + bot[i] + " is the winner!!! Party Comencing MF, booting up SkyNet!");
						}
					}
				}

			}
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.

			// 7. declare that robot the winner and throw it a party!

			// 8. try different races with different amounts of robots.

			// 9. make the robots race around a circular track.

		}
	}
}