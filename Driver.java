package com.mahasiswa;

public class Driver {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Umar Bakri",
                "jl.umar",
                "Bandung",
                30,
                'L',
                "PBO",
                "S1",
                1000);
        System.out.println(dosen.toString());

        Mahasiswa mhs = new Mahasiswa("Barak Obama",
                "Way Hui",
                "Bandar Lampung",
                21,
                'L',
                "14117001",
                "RC",
                4,
                new MahasiswaReport("PBO","PBO Lanjut",3, 3, "A", "B"));
        System.out.println(mhs.toString());
    }
}

/**

 Output:

 Informasi Dosen
 ============================
 nama       :Umar Bakri
 Alamat     :jl.umar
 Kota       :Bandung
 Umur       :30
 MK         :PBO
 Strata     :S1
 Salary     :1000

 Informasi  Mahasiswa
 ============================
 nama       :Barak Obama
 Alamat     :Way Hui
 Kota       :Bandar Lampung
 Umur       :21
 NIP        :14117001
 Kelas      :RC
 Semester   :4

 Information from Student Report
 ============================
 MK1      :PBO1
 SKS1     :3
 Nilai1   :4
 MK2      :PBO2
 SKS2     :3
 Nilai2   :4
 NR       :4.0

 **/