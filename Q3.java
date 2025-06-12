public class Q3 {
     int[][] convertMatrixNew(int[][] arr) {
    int rows = arr.length;
    int cols = arr[0].length;

    // First pass: mark the elements to be zeroed
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (arr[i][j] == 0) {
                // Mark the entire row
                for (int k = 0; k < cols; k++) {
                    if (arr[i][k] != 0) {
                        arr[i][k] = -1;
                    }
                }
                // Mark the entire column
                for (int k = 0; k < rows; k++) {
                    if (arr[k][j] != 0) {
                        arr[k][j] = -1;
                    }
                }
            }
        }
    }

    // Second pass: set all marked elements to zero
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (arr[i][j] == -1) {
                arr[i][j] = 0;
            }
        }
    }

    return arr;
}

    
    
    
}
