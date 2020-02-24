package com.mahasiswa;

public class Dosen extends Orang
{
    private String mk;
    private String strata;
    private int salary;
    // Nilai salary harus lebih dari 0

    public Dosen(String nama, String alamat, String kota, int umur, char jenis_kelamin, String mk, String strata, int salary) {
        setnama(nama);
        setalamat(alamat);
        setkota(kota);
        setumur(umur);
        setjenis_kelamin(jenis_kelamin);
        this.mk=mk;
        this.strata=strata;
        this.salary=salary;
    }

    public void setStrata(String strata) {
        this.strata = strata;
    }

    public void setMk(String tittle) {
        this.mk = tittle;
    }

    public void setSalary(int salary) {
        this.salary =salary;
    }
    @Override
    public String toString()
    {
        return " INFORMASI DOSEN " +
                "\n======================\n" + super.toString() +
                "\nMK : " + this.mk + "\nStrata : " + this.strata +
                "\nSalary : " + this.salary;
    }
}