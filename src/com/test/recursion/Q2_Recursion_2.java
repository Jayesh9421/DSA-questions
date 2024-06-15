package com.test.recursion;

public class Q2_Recursion_2 {
	
	public static void main(String[] args) {
		
		
		printNumber(10);
	}
	
	public static void printNumber(int num) {
		
		if( num == 1 ) {
			
			System.out.println(num);
//			return;
		}else {
			
			printNumber(num-1);
			System.out.println(num);
		}
	}
	
	
}


// visual representation
//printNumber(10)
//printNumber(9)
//  printNumber(8)
//    printNumber(7)
//      printNumber(6)
//        printNumber(5)
//          printNumber(4)
//            printNumber(3)
//              printNumber(2)
//                printNumber(1)

                  // Base case: prints 1
                
				// prints 2
              // prints 3
            // prints 4
          // prints 5
        // prints 6
      // prints 7
    // prints 8
  // prints 9
// prints 10
