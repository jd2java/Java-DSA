// https://leetcode.com/problems/flipping-an-image/
class Solution_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int j = 0;
            int k = image.length - 1;
            while (j < k) {
                int temp = image[i][j];
                image[i][j++] = image[i][k];
                image[i][k--] = temp;
            }
            for (j = 0; j < image.length; j++) {
                image[i][j] = image[i][j] == 1 ? 0 : 1;
            }
        }
        return image;
    }
}

class Program_832 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        Solution_832 s = new Solution_832();
        int[][] result = s.flipAndInvertImage(arr);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
