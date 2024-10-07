import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            System.out.print(String.format("Введите %d элемент массива: ", i));
            mas[i] = scanner.nextInt();
        }

//        for (int item : mas) {
//            System.out.print(String.format("%d ", item));
//        }
//        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(String.format("%d ", mas[i]));
        }
        System.out.println();

        int busHeight = 437;
        int indexCrash = -1;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] <= busHeight) {
                indexCrash = i;
                break;
            }
        }

        if (indexCrash == -1) {
            System.out.println("Аварий не было");
        } else {
            System.out.print(String.format("Авария была на мосту номер %d", indexCrash + 1));
        }
    }
}