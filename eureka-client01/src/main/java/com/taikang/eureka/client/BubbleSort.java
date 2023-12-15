package com.taikang.eureka.client;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 22,5,4, 3, 2, 1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        // 外层循环控制比较的轮数
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // 内层循环控制每轮比较的次数
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前一个数大于后一个数，则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

