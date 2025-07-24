public class BinarySearch {

    public static int linearSearch(String[] arr, String name){

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] arr, String name) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int comparison = name.compareTo(arr[mid]);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }


    public static void main(String[] args) {

            String[] phoneBook = new String[20000];

            for (int i = 0; i < 20000; i++) {
                phoneBook[i] = "Name" + String.format("%05d", i);  // ex: Name00000, Name00001, ..., Name09999
                // Huge list of names for a better comparison between linear and binary search
            }

            String searchedName = "Name09999";

            long startTime = System.nanoTime();
            int index = binarySearch(phoneBook, searchedName);
            long endTime = System.nanoTime();

            if(index != -1){
                System.out.println("Found at index " + index);
            }else{
                System.out.println("Name not found in Phone Book");
            }

            System.out.printf("⏰ Total time with Binary Search: %.9f seconds\n", (endTime - startTime) / 1_000_000_000.0); // convert ms to s

            startTime = System.nanoTime();
            index = linearSearch(phoneBook, searchedName);
            endTime = System.nanoTime();

            if(index != -1){
                System.out.println("Found at index " + index);
            }else{
                System.out.println("Name not found in Phone Book");
            }

        System.out.printf("⏰ Total time with linear Search: %.9f seconds\n", (endTime - startTime) / 1_000_000_000.0);

        }
    }

