/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes_pbo;

/**
 *
 * @author Lenovo
 */
abstract class TAK {
    protected String idTAK;
    protected String deskripsi;
    protected int poin;
    protected String status;

    public TAK(String idTAK, String deskripsi, int poin, String status) {
        this.idTAK = idTAK;
        this.deskripsi = deskripsi;
        this.poin = poin;
        this.status = "Waiting";
    }
    
    public abstract int calculatePoints();
}
