/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputnumber;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class InputNumber {

    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        System.out.print("Input numbers to list: ");
        int numberAmount = cin.nextInt();
        int[] numbers = new int[numberAmount];

        System.out.println("Input numbers: ");
        for (int i = 0; i < numberAmount; i++){
            System.out.print("Number " + (i+1) +": ");
            numbers[i] = cin.nextInt();
        }

        System.out.println("Output numbers: ");
        for (int i = 0; i < numberAmount; i++){
            System.out.println(numbers[i]);
        }
        cin.close();
    }
}
