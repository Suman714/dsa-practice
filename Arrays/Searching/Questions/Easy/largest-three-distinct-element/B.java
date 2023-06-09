import java.util.*;

class B{
  public static void print3largest(int arr[]){
    Arrays.sort(arr);
    for(int i = arr.length-3; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  public static void main(String args[]){
    int arr[] = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 };
    print3largest(arr);
  }
}
