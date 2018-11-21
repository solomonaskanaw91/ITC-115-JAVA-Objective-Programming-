/***************************************************************************
 *  Programmer:     KingSolomonII                                          *
 *  Method:         'isSorted'                                             *
 *  Input Data:     Two double type array values                           *
 *  Output Data:    Returns true for listsorted1,the sorted list array     *
 *                  Returns false for listsorted2, the unsorted list array *                                                                    
 ***************************************************************************/
 
package isSorted;
import java.util.*;


public class isSorted {

  public static void main(String[] args) {

// Declare variables for initialize the arrays listsort1 and listsort2 as double data type and use the given data types. 

    double[] listsort1 = {16.1, 12.3, 22.3, 14.4};//listsort1 is not the sorted array
    double[] listsort2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};//listsort2 is the sorted array 

// Make a call to isSorted function passing the arrary as input parameter. 
// Use a condition statement and display the result.
// Use a function to call to test two listsort1 for sort or not sort.

    if (isSorted(listsort1)) System.out.println("listsort1 is sorted");
    else System.out.println("listsort1 is not sorted");

// Use a function to call to test two list2 for sort or not sort.

    if (isSorted(listsort2)) System.out.println("list2 is sorted");
    else System.out.println("list2 is not sorted");
  }

// Use a function that returns true if list is sorted else false.
// Write the function definition.

  public static boolean isSorted(double[] masterarr) {
// Loop repeats until the end of array

    for (int i = 0; i < masterarr.length - 1; i++) {
      if (masterarr[i + 1] < masterarr[i]) {
        return false;
      }
    }
       return true;
  }
}
