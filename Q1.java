package DSA_JAVA_DPP;
//// Homework: return the last occurance of a character in a sequence.
    
public class Q1 {
    public static void main(String[] args) {
        
    }
    int returnLastCharRec(String str, char c, int i){
        //here i = str.length()-1;
        if(i < 0||i>= str.length())return -1;
        if(str.charAt(i) == c)return i;
        int index = returnLastCharRec(str, c, i-1);
        return index;
    }
    
}
