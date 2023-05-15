/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class DocumentGiayPhep extends Document{
    // khai bao bien lop DocumentGiayPhep
    private LoaiGiayPhep loaiGiayPhep;
    
    // tao constructor voi day du tham so
    public DocumentGiayPhep(LoaiGiayPhep loaiGiayPhep, String tenNVQL, int id, String name, String ngay) {
        super(tenNVQL, id, name, ngay);
        this.loaiGiayPhep = loaiGiayPhep;
    }
    
    // tao phuong thuc get set

    public LoaiGiayPhep getLoaiGiayPhep() {
        return loaiGiayPhep;
    }

    public void setLoaiGiayPhep(LoaiGiayPhep loaiGiayPhep) {
        this.loaiGiayPhep = loaiGiayPhep;
    }
    
    public static DocumentGiayPhep nhapGiayPhep(int id){
        String name=Input.inputString("Nhập tên giấy tờ: ");
        String ngay=Input.inputDate();
        String tenNVQL=Input.inputStrings("Nhập tên nhân viên quản lý: ");
        System.out.println("Nhập loại giấy tờ: ");
        System.out.println("1. Kinh Doanh \n2.Hồ sơ doanh nghiệp \n3.An ninh Trật Tự \n4. An toàn phòng cháy chữa cháy \n5. Vệ sinh an toàn thực phẩm");
        int choice=Input.inputInt("Nhập số (Mặc định: Kinh doanh):");
        switch (choice) {
            case 1:
                return new DocumentGiayPhep(LoaiGiayPhep.KinhDoanh,tenNVQL,id, name, ngay);
            case 2:
                return new DocumentGiayPhep(LoaiGiayPhep.HoSoDoanhNghiep,tenNVQL,id, name, ngay);
            case 3:
                return new DocumentGiayPhep(LoaiGiayPhep.AnNinhTratTu,tenNVQL,id, name, ngay);
            case 4:
                return new DocumentGiayPhep(LoaiGiayPhep.AnToanPhongChayChuaChay,tenNVQL,id, name, ngay);
            case 5:
                return new DocumentGiayPhep(LoaiGiayPhep.VeSinhAnToanThucPham,tenNVQL,id, name, ngay);
            default:
                return new DocumentGiayPhep(LoaiGiayPhep.KinhDoanh,tenNVQL,id, name, ngay);
        }
    }
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(), super.getTenNVQL(), loaiGiayPhep.toString());
    }
}
