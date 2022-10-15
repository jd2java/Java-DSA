class Solution_2000 {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        String result = "";
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == ch) {
                String subStr = word.substring(i, j + 1);
                result= reverse(subStr) + word.substring(j+1) ;
                break;
            } else {
                result = word;
            }
        }
        return result;
    }

    public static StringBuilder reverse(String str) {
        return new StringBuilder(str).reverse();
    }
}


public class Program_2000 {
    public static void main(String... args) {
        Solution_2000 s = new Solution_2000();
        System.out.println(s.reversePrefix("abcd", 'z'));
    }
}
