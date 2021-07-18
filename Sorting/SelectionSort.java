import java.util.*;

public class SelectionSort{



	/**
		find the minimum value from sub-arrays and assign the leftmost unsorted element.


		TIME COMPLEXITY - O(n^2)
	**/

	public static void sort(int[] arr){

		if(arr.length < 2){
			System.out.println("ARRAY LENGTH LESS THAN 2 !!!");
			return;
		}

		for(int i=0;i<arr.length;i++){

			int minIndex = findMinIndex(arr, i, arr.length-1);

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}


	public static int findMinIndex(int[] arr, int start, int end){

		int min = arr[start];
		int minIndex = start;

		while(start <= end){
			if(min > arr[start]){
				min = arr[start];
				minIndex = start;
			}

			start++;
		}

		return minIndex;
	}



	public static void main(String[] args){
		int[] arr = new int[]{10,100,1000,500,5000,50};

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}