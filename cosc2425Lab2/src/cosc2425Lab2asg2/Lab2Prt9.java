package cosc2425Lab2asg2;

public class Lab2Prt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width1 = 12.43;
		double width2 = 30.62;
		double length1 = 7.99;
		double length2 = 41.51;
		double area1 = width1*length1;
		double area2 = width2*length2;
		
		// here I calculated the areas of two rectangles by declaring a double variable for each of the area since
		// the width and length of each of the rectangle was in double
		
		System.out.println("Given the width and length of room1 as: " + width1 + ", " + length1);
		System.out.println("Given the width and length of room2 as: " + width2 + ", " + length2);
		System.out.println( "the total floor-space area calculates to: " + (area1 + area2));
		
		// here in this print statement we just used the (+) operator to add the two areas which we found earlier because (+) operator 
		// adds any two or more  numeric variable as int, double, float etc


	}

}
