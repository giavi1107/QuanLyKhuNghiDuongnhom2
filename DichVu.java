/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
// tao DichVu ke thua QuanLy
public class DichVu extends QuanLy{
    // khai bao bien lop DichVu
    private LoaiDichVu loaiDichVu;
    private double giaTien;
    
    // tao constructor voi day du tham so
    public DichVu(LoaiDichVu loaiDichVu, double giaTien,int id, String name, String ngay) {
        super(id, name, ngay);
        this.loaiDichVu = loaiDichVu;
        this.giaTien = giaTien;
    }
    
    // tao phuong thuc get set

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    
    public static DichVu nhapDichVu(int id){
        String name=Input.inputString("Nhập tên dịch vụ: ");
        String ngay=Input.inputDate();
        double giaTien=Input.inputDouble("Nhập giá dịch vụ: ");
        System.out.println("Nhập loại dịch vụ: ");
        System.out.println("1. Nhà hàng \n2.Spa \n3.Bar \n4.Hồ bơi \n5.Golf \n6.Tennis \n7.Giặt ủi");
        int choice=Input.inputInt("Nhập số (Mặc định: Nhà Hàng):");
        
        switch (choice) {
            case 1:
                return new DichVu(LoaiDichVu.NhaHang,giaTien,id, name, ngay);
            case 2:
                return new DichVu(LoaiDichVu.Spa,giaTien,id, name, ngay);
            case 3:
                return new DichVu(LoaiDichVu.Bar,giaTien,id, name, ngay);
            case 4:
                return new DichVu(LoaiDichVu.HoBoi,giaTien,id, name, ngay);
            case 5:
                return new DichVu(LoaiDichVu.Golf,giaTien,id, name, ngay);
            case 6:
                return new DichVu(LoaiDichVu.Tennis,giaTien,id, name, ngay);
            case 7:
                return new DichVu(LoaiDichVu.GiatUi,giaTien,id, name, ngay);
            default:
                return new DichVu(LoaiDichVu.NhaHang,giaTien,id, name, ngay);
        }
    }
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(), loaiDichVu.toString(),giaTien);
    }
}
