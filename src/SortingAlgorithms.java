import java.util.Random;

public class SortingAlgorithms {

    int [] arr = new int [50];

    SortingAlgorithms(){

        Random rand = new Random();

        for(int i = 0; i<arr.length; i++){

            int n = rand.nextInt(101);
            arr[i] = n;
        }
    }

    void SelectionSort(){

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){

            int min_idx = i;
            for(int j = i + 1; j < n; j++){

                if(arr[j] < arr[min_idx]){

                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[1];
            arr[i] = temp;
        }
    }

    String printSelectionSortArray(){

        String str = null;
        int n = arr.length;
        for(int i = 0; i < n; i++){

            str = str + arr[i] + " ";
        }
        str = str + "\n";

        return str;
    }

}

