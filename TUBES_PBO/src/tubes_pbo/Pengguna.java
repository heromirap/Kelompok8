/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes_pbo;

/**
 *
 * @author Lenovo
 */
abstract class Pengguna {
    protected String nama;
    protected String password;
    protected String role;

    public Pengguna(String nama, String password, String role) {
        this.nama= nama;
        this.password = password;
        this.role = role;
    }
    
   public boolean login(String nama, String password) {
        return this.nama.equals(nama) && this.password.equals(password);
    }

    public void logout() {
        System.out.println("Logged out.");
    }
    
}
