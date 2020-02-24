package com.mahasiswa;

public class MahasiswaReport
{
    private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
        this.mk1=mk1;
        this.mk2=mk2;
        this.sks1=sks1;
        this.sks2=sks2;
        this.nilai1=nilai1;
        this.nilai2=nilai2;
    }

    MahasiswaReport(MahasiswaReport sp) {

    }

    public String getmk1() {
        return  this.mk1;
    }
    public void setmk1(String mk1) {
        this.mk1= mk1;
    }
    public String getmk2() {
        return this.mk2;
    }
    public void setmk2(String mk2) {
        this.mk2=mk2;
    }
    public int getsks1() {
        return  this.sks1;
    }
    public void setsks1(int sks1) {
        this.sks1=sks1;
    }
    public int getsks2() {
        return  this.sks2;
    }
    public void setsks2(int sks2) {
        this.sks2=sks2;
    }
    public float getnilai1() {
        return ConvertNilaiMutu(this.nilai1);
    }
    public void setnilai1(String nilai1) {
        ConvertNilaiMutu(this.nilai2);
    }
    public float getnilai2() {
        return ConvertNilaiMutu(this.nilai2);
    }
    public void setnilai2(String nilai2) {
        ConvertNilaiMutu(this.nilai2);
    }
    public float HitungNR()
    {
        float NR;
        NR = (getnilai1() + getnilai2()) / (this.sks1+this.sks2);
        return NR;
        /*
            Nilai NR adalah : ( Nilai mutu MK1 + Nilai mutu MK2 ) / (sks MK1 + sks MK2)
         */

    }

    public float ConvertNilaiMutu(String HurufMutu){
        float mutu=0f;
        switch(HurufMutu){
            case "A"  :
               mutu=4f;
                break;
            case "AB" :
                mutu=3.5f;
                break;
            case "B" :
               mutu=3f;
                break;
            case "BC" :
                mutu=2.5f;
                break;
            case "C" :
                mutu=2f;
                break;
            case "D" :
                mutu=1f;
                break;
            case "E" :
                mutu=0f;
                break;
            default :
                System.out.println("Masukan salah , masukan harus antara huruf A-E dan ditulis dengan huruf kapital");
        }

        /*
            Huruf mutu A : nilai mutu 4
            Huruf mutu B : nilai mutu 3
            Huruf mutu C : nilai mutu 2
            Huruf mutu D : nilai mutu 1
            Huruf mutu E : nilai mutu 0
         */
       return mutu;
    }
    public String toString() {
        /*
            Mengembalikan informasi laporan nilai mahasiswa
         */
        return "\nInformation from Student Report \n============================ \nMK1      : " + this.mk1 +
                "\nSKS1     : " + this.sks1 + "\nNilai1   : " + this.nilai1 + "\nMK2      : " + this.mk2 +
                "\nSKS2     : " + this.sks2 + "\nNilai2   : " + this.nilai2 + "\nNR       : " + HitungNR();
    }
}
