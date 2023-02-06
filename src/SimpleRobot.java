
/**
 * @author N'ZO LAGOU
 *
 *         Exercise 3 : Charge Instructions Write a static method charge that
 *         causes the robot to drive forwards until it has gone either maxDist
 *         squares or until it hits a wall, whichever is sooner.
 *
 *         You may call the method blocked() on the robot; blocked() returns
 *         true if there is a wall in front of the robot, and false otherwise.
 */
public class SimpleRobot {

	// le mur se trouve à la position 10
	private static int mur = 5;

	public static void charge(SimpleRobot r, int maxDist) {
		// you write this part
		while (r.getForward() != maxDist && !blocked(r)) {
			r.forward();
			System.out.println(r); // Affiche la position à chaque fois
		}
	}

	public static void main(String args[]) {
		SimpleRobot r = new SimpleRobot();
		r.forward();
		r.right();
		charge(r, 3);
	}

	private static boolean blocked(SimpleRobot robot) {

		return robot.getForward() == mur;
	}
}
