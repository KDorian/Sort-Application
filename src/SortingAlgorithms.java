import java.util.Random;

public class SortingAlgorithms {

    int [] arr = new int [50];
    int [] arr2 = new int [50];
    int [] arr3 = new int [50];
    int [] arr4 = new int [50];

    SortingAlgorithms(){

        Random rand = new Random();

        for(int i = 0; i<arr.length; i++){

            int n = rand.nextInt(101);
            arr[i] = n;
            arr2[i] = n;
            arr3[i] = n;
            arr4[i] = n;
        }
    }

    void selectionSort(){

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

    void bubbleSort(){

        int n = arr2.length;

        for(int i = 0; i < n - 1; i++){

            for(int j = 0; j < n - 1; j++){

                if(arr2[j]> arr2[j + 1]){

                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
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

    void insertionSort(){

        int n = arr3.length;

        for(int i = 1; i < n; i++){

            int key = arr3[i];
            int j = i - 1;

            while(j >= 0 && arr3[j] > key){

                arr3[j + 1] = arr3[j];
                j = j - 1;
            }

            arr3[j + 1] = key;
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

    void mergeSort(int arr[], int l, int r){

        if(l < r){

            int m = (l + r)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }

    void merge(int arr[], int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){

            L[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++){

            R[j] = arr[m+1+j];
        }

        int i = 0, j = 0;

        int k = l;

        while(i < n1 && j < n2){

            if(L[i] <= R[j]) {

                arr[k] = L[j];
                i++;
            } else {

                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while(i < n1){

            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){

            arr[k] = R[j];
            j++;
            k++;
        }
    }

    String printMergeSortArray(){

        String str = null;
        int n = arr4.length;

        for(int i = 0; i < n; i++){

            str = str + arr4[i] + " ";
        }

        str = str + "\n";
        return str;
    }

}

