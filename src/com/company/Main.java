package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {10,4,6,2};
        int size = arr.length;
        int[] newarr = new int[size+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần chèn: ");
        int num = scanner.nextInt();
        System.out.println("Nhập vào vị trí chèn: ");
        int index = scanner.nextInt();
        if(index<=-1||index>= arr.length){
            System.out.println("Không chèn được phần tử vào mảng");
        }
        for(int i =0; i< newarr.length;i++){
            if (i<index){
                newarr[i]=arr[i];
            }else if (i==index){
                newarr[i]=num;
            }else {
                newarr[i]=arr[i-1];
            }
        }
        for (int item:
             newarr) {
            System.out.print(item+"\t");
        }
    }
}
