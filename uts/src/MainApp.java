/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author I kadek krisna surya dwi g
 * NIM     ; 2201010173
 */
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatatanManager manager = new CatatanManager(100);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID (angka): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("ID harus berupa angka. Silakan coba lagi.");
                        scanner.next(); // membersihkan input yang salah
                    }
                    int id = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer
                    System.out.print("Masukkan Isi: ");
                    String isi = scanner.nextLine();
                    manager.tambahCatatan(id, isi);
                    break;
                case 2:
                    manager.tampilkanCatatan();
                    break;
                case 3:
                    System.out.print("Masukkan ID catatan yang akan diubah: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("ID harus berupa angka. Silakan coba lagi.");
                        scanner.next(); // membersihkan input yang salah
                    }
                    int idUbah = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer
                    System.out.print("Masukkan Isi baru: ");
                    String isiBaru = scanner.nextLine();
                    manager.ubahCatatan(idUbah, isiBaru);
                    break;
                case 4:
                    System.out.print("Masukkan ID catatan yang akan dihapus: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("ID harus berupa angka. Silakan coba lagi.");
                        scanner.next(); // membersihkan input yang salah
                    }
                    int idHapus = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer
                    manager.hapusCatatan(idHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

