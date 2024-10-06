/** Class Main which is used as the driver class of the program.
 * View the README for information on how to run the project
 * and information on the maintenance done to the project.
     */
    public class Main {

        /** Method Main used as the driver function for the program.
             * Instantiates the class NumStack as an instance variable and calls its functions
             * @param args not used in method
             */
        public static void main(String[] args) {
            
            NumStack numstack = new NumStack();
            numstack.addNumbersToStack();
            numstack.displayNumbers();
        }
    
    }
    