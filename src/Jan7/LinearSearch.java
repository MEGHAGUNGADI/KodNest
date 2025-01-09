package Jan7;

import java.util.Scanner;

/*public class LinearSearch {

    int[] a = new int[5];
    int key;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        obj.getInput();
        obj.search();
    }

    private void getInput() {
        System.out.println("Enter array elements");

        // Input the elements
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter key element");
        key = sc.nextInt();
    }

    private void search() {
        int pos = -1;

        // Linear search
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("Successful search");
            System.out.println(key + " element found at " + (pos + 1));
        } else {
            System.out.println(key + " element not found");
        }
    }
}   */




public class LinearSearch {

    int[] a = new int[5];
    int key;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        obj.getInput();
        obj.search();
    }

    private void getInput() {
        System.out.println("Enter array elements");

        // Input the elements
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter key element");
        key = sc.nextInt();
    }

    private void search() {
        int pos = -1;

        // Linear search
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("Successful search");
            System.out.println(key + " element found at " + (pos + 1));
        } else {
            System.out.println(key + " element not found");
        }
    }
}