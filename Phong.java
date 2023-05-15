/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
/**
 *
 * @author M S I
 */
public class Phong extends QuanLy {
    
    private double giatien1m2;
    private double dienTich;
    
    //constructor 

    public Phong(double giatien1m2, double dienTich, int id, String name, String ngay) {
        super(id, name, ngay);
        this.giatien1m2 = giatien1m2;
        this.dienTich = dienTich;
    }
    
    // getter va setter 

    public double getGiatien1m2() {
        return giatien1m2;
    }

    public void setGiatien1m2(double giatien1m2) {
        this.giatien1m2 = giatien1m2;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    
    // tra ve gia tien phong kieu double 
    public double GiaPhong()
    {
        return giatien1m2*dienTich;
        
    }

    @Override
    public String toString() {
        return "Phong{" + "giatien1m2=" + giatien1m2 + ", dienTich=" + dienTich + '}';
    }
    
    
    
    
    
    
}


