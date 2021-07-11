/*
        Merge sort: Time complexity O(nlogn) nlogn < n^2

        Imagine you have 1000 sheets of paper,and in each sheet 
        a number is written. 
        We want to sort all the sheets(ascending order).
                        1000
                    500     500
            250    250      250     250
        125   125 125   125 125 125 125 125
        62 63 62 6362 6362 6362 6362 6362 6362 6362 63
        .
        .
        .
        .
        .
        1 11111111.......................................1 (1000 people)

        Till now we divided. 
        Now we will merge
        [25, 37] ...................................[67 89] (500 groups)

        (250 groups each of size 4 and they will also be sorted)

    ....


    ...

    ....

    ... (1 group of 1000 sheets)


    For example: [i=12, 15, 37, 83], [j = 10, 13, 19, 40]

    [index = 10,index = 12,13,15,19,37,40,83] 
    
    Merging time is O(n)
    At every level my merging is going to take O(n) time

    So my final time complexity is: Number of levels * O(n)


    Last level has 1000 sheets
    Second last level(500) sheets
    Last => Second last => (1000 / 2)(2) => 1000 => n

    Second => third last = (250)(4) => 1000 => n

    Third => fourthlast => 125(8) => 1000 => n

    So my final time complexity is: number of levels * O(n)


    1000 => 1000/2 => 1000/4 => 1000/8.......... (1000/2^x)
    After x steps my one single array size is going to be 1000 / 2^x
    1000/2^x = 1, here x is the number of steps to reach to 1 
    1000 = 2^x
    x = log_{2}(n)
    Numbe of steps = x = log_{2}(n)

    O(n * log_{2}(n))

    */



/*

mergeSort - 1 
[242, 438, 613, 788, 725, 963, 933, 237]
start = 0
end = 7
mid = 3
[242, 438, 613, 788] [725, 963, 933, 237]

mergeSort - 2
[242, 438, 613, 788, 725, 963, 933, 237]
start = 0 , end = 3
mid = 1
[241, 438] [613, 788]


mergeSort-3
[242, 438, 613, 788, 725, 963, 933, 237]
start = 0 
end = 1
mid = 0
[242] [438] => [242, 438]
merge(arr, 0, 0, 1)

mergeSort-4
start = 0
end = 0

mergeSort - 5
start = 1
end = 1


*/


// arr = [12, 15, 37, 83, 10, 13, 19, 40], start = 0, mid = 3, end = 7
//
static int temp[] = new int[10001]; //global array

public static void merge(int[] arr, int start, int mid, int end){
      for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
      }
      //temp = [12, 15, 37, 83, 10 13, 19, 40], j
      // arr = [10, 12, 13, 15, 19, 37, 40, 83], index
      int i = start;
      int j = mid + 1;
      int index = start;
      while(i <= mid && j <= end){
            if(temp[i] <= temp[j]){
                  arr[index] = temp[i];
                  i++;
            }
            else{
                  arr[index] = temp[j];
                  j++;
            }
            index++;
      }
      while(i <= mid){
            arr[index] = temp[i];
            index++;
            i++;
      }
      while(j <= end){
            arr[index] = temp[j];
            index++;
            j++;
      }
}

public static void mergeSort(int arr[], int start, int end){
      //if array is size 1, start == end ? 
      if(start >= end){
            //stop splitting
            return;
      }
      int mid = (start) + (end - start) / 2;
      mergeSort(arr, start , mid); //left call
      mergeSort(arr, mid+1 , end); //right call
      merge(arr, start, mid, end); //merge [start...mid] [mid+1...end]
}



public static int[] implementMergeSort(int arr[], int start, int end) //start = 0, end = n-1
{
      mergeSort(arr, start, end);
      return arr;
}