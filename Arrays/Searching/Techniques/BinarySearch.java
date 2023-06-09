class BinarySearch{
  public static int binarySearch(int arr[], int key, int lo, int hi){
    while(lo < hi){
      int mid = lo + (hi - lo)/2;
      if(arr[mid] == key){
        return mid;
      }else if(arr[mid]>key){
        lo = mid + 1;
      }else{
        hi = mid - 1;
      }
    }
    return -1;
  }
  public static int recBinarySearch(int arr[], int key, int lo, int hi){
    while(lo < hi){
      int mid = lo + (hi-lo)/2;
      if(arr[mid] == key){
        return mid;
      }else if(arr[mid] > key){
        return recBinarySearch(arr, key, lo, mid-1);
      }else{
        return recBinarySearch(arr, key, mid+1, hi);
      }
    }
    return -1;
  }
  public static void main(String args[]){
    int arr[] = {10, 20, 30, 40, 50, 60};
    int key = 30;
    int lo = 0;
    int hi = arr.length-1;
    int result = recBinarySearch(arr, key, lo, hi); 
    if(result == -1){
      System.out.println("Element not found");
    }else {
      System.out.println("Element found at index " + result);
    }
  }
}
