package week1.day1.assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {

        int range = 8, firstNum = 0,  secNum= 1, sumOfTwo;
        System.out.print(firstNum);
        for (int i = 1; i <= range; ++i)
        {
            sumOfTwo= firstNum + secNum;
            firstNum = secNum;
            secNum = sumOfTwo;
            System.out.println(sumOfTwo);
}
	}
}

//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number
		
		// Iterate from 1 to the range
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum