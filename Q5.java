/*
Que: we are supposed to created a matrix class inside which we are having a matrix. 
    it provides methods as add, multiply and display.we need to create two matrix objects.
    and perform add and display and similary we need to multiply and call the display method.
*/
import java.util.Scanner;

class  matrix{
    int a, b;
    int[][] mat;
    matrix(int a, int b){
        this.a = a;
        this.b = b;
        mat = new int[a][b];
    }
    Scanner sc = new Scanner(System.in);
    void InputMatrix(Scanner sc){
        for (int i = 0; i<a; i++){
            for (int  j= 0; j<b; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    matrix add(matrix m){
        matrix result = new matrix(a, b);// this will include the matrix with values of a and b from the original matrix.
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b;j++){
                result.mat [i][j]= this.mat[i][j] + m.mat[i][j];// this is the addition b/w matrices mat and m;
            }
        }
        return result;

    }
    matrix multiply(matrix m){
        //dot product:
        matrix result = new matrix(this.a, m.b);// usoing thi.a and m.b is because if we take this.a and this.b as the size of this.mat matrix and m.a and m.b as the sizes of m.mat matrix, then acc to the matrix multiplication, this.a*m.b will be the most significant acc to the rule (a1,b1)*(a2,b2) = a1*b2 where b1 and a2 are same.
        for(int i = 0; i<this.a;i++){//loop over the rows of first/original matrix.
            for(int j = 0; j<m.b;j++){//loop over the columns of second matrix.
                result.mat[i][j] = 0;// we do this to replace the old value inside the result... so that when we start off for a next number, we get a fresh empty matrix.
                for(int k = 0; k<this.b; k++){//loop over columns of the original matrix.
                    result.mat[i][j] += this.mat[i][k] *m.mat[k][j]; // this multiplies the [i][k] element in first row of original with [k][j] element in the first column of other and adds the result in the result and increments the value.
                }
            }
        }
        return result;
    }
    void display(){
        for(int i = 0; i<a;i++){
            for(int j = 0; j<b; j++){
                System.out.print(mat[i][j]+" ");
                System.out.println();
            }
        }
    }
}
public class Q5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    matrix m1 = new matrix(2, 3);
    matrix m2 = new matrix(3,2);
    m1.InputMatrix(sc);
    m2.InputMatrix(sc);

    matrix sum = m1.add(m2);
    System.out.println("Sum: ");
    sum.display();
    
    matrix product = m2.multiply(m2);
    System.out.println("Product: ");
    product.display();
    }

}    