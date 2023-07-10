// CSE 110: Class 76370 / Tuesday 12-12:50
// Assignment : Assignment 6
// Author : Stephen Austria 1220159551
// Description : Ten Array Methods Program


public class Assignment06 {

	public static void main(String[] args) {
		// Write any code here that you may wish to test your methods defined below.
		
		// 1)
		int[] myArray = {1, 22, 333, 400, 5005, 9};
		printArray(myArray, ", ");
		
		// 2)
		System.out.print(getFirst(myArray));
		
		// 3)
		System.out.print(getLast(myArray));
		
		// 4)
		int[] myArray1 = getAllButFirst(myArray);
		for(int i = 0; i < myArray1.length; i++) {
			System.out.print(myArray1[i] + " ");
		}
		
		// 5)
		System.out.print(getIndexOfMin(myArray));
		
		// 6)
		System.out.print(getIndexOfMax(myArray));
		
		// 7)
		int[] myArray2 = (swapByIndex(myArray, 1, 4));
		for(int i = 0; i < myArray2.length; i++) {
			System.out.print(myArray2[i] + " ");
		}
		
		// 8)
		int[] myArray3 = (removeAtIndex(myArray, 3));
		for(int i = 0; i < myArray3.length; i++) {
			System.out.print(myArray3[i] + " ");
		}
		
		// 9)
		int[] myArray4 = (insertAtIndex(myArray, 2, 777));
		for(int i = 0; i < myArray4.length; i++) {
			System.out.print(myArray4[i] + " ");
		}
		
		// 10)
		System.out.print(isSorted(myArray));
		
	    }
	
	    
		// 1) Print Array Method
		public static void printArray(int[] myArray, String a) {
			for (int i = 0; i < myArray.length; i++) {
				
					System.out.print(myArray[i] + a);
			}
			
		}
		
	    // 2) Get First Array Method
		public static int getFirst(int[] myArray) {
			int x;
			x = myArray[0];
			return x;
		}
		
	    
	    
	    // 3) Get Last Array Method
		public static int getLast(int[] myArray) {
			int x;
			x = myArray[myArray.length - 1];
			return x;
		}
	    
	    
	    // 4) Get All But First Array Method 
		public static int[] getAllButFirst(int[] myArray) {
			int x = 0;
			int[] a = new int[myArray.length - 1];
			for(int i = 1; i < myArray.length; i++) {
				a[x++] = myArray[i];
				
			}
			return a;
			
			
		}
		
		
	    // 5) Get Index Of Min Array Method 
		public static int getIndexOfMin(int[] myArray) {
			int minIndex = 0;
			int min = myArray[0];
			for (int i = 1; i < myArray.length; i++) {
				if(myArray[i] < min) {
					min = myArray[i];
					minIndex = i;
				}
			}
			return minIndex;
		}
	    
	    
	    // 6) Get Index of Max Array Method 
		public static int getIndexOfMax(int[] myArray) {
			int maxIndex = 0;
			int max = myArray[0];
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i] > max) {
					max = myArray[i];
					maxIndex = i;
				}
			}
			return maxIndex;
		}
	    
	    
	    // 7) Swap By Index Array Method
	    public static int[] swapByIndex(int[] myArray, int x, int y) {
	    	int[] a = new int[myArray.length];
	    	int swap = myArray[x];
	    	myArray[x] = myArray[y];
	    	myArray[y] = swap;
	    	for(int i = 0; i < a.length; i++) {
	    		a[i] = myArray[i];
	    	}
	    	return a;
	    }
	    
	    // 8) Remove At Index Array Method
	    public static int[] removeAtIndex(int[] myArray, int x) {
	    	int[] a = new int[myArray.length - 1];
	    	int j = 0;
	    	for(int i = 0; i < myArray.length; i++) {
	    		if(myArray[i] != myArray[x]) {
	    			a[j++] = myArray[i];
	    		}
	    	}
	    	return a;
	    }
	    
	    
	    // 9) Insert At Index Array Method
	    public static int[] insertAtIndex(int[] myArray, int x, int y) {
	    	int[] a = new int[myArray.length + 1]; 
	    	int j = 0;
	    	for( int i = 0; i < x; i++) {
	    		a[j++] = myArray[i];
	    	}
	    	a[j++] = y;
	    	for(int i = x; i < myArray.length; i++) {
	    		a[j++] = myArray[i];
	    	}
	    	return a;
	    }
	    
	    // 10) Is Sorted Array Method
	    public static boolean isSorted(int[] myArray) {
	    	boolean a = true;
	    	for(int i = 0; i < myArray.length; i++) {
	    		if(myArray[i] > myArray[i + 1]) {
	    			a = false;
	    			break;
	    		}
	    	}
	    	return a;
	    }
	    

}
