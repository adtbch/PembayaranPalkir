/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PembayaranParkir;


/**
 *
 * @author aditb
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static int getTipeKendaraan(Scanner scanner) {
        int pilihan = 0;
        boolean validInput = false;
        while (!validInput) {
            try { 
                System.out.println("Pilih tipe kendaraan:");
                System.out.println("1. Mobil");
                System.out.println("2. Motor");
                System.out.print("Masukan Pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();
                if (pilihan == 1 || pilihan == 2) {
                    validInput = true;
                } else {
                    System.err.println("Pilihan Salah. Tolong Masukan 1 untuk Mobil atau 2 untuk Motor.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Pilihan Salah. Tolong masukan angka yang valid untuk pilihan kendaraan.");
                scanner.nextLine(); // Clear the invalid input from scanner buffer
            }
        }
        return pilihan;
    }
    
    public static void tampilkanBiaya(Kendaraan kendaraan) {
        System.out.println("\n======================================");
        System.out.println("======================================");
        System.out.println("Plat nomor: " + kendaraan.getPlatnomor());
        System.out.println("Total parkir: " + kendaraan.getjamParkir());
        System.out.println("Biaya parkir: Rp. " + kendaraan.hitungTotalBiaya());
        System.out.println("======================================");
        System.out.println("======================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
            int pilihan = getTipeKendaraan(scanner);
            
            Kendaraan kendaraan;
            if (pilihan == 1) {
                kendaraan = new Mobil();
            } else{
                kendaraan = new Motor();
            } 

            System.out.print("Masukan plat nomor: ");
            kendaraan.setPlatnomor(scanner.nextLine());

            boolean validInput = false;
            double jamParkir = 0;
            while (!validInput) {
                try {
                    System.out.print("Masukan berapa jam waktu parkir : ");
                    jamParkir = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.err.println("Input salah. Tolong masukan angka yang benar.");
                    scanner.nextLine(); 
                }
            }
        kendaraan.setjamParkir(jamParkir);
        tampilkanBiaya(kendaraan);
    }
}
