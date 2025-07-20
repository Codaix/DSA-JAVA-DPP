import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input x
        System.out.print("Enter the number to find: ");
        int x = sc.nextInt();

        // Initialize indices
        int first = -1;
        int last = -1;

        // Loop to find first and last occurrence
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                if(first == -1) first = i;
                last = i;
            }
        }

        // Output result
        if(first == -1) {
            System.out.println(x + " not found in the array.");
        } else {
            System.out.println("First occurrence of " + x + " at index: " + first);
            System.out.println("Last occurrence of " + x + " at index: " + last);
        }
    }
}
