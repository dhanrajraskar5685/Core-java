package Loop;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 111, 110, 150, 177, 199, 188, 201 };

		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.print("\n**************\n");
		for (int i = arr.length; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	
		
		
	}

}
