/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes_pbo;

/**
 *
 * @author Lenovo
 */
class Admin extends Pengguna {
    private String email;
    
    public Admin(String nama, String password, String email){
        super(nama, password, "Admin");
        this.email = email;
    }
    
    public void approvePengajuan() {
        System.out.println("Pengajuan disetujui.");
    }

    public void rejectPengajuan() {
        System.out.println("Pengajuan ditolak.");
    }

    public void managePengguna() {
        System.out.println("Mengelola pengguna.");
    }
}

