package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] ages = new int[10];
        ages[0] = 34;
        ages[1] = 45;
        ages[2] = 30;
        ages[3] = 12;
        ages[4] = 34;

        for (int i = 0; i < 5 ; i++) {
            System.out.println(ages[i]);
        }
    }
}