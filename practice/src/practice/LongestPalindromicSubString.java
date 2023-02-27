package practice;

public class LongestPalindromicSubString {

	public static void main(String[] args) {

        String str = "renunavassss";
        System.out.println("len is: " + longestPalSubstr(str));

	}
	static void printSubs(
	        String s, int low, int high)
	    {
	        System.out.println(
	            s.substring(low, high+1));
	    }
	static int longestPalSubstr(String s)
    {
        // get length of input string
        int n = s.length();

        boolean table[][] = new boolean[n][n];
 
        // All substrings of length 1 are palindromes
        int maxlen = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
 
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxlen = 2;
            }
        }
 
        // k is length of substring
        for (int k = 3; k <= n; ++k) {
 
            for (int i = 0; i < n - k + 1; ++i) {
        
                // starting index i and length k
                int j = i + k - 1;
 
                if (table[i + 1][j - 1]
                    && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
 
                    if (k > maxlen) {
                        start = i;
                        maxlen = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubs(s, start,
                    start + maxlen - 1);
 
        // return length of LongestPalindromeSubstring
        return maxlen;
    }
}
