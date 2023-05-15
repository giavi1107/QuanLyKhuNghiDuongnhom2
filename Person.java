/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class Person extends QuanLy {

    private String ccd;
    private String sdt;
    private String email;
    private String diachi;
    // constructor cho Person

    public Person(String ccd, String sdt, String email, String diachi, int id, String name, String ngay) {
        super(id, name, ngay);
        this.ccd = ccd;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public String getCcd() {
        return ccd;
    }

    public void setCcd(String ccd) {
        this.ccd = ccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    
    @Override
    public String toString() {
        return "Person{" + "ccd=" + ccd + ", sdt=" + sdt + ", email=" + email + ", diachi=" + diachi + '}';
    }
    
    
    
    
}
