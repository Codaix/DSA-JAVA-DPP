public class SwapAndReferenceDemo {

    public static void swapPrimitives(int a, int b) {
        System.out.println("Inside swapPrimitives - Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swapPrimitives - After swap: a = " + a + ", b = " + b);
    }

    public static void swapArray(int[] arr) {
        System.out.println("Inside swapArray - Before swap: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("Inside swapArray - After swap: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
    }

    public static void increment(int x) {
        System.out.println("Inside increment - Before: x = " + x);
        x = x + 1;
        System.out.println("Inside increment - After: x = " + x);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Main - Before swapPrimitives: a = " + a + ", b = " + b);
        swapPrimitives(a, b);
        System.out.println("Main - After swapPrimitives: a = " + a + ", b = " + b);  // unchanged

        int[] arr = {10, 20};
        System.out.println("\nMain - Before swapArray: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
        swapArray(arr);
        System.out.println("Main - After swapArray: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);  // changed

        int x = 5;
        System.out.println("\nMain - Before increment: x = " + x);
        increment(x);
        System.out.println("Main - After increment: x = " + x);  // unchanged
    }
}
