import java.util.*;

class query{
    void nums(int a, int b, int n){
        int result = a;
        for(int i = 0; i<n; i++){
            result += (int)(Math.pow(2,i)*b);
            System.out.print(result+" ");
        }
        System.out.println();
    }
    
}
public class Q6{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        query  obj= new query();
        
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            obj.nums(a,b,n);
        }
        sc.close();
    }
}
