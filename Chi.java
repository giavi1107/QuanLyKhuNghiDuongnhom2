/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author ACER
 */
public class Chi extends DocumentThuChi{
    // khai bao bien lop Thu
    private LoaiChi loaiChi;
    private double tienChi;
    // tao constructor voi day du tham so
    public Chi(LoaiChi loaiChi, double tienChi, String moTa, String tenNVQL, int id, String name, String ngay) {
        super(moTa, tenNVQL, id, name, ngay);
        this.loaiChi = loaiChi;
        this.tienChi = tienChi;
    }
    // tao phuong thuc get set
    public LoaiChi getLoaiChi() {
        return loaiChi;
    }
    
    public void setLoaiChi(LoaiChi loaiChi) {
        this.loaiChi = loaiChi;
    }

    public double getTienChi() {
        return tienChi;
    }

    public void setTienChi(double tienChi) {
        this.tienChi = tienChi;
    }
    
    public static Chi nhapChi(int id){
        String name=Input.inputString("Nhập tên nhân viên kế toán: ");
        String ngay=Input.inputDate();
        String tenNVQL=Input.inputStrings("Nhập tên nhân viên quản lý: ");
        double tienChi=Input.inputDouble("Nhập số tiền chi: ");
        String moTa=Input.inputString("Nhập mô tả: ");
        System.out.println("Nhập loại tiền chi: ");
        System.out.println("1. Tiền thuế kinh doanh \n2.Tiền bảo trì an ninh \n3.Tiền bảo trì phòng \n4. Tiền bảo trì dịch vụ \n5.Tiền bảo trì quan cảnh \n6.Tiền lương nhân viên");
        int choice=Input.inputInt("Nhập số (Mặc định: Tiền thuế kinh doanh):");
        switch (choice) {
            case 1:
                return new Chi(LoaiChi.TienThueKinhDoanh,tienChi,moTa,tenNVQL,id, name, ngay);
            case 2:
                return new Chi(LoaiChi.TienBaoTriAnNinh,tienChi,moTa,tenNVQL,id, name, ngay);
            case 3:
                return new Chi(LoaiChi.TienBaoTriPhong,tienChi,moTa,tenNVQL,id, name, ngay);
            case 4:
                return new Chi(LoaiChi.TienBaoTriDichVu,tienChi,moTa,tenNVQL,id, name, ngay);
            case 5:
                return new Chi(LoaiChi.TienBaoTriQuanCanh,tienChi,moTa,tenNVQL,id, name, ngay);
            case 6:
                return new Chi(LoaiChi.TienLuongNhanVien,tienChi,moTa,tenNVQL,id, name, ngay);
            default:
                return new Chi(LoaiChi.TienThueKinhDoanh,tienChi,moTa,tenNVQL,id, name, ngay);
        }
    }
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),super.getTenNVQL(),super.getMoTa(),loaiChi.toString(),tienChi);
    }
}
