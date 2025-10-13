public class PascalsTrianglePattern {
    public static void main(String[] args) {
        int numOfRows = 6;
        int[][] triangle = new int[numOfRows][];
        for (int i = 0; i < numOfRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        for (int i = 0; i < numOfRows; i++) {
            for (int s = 0; s < numOfRows - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}