package javaprogram;

public class TwoMatrixMul
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{6,2},{3,4}};
		int[][] b= {{1,2},{6,4}};
		int[][] c=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<2;k++)
				{
					c[i][j]=a[i][k]*b[k][j]+c[i][j];
				}
			}
	
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

//output
18	20	
27	22	


