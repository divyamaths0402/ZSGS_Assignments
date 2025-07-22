class RPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (
                    j == 0 ||                                      // Left vertical line
                    (i == 0 && j < cols) ||                        // Top horizontal
                    (i == 2 && j < cols) ||                        // Middle horizontal
                    (i == 1 && j==cols-1) ||                   // Top right
                    (i == 3 && j == cols-2) || (i == 4 && j ==cols-1)       // Diagonal leg
                ) {
                    System.out.print("R ");
                } else {
                    System.out.print("  "); // space to align Rs
                }
            }                                   
            System.out.println();
        }
    }
}
