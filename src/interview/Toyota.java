package interview;


/*
Asteroid Mining Programming challenge description:

You are starting an asteroid mining mission with a single harvester robot. 
That robot is capable of mining one gram of mineral per day. 
It also has the ability to clone itself by constructing another harvester robot. 
That new robot becomes available for use the next day 
and can be involved in the mining process 
or can be used to construct yet another robot.

Each day you will decide what you want each robot in your fleet to do. 
They can either mine one gram of mineral or spend the day constructing 
another robot.

Write a program to compute a minimum number of days required 
to mine nn grams of mineral.

Note that you can mine more mineral than required. 
Just ensure that you spent the minimum possible number of days to have 
the necessary amount of mineral mined.

Input:
A single integer number nn, which is the number of grams of mineral to be mined. 
The value of nn will be between 1 and 1000000 (inclusive). For example:
 */


public class Toyota {
	
	public static void main(String[] args) {
		System.out.println(miningRobots(3));
		
	}

		  
	public static int miningRobots(int minerals) {

		int numberofRobots = 0;
		int numberOfDays = 0;
		int result = 0;

		if (minerals == 1) {
			result = 1;
		}else {

			//Number of robots needed
			while(minerals > 1) {
				minerals = minerals/2;
				numberofRobots++;
			}

			//Number of days needed to build robots
			int count = 0;
			int temp = numberofRobots;
			while(temp > 1) {
				temp /= 2;
				count++;
			}
			result = numberofRobots + count;
		}

		return result;

	}

}
