public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Input");
        printMatrix(matrix);

        System.out.println();
        rotate(matrix);

        System.out.println("Output");
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix)
    {
        for(int[] row:matrix)
        {
            for(int num:row)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix)
    {
        int n=matrix.length;
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j=i;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        for(int row=0;row<n;row++)
        {
            int left=0,right=n-1;
            while (left<right)
            {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }

}













