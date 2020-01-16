package com.codegym;

import java.util.Scanner;

public class SapXepChon {
    public void sapXep(int[] list) {
        int temp = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[6];
        for (int i = 0; i < list.length; i++) {
            System.out.println("input list[" + i + "] : ");
            list[i] = sc.nextInt();
        }
        SapXepChon sapXepChon = new SapXepChon();
        sapXepChon.sapXep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
