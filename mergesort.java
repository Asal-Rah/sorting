import java.util.Arrays;
import java.util.Scanner;

public class mergesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        int[] answer = new int[m];
        for ( int i = 0 ; i < m ; i++) {
            arr1[i] = sc.nextInt();
        }
        for ( int j = 0 ; j < n ; j++) {
            arr2[j] = sc.nextInt();
        }
        int count = 0 ;
        int num = 0 ;
        for ( int k = 0 ; k < n ; k++) {

            for ( int t = 0 ; t < m ; t++) {

                if(arr2[k] == arr1[t]) {
                    answer[count] = arr2[k];
                    arr1[t] = -1000 ;
                    count++;
                    num++;
                }

            }

        }
        Arrays.sort(arr1);
        for ( int i = 0 ; i < m ; i++) {
            if(arr1[i] != -1000) {
                answer[count] = arr1[i];
                count++;
            }
        }



        for ( int j = 0 ; j < m ; j++) {
            System.out.print(answer[j] + " ");
        }
    }
}
