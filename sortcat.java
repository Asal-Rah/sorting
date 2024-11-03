import java.util.*;

    public class sortcat {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            //tedad arrayharo az karabae vurudi migirim
            int number = sc.nextInt();
            ArrayList<int[]> AlloftheArrays = new ArrayList<>();
            // ba har bar ejraye halghe yek array ro az karbar migirim
            for (int i = 0; i < number; i++) {

                int[] arr = new int[sc.nextInt()];

                for (int j = 0; j < arr.length; j++) {

                    arr[j] = sc.nextInt();
                }
                //array dade shode ra be arraylist ezafe mikonim
                AlloftheArrays.add(arr);

            }

            int count = 0;

            boolean bool = false;
            boolean flagTIE;


            while (count < number ) {

                flagTIE = check(AlloftheArrays.get(count));

                quickSort(AlloftheArrays.get(count),0,AlloftheArrays.get(count).length - 1);

                ring2: for (int j = 1; j < AlloftheArrays.get(count).length; j++){

                    if (AlloftheArrays.get(count)[j - 1] > AlloftheArrays.get(count)[j]){
                        bool = true;
                        continue ring2;
                    }
                }

                if (bool){
                    System.out.println("HR");
                    bool = false;
                }
                else {
                    if (flagTIE){
                        System.out.println("TIE");
                    }
                    else {
                        System.out.println("LMT");
                    }
                }
                count = count + 1;
            }
        }

        //tabe baraye swap karadn tarif mikonim
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //tabe baraye check kardan inke array sort shode ya na tarif mikonim
        public static boolean check(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        static int partthearray(int[] arr, int low, int high) {

            int pivot = arr[high];
            int i = (low - 1);

            for(int j = low; j <= high - 1; j++) {

                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return (i + 1);
        }
       //tabe quick sort ra tarif mikonim
        static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int a = partthearray(arr, low, high);
                quickSort(arr, low, a - 1);
                quickSort(arr, a + 1, high);
            }
        }
    }


