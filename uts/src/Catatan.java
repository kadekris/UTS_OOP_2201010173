/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author I kadek krisna surya dwi g
 * NIM     ; 2201010173
 */
public class Catatan {
    private int id;
    private String isi;

    public Catatan() {
    }

    public Catatan(int id, String isi) {
        this.id = id;
        this.isi = isi;
    }

    public int getId() {
        return id;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Isi: " + isi;
    }
}

