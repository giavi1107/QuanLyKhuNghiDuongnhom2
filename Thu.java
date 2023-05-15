/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class Thu extends DocumentThuChi{
    // khai bao bien lop Thu
    private LoaiThu loaiThu;
    private double tienThu;
    // tao constructor voi day du tham so
    public Thu(LoaiThu loaiThu, double tienThu, String moTa, String tenNVQL, int id, String name, String ngay) {
        super(moTa, tenNVQL, id, name, ngay);
        this.loaiThu = loaiThu;
        this.tienThu = tienThu;
    }
    // tao phuong thuc get set
    public LoaiThu getLoaiThu() {
        return loaiThu;
    }
    
    public void setLoaiThu(LoaiThu loaiThu) {
        this.loaiThu = loaiThu;
    }

    public double getTienThu() {
        return tienThu;
    }

    public void setTienThu(double tienThu) {
        this.tienThu = tienThu;
    }
    
    public static Thu nhapThu(int id){
        String name=Input.inputString("Nhập tên nhân viên kế toán: ");
        String ngay=Input.inputDate();
        String tenNVQL=Input.inputStrings("Nhập tên nhân viên quản lý: ");
        double tienThu=Input.inputDouble("Nhập số tiền thu: ");
        String moTa=Input.inputString("Nhập mô tả: ");
        System.out.println("Nhập loại tiền thu: ");
        System.out.println("1. Tiền phòng \n2.Tiền dịch vụ \n3.Tiền hoa hồng");
        int choice=Input.inputInt("Nhập số (Mặc định: Tiền phòng):");
        switch (choice) {
            case 1:
                return new Thu(LoaiThu.TienPhong,tienThu,moTa,tenNVQL,id, name, ngay);
            case 2:
                return new Thu(LoaiThu.TienDichVu,tienThu,moTa,tenNVQL,id, name, ngay);
            case 3:
                return new Thu(LoaiThu.TienHoaHong,tienThu,moTa,tenNVQL,id, name, ngay);
            default:
                return new Thu(LoaiThu.TienPhong,tienThu,moTa,tenNVQL,id, name, ngay);
        }
    }
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),super.getTenNVQL(),super.getMoTa(),loaiThu.toString(),tienThu);
    }
}
