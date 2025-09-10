public class RightTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the right triangle

        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}