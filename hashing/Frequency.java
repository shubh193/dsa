package hashing;

import java.util.Scanner;

public class Frequency {
    // brute force approach
    static int frequencyCount1(int arr[], int q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == q) {
                count++;
            }
        }
        return count;
    }

    /*
     * Better approach: (2 steps)
     * pre-store and fetching
     * if array size increases then will not handled
     */
    static int frequencyCount2(int arr[], int q) {

        int hasharray[] = new int[13];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            hasharray[arr[i]] = hasharray[arr[i]] + 1;
        }
        return hasharray[q];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = { 1, 2, 2, 3, 1, 2, 5, 6, 6, 7, 8, 8, 8 };
        System.out.println(frequencyCount2(num, 8));
    }
}
