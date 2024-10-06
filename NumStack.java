import java.util.Stack;
import java.util.Scanner;

/** Class NumStack that is creating a Linked List from user input.
      * numberStack private: A stack of integer values, created by user input
      * userinput private: User defined input for the values that go into the stack
      * numberStackSize private: The size of the stack, initially set at 0, but defined by the user
      * addNumbersToStack Method to gather user input and add numbers to the stack
      * displayNumbers Method to print the sorted stack.
      */
public class NumStack {
     private Stack<Integer> numberStack = new Stack<>(); // reusing the Stack collection to create a new Stack of integers, functionality changed from LinkedList to stack
     private Scanner userinput = new Scanner(System.in); // reusing the scanner collection to get the users input for the stack
     private int numberStackSize = 0; 
     
     /** Method addNumbersToStack used to gather user input,
           * 1. To get the total number of entries for the stack
           * 2. To collect the data entries from user input for the stack, in integer value
           * 3. The stack will be sorted in ascending order once all the entries have been collected
           */
     public void addNumbersToStack() {
          
          System.out.println("Enter the number of elements you want to add to the stack: ");
          numberStackSize = userinput.nextInt(); // stores the number from input to determine total number of entries, also reuses the scanner collection to go to the next input.
          
          for (int i = 0; i < numberStackSize; i++) {  // using the number from the first input to get total # of elements to be added to the stack.
               System.out.print("Enter number " + (i + 1) + ": ");
               numberStack.push(userinput.nextInt()); // reuses the Stack collection to add(push) the input to the stack, functionality changed from LinkedList to stack
               numberStack.sort(null); // reuses the Stack collection to sort the stack in ascending order
          }
     }
     
     /** Method displayNumbers used to print the sorted stack.
      * Iterates through the stack one element at a time and displays
      * them on the console.
     */
     public void displayNumbers() {
          
          System.out.println("The sorted stack is: ");
          for (Integer number : numberStack) {
               System.out.print(number + " ");
          }
     }
}