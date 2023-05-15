/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class QuanLy {
    // khai bao cac bien chua cac thong tin co ban cua QuanLy
    private int id;
    private String name;
    private String ngay;
    // tao constructor day du tham so
    public QuanLy(int id, String name, String ngay) {
        this.id = id;
        this.name = name;
        this.ngay = ngay;
    }
    
    // tao phuong thuc get set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    
    @Override
    public String toString() {
        return String.format("%s %15s %15s",this.id,this.name,this.ngay);
    }
}
