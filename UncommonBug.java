public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Iteration: " + i);
            i++;
            if (i == 5) {
                // Simulate an uncommon error:  interrupting the loop
                // but not using a standard exception handling mechanism.
                System.exit(0); 
            }
        }
        System.out.println("Loop finished."); // this line won't be reached
    }
}