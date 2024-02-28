import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Write size of array to be sorted: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] array = getIntegers(value);
        printArray(sortIntegers(array));



    }
    public static int[] getIntegers(int sizeOfArray){
       Scanner scanner = new Scanner(System.in);
       int[] array = new int[sizeOfArray];
       for(int i=0; i<array.length; i++){
           System.out.println("Write " + i +" array value: ");
           array[i] = scanner.nextInt();

    }
       return array;
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray){
        boolean flag = true;
        int[] sortedArray = Arrays.copyOf(unsortedArray,unsortedArray.length);
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1])
                {
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag=true;
                    System.out.println("-->" + Arrays.toString(sortedArray));
                }
            }

        }
        return sortedArray;

    }

}
