import java.util.*;

public class BubbleSort{



	/**
		comparing adjacent pairs of elements and swapping them if they are in the wrong order. 
		repeat until the array is sorted.


		TIME COMPLEXITY - O(n^2)
	**/

	public static void sort(int[] arr){

		if(arr.length < 2){
			System.out.println("ARRAY LENGTH LESS THAN 2 !!!");
			return;
		}

		for(int i=0;i<arr.length-1;i++){

			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		int[] arr = new int[]{10,100,1000,500,5000,50};

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}