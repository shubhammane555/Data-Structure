package java2;

public class BinarySearchByRecursive {
	
	public static int binarySearch(int arr[] , int start, int end, int target) {
		if(end >= start) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] > target) {
				return binarySearch(arr, start, mid-1, target);
			}
			return binarySearch(arr, mid+1, end, target);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
	    int temp =  binarySearch(arr, 0, arr.length-1, 80);
	    
	    System.out.println((temp != -1) ? true : false);
	}

}

