package com.mahasiswa;

public class Orang {
    protected static String toString;
    private String nama;
    private String alamat;
    private String kota;
    private int umur;
    private char jenis_kelamin;

    void setnama(String nama) {
        this.nama =nama;
    }
    void setalamat(String alamat) {
        this.alamat =alamat;
    }
    void setkota(String kota) {
        this.kota=kota;
    }
    void setumur(int umur) {
        if (umur < 0){
            System.out.println("Umur tidak sesuai");
        }else {
            this.umur=umur;
        }
        /*
            Umur harus lebih dari 0
         */
    }
    void setjenis_kelamin(char jenis_kelamin) {
        if (jenis_kelamin == 'p' || jenis_kelamin == 'P' || jenis_kelamin == 'l' ||jenis_kelamin == 'L'){
            this.jenis_kelamin=jenis_kelamin;
        }else {
            System.out.println("jenis kelamin tidak sesuai");

        }
        /*
            Validasi bahawa karakter jenis kelamin adalah
            L: laki-laki dan
            P: perempuan
         */
    }
    String getnama() {
        return this.nama;
    }
    String getalamat() {
        return this.alamat;
    }
    String getkota() {

        return this.kota;
    }
    int getumur() {
        return this.umur;
    }
    char getjenis_kelamin() {
        return this.jenis_kelamin;
    }
    public String toString() {
        return "Nama : " + this.nama + " \nAlamat : " + this.alamat +
                "\nKota : " +this.kota + "\nUmur : " + this.umur +
                "\nJenis kelamin  : " + this.jenis_kelamin;
    }
}
