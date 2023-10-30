package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean upper = false;
        boolean lower = false;
        boolean number = false;
        boolean special = false;
        Scanner scanner = new Scanner(System.in);
        Scanner numScanner = new Scanner(System.in);

        System.out.print("Masukkan panjang password : ");
        int length = numScanner.nextInt();

        System.out.print("Menggunakan huruf besar? (y/n) ");
        String upperCase = scanner.nextLine();

        System.out.print("Menggunakan huruf kecil? (y/n) ");
        String lowerCase = scanner.nextLine();

        System.out.print("Menggunakan angka? (y/n) ");
        String numberInpt = scanner.nextLine();

        System.out.print("Menggunakan spesial karakter? (y/n) ");
        String specialInpt = scanner.nextLine();

        if (upperCase.equalsIgnoreCase("y")) {
            upper = true;
        }
        if (lowerCase.equalsIgnoreCase("y")) {
            lower = true;
        }
        if (numberInpt.equalsIgnoreCase("y")) {
            number = true;
        }
        if (specialInpt.equalsIgnoreCase("y")) {
            special = true;
        }

        System.out.print("Jumlah password yang di generate : ");
        int many = scanner.nextInt();
        PasswordGenerator passwordGenerator = new PasswordGenerator(length, upper, lower, number, special);

        for (int i=0; i<many; i++) {
            String password = passwordGenerator.generatePassword();
            System.out.println((i+1)+". Passwordnya adalah : " + password);
        }
    }
}