public class Q4 {
    public static boolean main(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null)
        return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while(row < rows && column >= 0){
            int num = matrix[row][column];
            if(num == target) return true;
            if(num < target){
                 row++;
            }
            if(num > target){
                column--;
            }
        }
        return false;
    }
}
