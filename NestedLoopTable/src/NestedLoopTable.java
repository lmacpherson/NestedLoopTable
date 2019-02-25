
public class NestedLoopTable {	//operation class
	int firstNum,	
		lastNum, 
		nextNum;
	
	public void setNums(int first, int last) {
		firstNum = first;
		lastNum = last;
		nextNum = first;
	}
	
	public void printPyramid() {
		for (int row = firstNum; row <= lastNum; row++) {	//for loop prints the rows
			for (int col = firstNum; col <= nextNum; col++) {
				System.out.print(col + " ");
			} //end nested for loop
			nextNum++;
			
			System.out.println();
		} //end first for loop
	} //end printPyramid()
} //end NestedLoopTable
