
public class Array2DBasic {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3,4,5},
				{2,3,4,5},
				{3,4,5},
				{4,5},
				{5}
		};
		
		//printing row size
		System.out.println("Number of row: "+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Size of Col-"+i+": "+arr[i].length);
		}
		System.out.println();
		
		//print array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
