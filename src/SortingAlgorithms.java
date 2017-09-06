import java.util.Random;

public class SortingAlgorithms {

    int [] arr = new int [50];
    int [] arr2 = new int [50];
    int [] arr3 = new int [50];

    SortingAlgorithms(){

        Random rand = new Random();

        for(int i = 0; i<arr.length; i++){

            int n = rand.nextInt(101);
            arr[i] = n;
            arr2[i] = n;
            arr3[i] = n;
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

    void BubbleSort(){

        int n = arr2.length;

        for(int i = 0; i < n -1; i++){

            for(int j = 0; j < n - 1; j++){

                if(arr2[j]> arr2[j+1]){

                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
    }

    String printBubbleSortArray(){

        String str = null;
        int n = arr2.length;

        for(int i = 0; i < n; i++){
            str = str + arr2[i] + " ";
        }

        str = str + "\n";

        return str;
    }

    void InsertionSort(){

        int n = arr3.length;

        for(int i = 1; i < n; i++){

            int key = arr3[i];
            int j = i - 1;

            while(j >= 0 && arr3[j] > key){

                arr3[j + 1] = arr3[j];
                j = j - 1;
            }

            arr3[j+1] = key;
        }
    }

    String printInsertionSortArray(){

        String str = null;
        int n = arr3.length;

        for(int i = 0; i < n; i++){

            str = str + arr3[i] + " ";
        }

        str = str + "\n";
        return str;
    }

}

