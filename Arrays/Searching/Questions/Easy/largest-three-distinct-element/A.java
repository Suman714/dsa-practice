class A{
  public static void print3largest(int arr[]){
    int first, second, third ;
    first = second = third = Integer.MIN_VALUE;

    if(arr.length < 0){
      System.out.println("Invalid input");
    }

    for(int i = 0; i<arr.length; i++){
      if(arr[i] > first){
        third = second;
        second = first;
        first = arr[i];
      }else if(arr[i] > second){
        third = second;
        second = arr[i];
      }else if(arr[i] > third){
        third = arr[i];
      }
    }

    System.out.println(first + " " + second + " " + third);
  }

  public static void main(String args[]){
    int arr[] = {60, 20, 10, 80, 50, 30};
    print3largest(arr);
  }
}
