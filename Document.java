/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class Document extends QuanLy{
    // khai bao bien lop Document
    private String tenNVQL;

    // tao constructor voi day du tham so
    public Document(String tenNVQL, int id, String name, String ngay) {
        super(id, name, ngay);
        this.tenNVQL = tenNVQL;
    }
    
    // tao phuong thuc get set
    public String getTenNVQL() {
        return tenNVQL;
    }

    public void setTenNVQL(String tenNVQL) {
        this.tenNVQL = tenNVQL;
    }

    
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),tenNVQL);
    }
    
}
