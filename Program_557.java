class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == ' ') {
                reverse(arr, i, j - 1);
                i = j + 1;
            }
        }
        reverse(arr, i, arr.length - 1);
        return new String(arr);
    }

    public void reverse(char[] rev, int i, int j) {
        while (i <= j) {
            char temp = rev[i];
            rev[i] = rev[j];
            rev[j] = temp;
            i++;
            j--;
        }
    }
}


public class Program_557 {
    public static void main(String... args) {
        Solution s = new Solution();
        System.out.println(s.reverseWords("You are"));
    }
}
