import java.util.*;

public class QuickSort{



	/**

		- Pick the pivot element , 
		- left array before pivot should have smaller value than pivot
		- right array after pivot should have larger value than pivot

		------------------------------------------------------------------

		To pick pivot :
		1. pick first element as pivot.
		2. pick last element as pivot.
		3. Pick a random element as pivot.
		4. Pick median as pivot.


		TIME COMPLEXITY - O(n log_2 n)
	**/

	public static void sort(int[] arr, int leftIndex, int rightIndex){

		
		if (leftIndex < 0 || rightIndex < 0)
		   return;

		if(arr.length < 2){
			System.out.println("ARRAY LENGTH LESS THAN 2 !!!");
			return;
		}

		if(leftIndex < rightIndex){
			int pivotIndex = partition(arr,leftIndex,rightIndex);

			sort(arr,leftIndex,pivotIndex-1);
			sort(arr,pivotIndex+1,rightIndex);
		}
	}


	public static int partition(int[] arr, int low ,int high){
		int pivot = arr[high];

		int i=low-1;

		for(int j=low;j<=high-1;j++){
			
			if(arr[j] < pivot){
				i++;
				swap(arr,i,j);
			}
		}


		swap(arr,i+1,high);

		return i+1;
	}

	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	

	public static void main(String[] args){
		int[] arr = new int[]{10,100,1000,500,5000,50};

		sort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));
	}
}