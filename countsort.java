//package com.company;
import java.util.*;

public class countssort {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();
        String[] firstArray = new String[size];
        for (int i = 0; i < size; i++){
            firstArray[i] = cin.next();
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            String st = firstArray[i];
            switch (st){
                case "X1" : array[i] = 1; break;
                case "X2" : array[i] = 2; break;
                case "X3" : array[i] = 3; break;
                case "X4" : array[i] = 4; break;
                case "X5" : array[i] = 5; break;
                case "Y1" : array[i] = 6; break;
                case "Y2" : array[i] = 7; break;
                case "Y3" : array[i] = 8; break;
                case "Y4" : array[i] = 9; break;
                case "Y5" : array[i] = 10; break;
                case "Z1" : array[i] = 11; break;
                case "Z2" : array[i] = 12; break;
                case "Z3" : array[i] = 13; break;
                case "Z4" : array[i] = 14; break;
                case "Z5" : array[i] = 15; break;
            }
        }

        CountSort(array,size);

        for (int i = 0; i < size; i++){
            int st = array[i];
            switch (st){
                case 1 : firstArray[i] = "X1"; break;
                case 2 : firstArray[i] = "X2"; break;
                case 3 : firstArray[i] = "X3"; break;
                case 4 : firstArray[i] = "X4"; break;
                case 5 : firstArray[i] = "X5"; break;
                case 6 : firstArray[i] = "Y1"; break;
                case 7 : firstArray[i] = "Y2"; break;
                case 8 : firstArray[i] = "Y3"; break;
                case 9 : firstArray[i] = "Y4"; break;
                case 10 : firstArray[i] = "Y5"; break;
                case 11 : firstArray[i] = "Z1"; break;
                case 12 : firstArray[i] = "Z2"; break;
                case 13 : firstArray[i] = "Z3"; break;
                case 14 : firstArray[i] = "Z4"; break;
                case 15 : firstArray[i] = "Z5"; break;
            }
        }
        printArray(firstArray,size);
    }

    static int getMax(int[] a, int n) {
        int max = a[0];
        for(int i = 1; i<n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    static void CountSort(int[] a, int n) {

        int[] output = new int [n+1];
        int max = getMax(a, n);
        int[] count = new int [max+1];

        for (int i = 0; i <= max; ++i) {
            count[i] = 0; // Initialize count array with all zeros
        }

        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        } // Store the count of each element

        for(int i = 1; i<=max; i++){
            count[i] += count[i-1]; //find cumulative frequency
        }


  /* This loop will find the index of each element of the original array in count array,
   and place the elements in output array*/

        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--; // decrease count for same numbers
        }

        for(int i = 0; i<n; i++) {
            a[i] = output[i]; //store the sorted elements into main array
        }
    }

    static void printArray(String a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
