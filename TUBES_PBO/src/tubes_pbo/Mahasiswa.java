/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes_pbo;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
 class Mahasiswa extends Pengguna {
    private String NIM;
    private String Prodi;
    private String daftarKegiatan;
    private String namaKegiatan;
    private String tanggalKegiatan;

    public Mahasiswa(String NIM, String Prodi, String daftarKegiatan, String namaKegiatan, String tanggalKegiatan, String idPengguna, String password, String role) {
        super(idPengguna, password, "Mahasiswa");
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.daftarKegiatan = daftarKegiatan;
        this.namaKegiatan = namaKegiatan;
        this.tanggalKegiatan = tanggalKegiatan;
    }
    
}

