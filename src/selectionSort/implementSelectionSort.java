package selectionSort;

public class implementSelectionSort {

	public static int findMaxIndex(int[] numbers, int limit) {
		int maxIndex=0;
		for(int i =0;i<limit;i++){
			if(numbers[maxIndex]<numbers[i]){
				maxIndex = i;
			}	
		}
		return maxIndex;
	
	}

	public static int[] sorting(int[] numbers) {
		int numbersToSort = numbers.length-1;
		for(int i=numbersToSort;i>0;i--){
			int maxIndex = findMaxIndex(numbers, i+1 );	
			int temp = numbers[i];
			numbers[i]= numbers[maxIndex];
			numbers[maxIndex] = temp;
		}
		return numbers;
	}

}
