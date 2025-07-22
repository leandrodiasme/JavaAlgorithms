public class BinarySearch {

    public static int conventionalSearch(String[] arr, String name){

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
        String[] phoneBook = {
                "Aaron", "Bella", "Caleb", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Julia",
                "Kevin", "Luna", "Michael", "Nora", "Oscar",
                "Paula", "Quentin", "Rachel", "Samuel", "Tina",
                "Ulysses", "Violet", "William", "Xander", "Yasmine", "Zack"
        };

            String searchedName = "Rachel";

            long startTime = System.nanoTime();
            int index = binarySearch(phoneBook, searchedName);
            long endTime = System.nanoTime();

            if(index != -1){
                System.out.println("Found at index " + index);
            }else{
                System.out.println("Name not found in Phone Book");
            }

            System.out.printf("Total time with Binary Search: %.9f seconds\n", (endTime - startTime) / 1_000_000_000.0); // convert ms to s

            startTime = System.nanoTime();
            index = conventionalSearch(phoneBook, searchedName);
            endTime = System.nanoTime();

            if(index != -1){
                System.out.println("Found at index " + index);
            }else{
                System.out.println("Name not found in Phone Book");
            }

        System.out.printf("Total time with Conventional Search: %.9f seconds\n", (endTime - startTime) / 1_000_000_000.0);

        }
    }

