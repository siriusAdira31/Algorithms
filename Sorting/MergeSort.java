import java.util.*;

public class MergeSort{



	/**
		Merge sort : recursive divide and conquer algorithm 

		- Divides a given array into two halves, 
		- sorts those halves, 
		- And then merges them together in order. 


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
			int mid = leftIndex + (rightIndex- leftIndex)/2;

			sort(arr,leftIndex,mid);
			sort(arr,mid+1,rightIndex);


			merge(arr,leftIndex,mid,rightIndex);
		}
	}

	public static void merge(int[] arr,int left , int mid , int right){
		int i,j,k;

		int leftArrayLength = mid - left + 1;
		int rightArrayLength = right - mid;

		int[] leftArray = new int[leftArrayLength];
		int[] rightArray = new int[rightArrayLength];

		for(i=0;i<leftArrayLength;i++)
			leftArray[i] = arr[left+i];

		for(j=0;j<rightArrayLength;j++)
			rightArray[j] = arr[mid+j+1];

		i=0;
		j=0;
		k=left;

		while(i<leftArrayLength && j<rightArrayLength){
			if(leftArray[i] <= rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}else{
				arr[k] = rightArray[j];
				j++;
			}

			k++;
		}

		while(i < leftArrayLength){
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while(j < rightArrayLength){
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	


	public static void main(String[] args){
		int[] arr = new int[]{10,100,1000,500,5000,50};

		sort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));
	}
}