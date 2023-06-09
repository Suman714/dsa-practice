public class B{
	public static void print2largest(int arr[], int size){
		int first, second;
		first = second = Integer.MIN_VALUE;
		for(int i = 0; i<size; i++){
			if(arr[i] > first){
				first = arr[i];
				second = first;
			}else if(arr[i] > second && arr[i] != first){
				second = arr[i];
			}
		}
		System.out.println(second);
	}

	public static void main(String args[]){
		int arr[] = {12, 35, 1, 10, 34, 1};
		int size = arr.length;
		print2largest(arr, size);
	}
}
