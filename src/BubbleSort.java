public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int item : arr){
            System.out.print(item + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int sizeArray = arr.length;

        boolean swapped;

        for(int i = 0; i < sizeArray - 1; i++){
            swapped = false;

            for(int j = 0; j < sizeArray - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }

        }

    }
}
