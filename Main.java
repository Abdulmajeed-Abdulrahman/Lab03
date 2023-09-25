package Lab03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort(arr);
        System.out.println("Sorted Array:");
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public static void sort(int[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Chose 1 for selectionSort or 2 for insertionSort");
        int n =input.nextInt();
        if (n==1)
            selectionSort(a);
        else if (n==2)
            insertionSort(a);
        else
            System.out.println("Wrong input");
    }
}

