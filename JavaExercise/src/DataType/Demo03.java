package DataType;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个整数");
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            arr[i]=num;
        }
        arr = sort(arr, 5);
        for (int i = 0;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("请再输入一个整数");
        arr[5] = sc.nextInt();
        arr = sort(arr,6);
        for (int i = 0;i<6;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] sort(int[] arr,int length){
        int temp = 0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
