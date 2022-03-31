package cosc2425Lab2asg2;

public class Lab2Prt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23;
		double cost= 57.65;
		double unitPrice;
		unitPrice = cost/num;
		
		// here we are dividing the total cost by the total number of items in order to get the unit cost of that item
		// here we also assigned the unitPrice variable as double since a division of double number by int number will generate another double
		
		System.out.println("Given the number of units: " + num);
		System.out.println("value of cost: " + cost);
		System.out.println("value of unit price: " + unitPrice); 
		
	}

}
