package part3;

public class MultiDimensionalSArray {
	public static void main(String args[]) {
		
		String arr [][] = {{"Job","Search","Portals"},{"Naukri","LinkedIN","Indeed"}};
		
//		for(int i =0;i<arr.length;i++) // row
//		{
//			for(int j=0;j<arr[i].length;j++)//column
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i =0;i<2;i++) // row
		{
			for(int j=0;j<3;j++)//column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
