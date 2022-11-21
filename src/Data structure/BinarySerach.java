package java2;

public class BinarySerach {
	
	public static boolean binarySearch(int arr[] , int target) {
		int start = 0;
		int end = arr.length-1;
		boolean ok = false;
		while(start < end) {
			int mid = (start+end)/2;
			
			if(arr[mid] == target) {
				ok = true;
				break;
			}
			else if(arr[mid] > target) {
				end = mid-1;
			}else {
				start = mid+1;// arr[mid] < target
			}
		}
		return ok;
	}
	
	public static void main(String[]args)
	{
		int []arr= {10,20,30,40,50};
		
		boolean status =  binarySearch(arr, 80);
		System.out.println(status);
	}

}
