// Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число. Пусть
//число, на которое будет увеличиваться каждый элемент, задается из КОНСОЛИ.

import java.util.Scanner;

public class ext1 {

    public static void main(String[] args) {

        int[][][] myArray = new int[][][]{{{10, 33, 31}, {27, 40, 15}}, {{35, 49, 21}, {32, 13, 45}}, {{30, 39, 49}, {41, 40, 35}}};
        System.out.println("The Array");

        for (int x = 0; x < myArray.length; x++) {
            for (int y = 0; y < myArray[x].length; y++) {
                for (int z = 0; z < myArray[x][y].length; z++) {
                    System.out.print(myArray[x][y][z] + " ");
                }
                System.out.println();
            }
        }
        System.out.println(" "); // для пустого пространства между массивом и текстом для введения числа
        System.out.println("Enter the number you want to add:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(" "); // для пустого пространства между введенным числом и новым массивом
        System.out.println("The updated Array");

        for (int x = 0; x < myArray.length; x++) {
            for (int y = 0; y < myArray[x].length; y++) {
                for (int z = 0; z < myArray[x][y].length; z++) {
                    myArray[x][y][z] += number;
                    System.out.print(myArray[x][y][z] + " ");
                }
                System.out.println();
            }
        }
    }
}