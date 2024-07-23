package day7_BTVN;

import java.util.Scanner;

public class Nhap_In_NV {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = inputArray(scanner);
        printArray(array);
        scanner.close();
    }

    public static String[] inputArray(Scanner scanner) {
        System.out.print("Nhap so luong nhan vien: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap ten nhan vien thu " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        return array;
    }

    public static void printArray(String[] array) {
        System.out.println("Danh sach nhan vien nhu sau:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhan vien thu " + (i + 1) + ": " + array[i]);
        }
    }

}
