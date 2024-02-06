
import java.util.Scanner;

public class CS1400 {
    public static void main(String[] args) {
        // ============================================================
        // Declare some variables. You might need
        // 
        // - an integer for the array size,
        // - an integer for the exchange element, and
        // - a scanner object for requesting input from System.in

    	int arraySize = 0;
    	int temp = 0;
    	
    	Scanner input = new Scanner(System.in);
        

        // ============================================================
        // Request array size from the user
        // 
        System.out.println("How many elements in the array: ");
        // - Request an integer from the user save it
        // 
        arraySize = input.nextInt();
        
        // Declare a int array by the size you received above

        int[] array = new int[arraySize];
        

        // ============================================================
        // Fill in the Array

        for (int i = 0; i < array.length; i++) {        
            System.out.println("Please enter the next value: ");
            array[i] = input.nextInt();
        }
        
        System.out.println();
        // ============================================================
        // Sort the array's elements in increasing order
        // 
        // Here we will use Selection Sort like algorithm.

        // The first for loop iterates all elements as element_i
        
                // Compare ith value and jth value,
                // 
                // - If array[i] >= array[j], swap these two values
                //   
                // For example, let array[i] = 10, array[j] = 20, to swap
                // array[i] and array[j] means array[i] will become 20
                // and array[j] will have 10.
                // 
                // To swap the values in two position, you would need an
                // extra variable to temporarily hold the value. For example,
                // 
                //     temp = array[i];
                //     array[i] = array[j];
                //     array[j] = temp;
                // 
                // -->
        
        for (int i = 0; i < array.length; i++) {

            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            if (i != min) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }


        // ============================================================
        // Display the sorted array 
        // -->
        System.out.println("The array after sorting: ");
        
        for (int i = 0; i < array.length; i++) {
        	if (i == array.length - 1) {
        		System.out.print(array[i]);
        	}
        	else {
        		System.out.print(array[i] + ", ");
        	}
        }
        
        System.out.println();
      
        
        // ============================================================
        // Remove the minimum in the sorted array
        // 
        // As our array is sorted in the increasing order, to remove the
        // minimum, we just remove the first element in the array. It is like
        // shifting the array to the left by one element.
        
        // Because we are doing shifting, in each iteration, we use two
        // values, one at index i, the other at index i+1.
        // To prevent us from going over the boundary of array, the following
        // offset variable should be set as the correct value.
        int offset = 0;
        
        // In this for loop, we move the element at i + 1 to the position i
        
        // Move array[i + 1] to array[i]

        // The last element will be set as zero. Remember the greatest index
        // should be array.length - 1.
        // -->
        
        for (int i = 0; i < array.length - 1; i++) {
    		array[i] = array[i + 1];
    	}
    
        array[array.length - 1] = offset;
        
        
        // ============================================================
        // Display the Array after removing the first element
        // -->
        
        System.out.println("The array with the minimum removed: ");
        
        for (int i = 0; i < array.length; i++) {
        	if (i == array.length - 1) {
        		System.out.print(array[i]);
        	}
        	else {
        		System.out.print(array[i] + ", ");
        	}
        }
        
        System.out.println();
        System.out.println();
        
        // ============================================================
        // Search for an element and remove it

     // Ask the user which element to remove
        System.out.println("Enter the value to search and remove: ");
        // Use your Scanner and the int variable valueToRemove to get a value for search
        //-->
        
        int valueToRemove = input.nextInt();

        // To search, we can iterate all values, record the index of target (t),
        // and then shift to the left values from t to the end.
        boolean isFound = false;
        
        for (int i = 0; i < array.length; i++) {
        	if (array[i] == valueToRemove) {
        		isFound = true;
        		array[i] = 0;
        		for (int j = i; j < array.length - 1; j++) {
        			array[j] = array[j + 1];
        		}
        		break;
        	}
        	else if (i == array.length) {
        		array[i] = 0;
        	}
        	else {
        		isFound = false;
        	}
        }
   
            // if ith element == valueToRemove,
            //     Set a flag isFound
            // 
            // if isFound,
            //     if i + 1 is available
            //         move element i + 1 to index i
            //     if i + 1 is not available
            //         set element i as zero

        if (isFound) {
            System.out.println("Search element found");
        }
        else {
            System.out.println("Search element NOT found");   
        }

        // ============================================================
        // Display the final array
        // -->
        
        System.out.println("The final array: ");
        
        for (int i = 0; i < array.length; i++) {
        	if (i == array.length - 1) {
        		System.out.print(array[i]);
        	}
        	else {
        		System.out.print(array[i] + ", ");
        	}
        }
        
        System.out.println();
        
        input.close();
    }
}