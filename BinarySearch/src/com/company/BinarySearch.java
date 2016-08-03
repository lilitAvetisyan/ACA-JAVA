package com.company;

public class BinarySearch {


    public static final int NOT_FOUND = -1;
    public static int binarySearch(int number, int[] arr )
    {
        int low = 0;
        int high = arr.length -1;
        int mid;
        while (low <= high)
        {
            mid = (low + high) / 2;

            if (arr[mid] > number)
                high = mid - 1;
            else if (arr[mid] < number)
                low = mid + 1;
             else
                return mid;
        }
        return NOT_FOUND;
    }
    public static void main(String[] args)
    {
        int number = 10;
        int index;
        int arr[] ={10,5,4,10,30};
        int i;
        int l = arr.length;
        int j;

        // sorting the array
        
        for (j=1; j < l; j++) {
            for (i=0; i < l-j; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("Found " + number + " at " + binarySearch(number, arr));

        }
    }


