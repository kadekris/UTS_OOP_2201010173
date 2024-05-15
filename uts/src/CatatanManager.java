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

public class CatatanManager {
    private Catatan[] catatanArray;
    private int size;

    public CatatanManager(int kapasitas) {
        catatanArray = new Catatan[kapasitas];
        size = 0;
    }

    public void tambahCatatan(int id, String isi) {
        if (size < catatanArray.length) {
            catatanArray[size] = new Catatan(id, isi);
            size++;
        } else {
            System.out.println("Array penuh, tidak bisa menambah catatan lagi.");
        }
    }

    public void tampilkanCatatan() {
        for (int i = 0; i < size; i++) {
            System.out.println(catatanArray[i]);
        }
    }

    public void ubahCatatan(int id, String isiBaru) {
        for (int i = 0; i < size; i++) {
            if (catatanArray[i].getId() == id) {
                catatanArray[i].setIsi(isiBaru);
                return;
            }
        }
        System.out.println("Catatan dengan ID " + id + " tidak ditemukan.");
    }

    public void hapusCatatan(int id) {
        for (int i = 0; i < size; i++) {
            if (catatanArray[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    catatanArray[j] = catatanArray[j + 1];
                }
                catatanArray[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Catatan dengan ID " + id + " tidak ditemukan.");
    }
}

