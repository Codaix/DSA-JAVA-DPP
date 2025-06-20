import java.io.*;

class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
    int n = s.length();
        for(int i = 1; i<n; i++){
            int originalDiff = Math.abs(s.charAt(i)-s.charAt(i-1));
            int reverseDiff  = Math.abs(s.charAt(n-i) - s.charAt(n-i-1));
            if(originalDiff != reverseDiff){
                return "Not Funny";
            }
        }
        return "Funny";
    // Write your code here

    }
}
public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
