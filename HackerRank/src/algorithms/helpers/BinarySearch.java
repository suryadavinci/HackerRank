package algorithms.helpers;

public class BinarySearch {
	public static int binarySearch(int[] a, int key){
		
		int low=0;
		int high=a.length-1;
		int mid= low+(high-low)/2;
		
		while(low<=high){
			//System.out.println(a[mid]);
			
			if(a[mid]<key)
			{
				high=mid-1;
				mid=low+(high-low)/2;
			}
			else if(a[mid]>key){
				low=mid+1;
				mid=low+(high-low)/2;
			}
			else
				return mid;
			
			
		}
		
		
		return -(low+1);
	}
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,34,45,76,89,91};
		
		System.out.println(binarySearch(a, 91));
		
		
	}
	
}
