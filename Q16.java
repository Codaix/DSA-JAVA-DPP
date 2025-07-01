import java.util.*;

class Speed{
public boolean kokoSpeed(long[] pile, long k, int h) {
    long bananaCount = 0;
    for(int i = 0; i<pile.length; i++){
            bananaCount += (pile[i]+k-1)/k;
        }
    if(bananaCount<=h){
        return true;
    }
        return false;
    }
}

public class Q16 {
    Scanner sc= new Scanner(System.in);
    int h = sc.nextInt();
    public static int max = (int) 1e9;
    long mid;
    long pile[] = new long [max];
    int high = max;
    int low = 1;
    Speed obj = new Speed();
    
    void process(){
        while (high-low > 1){
            mid = (high + low)/2;
            if(obj.kokoSpeed(pile, mid, h)){
                high = (int) mid;
            }
            else{
                low = (int) mid + 1;
            }
        }
        if(obj.kokoSpeed(pile, high, h)){
            System.out.println("Speed =" + high);
        }
        else{
            System.out.println("Speed = " + low);
        }
        sc.close();
    }
}
