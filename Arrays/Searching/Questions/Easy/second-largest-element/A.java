import java.util.*;
public class A {
  public static void print2largest(int arr[]){
    Arrays.sort(arr);
    int x = arr.length - 2;
    System.out.println(arr[x]);
  }

  public static void main(String args[]){
    int arr[] = {12, 35, 1, 10, 34, 1};
    print2largest(arr);
  }
}
