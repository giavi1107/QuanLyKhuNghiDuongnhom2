/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class DocumentThuChi extends Document{
    // khai bao bien lop DocumentThuChi
    private String moTa;
    // tao constructor voi day du tham so
    public DocumentThuChi(String moTa, String tenNVQL, int id, String name, String ngay) {
        super(tenNVQL, id, name, ngay);
        this.moTa = moTa;
    }
    // tao phuong thuc get set

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),moTa);
    }
}
