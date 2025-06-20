public class Q8 {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }

    /**
     * This method finds the lexicographically smallest and largest substrings of length k in the given string s.
     *
     * @param s The input string.
     * @param k The length of the substrings to consider.
     * @return A string containing the smallest and largest substrings, separated by a newline.
     */
   public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        
        String largest = s.substring(0,k);
        for(int i = 1; i<=s.length() - k; i++){
            String substr = s.substring(i, i + k);
            if(substr.compareTo(smallest)< 0 ){
                smallest = substr;
            }
            if(substr.compareTo(largest)> 0 ){
                largest = substr;
            }
        }
        return smallest + "\n" + largest;
    }
}