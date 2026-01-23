public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        System.out.println("Input");
        printMatrix(matrix);

        setZeroes(matrix);
        System.out.println();

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

    public static void setZeroes(int[][] matrix)
    {
        boolean firstRow = false,firstCol=false;

        int m = matrix.length;
        int n = matrix.length;

        for (int j = 0; j < n; j++) {
            if(matrix[0][j]==0)
            {
                firstRow = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if(matrix[i][0]==0)
            {
                firstCol = true;
                break;
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
          for (int j=1;j<n;j++)
          {
              if(matrix[i][0]==0||matrix[0][j]==0)
              {
                  matrix[i][j]=0;
              }
          }
        }

        if(firstRow)
        {
            for (int j=0;j<n;j++)
            {
                matrix[0][j]=0;
            }
        }

        if(firstCol)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][0]=0;
            }
        }

    }

}
