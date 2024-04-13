import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print
                ("Escribe el numero que deseas para el tamano del array: ");
        int number = sc.nextInt();
        fillArray(number);
    }

    public static void fillArray(int number) {
        int[] array = new int[number];
        int sum = 0;
        System.out.println("El tamanho del array es: " + array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = ranNum();
            sum += array[i];
        }

        System.out.println("La suma de los valores es: " + sum);

        for (int j : array) {
            System.out.println(j);
        }
    }

    private static int ranNum(){
        Random randomNumber = new Random();
        int value;
        value = randomNumber.nextInt(9);
        return value;
    }
}