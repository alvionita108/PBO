package com.mahasiswa;

public class Mahasiswa extends Orang {

    private String NIP;
    private String kelas;
    private int semester;
    private MahasiswaReport report;


    public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIP, String kelas, int semester, MahasiswaReport Report) {
        setnama(nama);
        setalamat(alamat);
        setkota(kota);
        setumur(umur);
        setjenis_kelamin(jenis_kelamin);
        this.NIP=NIP;
        this.kelas=kelas;
        this.semester=semester;
        report = new MahasiswaReport("PBO","PBO Lanjut",3, 3, "A", "B");
    }

    public void setId(String id) {
    }
    public void setkelas(String kelas) {
        this.kelas=kelas;
    }
    public void setSemester(int semester) {
        this.semester=semester;
    }
    public void setReport(MahasiswaReport report) {


    }
    public String getNIP() {
        return this.NIP;
    }
    public String getkelas()
    {
        return this.kelas;
    }
    public int getSemester()
    {
        return this.semester;
    }
    public MahasiswaReport getReport()
    {
        return report;
    }
    @Override
    public String toString()
    {
        return "\nInformasi  Mahasiswa \n============================ \n" + super.toString() +
                "\nNIP        : " + this.NIP +   "\nKelas      : " + this.kelas + "\nSemester   : " +this.semester +
                report.toString();
    }
}

