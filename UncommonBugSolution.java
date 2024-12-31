public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Iteration: " + i);
            i++;
            if (i == 5) {
                // Correct way to exit the loop: use a break statement
                break;
            }
        }
        System.out.println("Loop finished.");
    }
}
