import java.util.*;

public class InsertionSort{



	/**
		Iterate array until find the correct position of each element , insert that element in it's place.


		TIME COMPLEXITY - O(n^2)
	**/

	public static void sort(int[] arr){

		if(arr.length < 2){
			System.out.println("ARRAY LENGTH LESS THAN 2 !!!");
			return;
		}

		for(int i=1;i<arr.length;i++){

			int element = arr[i];
			int j = i-1;

			while(j>=0 && arr[j] > element){
				arr[j+1] = arr[j];
				j=j-1;
			}

			arr[j+1] = element;
		}
	}

	public static void main(String[] args){
		int[] arr = new int[]{10,100,1000,500,5000,50,100};

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}