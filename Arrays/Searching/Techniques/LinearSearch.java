class LinearSearch{
  public static int linearSearch(int arr[], int key, int size){
    for(int i = 0; i<size; i++){
      if(arr[i] == key){
       return i; 
      }
    }
    return -1;
  }
  public static int recLinearSearch(int arr[], int key, int size){
    if(size < 0){
      return -1;
    }else if(arr[size - 1] == key){
      return size - 1;
    }else {
      return recLinearSearch(arr, key, size-1);
    }
  }
  public static void main(String args[]){
    int arr[] = {10, 20, 30, 40, 50, 60};
    int key = 20;
    int length = arr.length;
    int result = recLinearSearch(arr, key, length);
    if(result == -1){
      System.out.println("Element not Found");
    }else{
      System.out.println("Element found at index "+ result);
    }
  }
}
