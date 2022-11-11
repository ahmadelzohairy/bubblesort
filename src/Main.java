public class Main {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        bubbleSortAscending(intArray);
        for (int i :
                intArray) {
            System.out.println(i);
        }
    }

    public static void swap(int[] intArr, int i, int j){
        if (i == j){
            return;
        }
        int temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
    public static void bubbleSortAscending(int[] intArr){
        for (int lastUnsortedIndex = intArr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex --){
            for(int i = 0; i < lastUnsortedIndex; i++){
                int j = i + 1;
                if(intArr[i] > intArr[j]){
                    swap(intArr, i, j);
                }
            }
        }
    }
}