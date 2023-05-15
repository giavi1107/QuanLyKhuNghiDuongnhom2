/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class NhanVien extends Person{
    
    private ChucVu chucvu;
// khai bao tien luong là static 
    private  double tienLuong;

    // constructor 
    public NhanVien(ChucVu chucvu, double tienLuong, String ccd, String sdt, String email, String diachi, int id, String name, String ngay) {
        super(ccd, sdt, email, diachi, id, name, ngay);
        this.chucvu = chucvu;
        this.tienLuong = tienLuong;
    }
    
    // getter va setter 

    public ChucVu getChucvu() {
        return chucvu;
    }

    public void setChucvu(ChucVu chucvu) {
        this.chucvu = chucvu;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
    
    // ham nhap nhan vien 
    public static NhanVien nhapNhanVien(int id)
    {
        String name=Input.inputString("Nhap ten nhan vien: ");
        System.out.print("nhap dia chi nhan vien");
        String diachi=Input.inputString();
        System.out.print("Nhap so dien thoai");
        String sdt=Input.inputString();
        System.out.print("Nhap can cuoc cong dan ");
        String ccd=Input.inputString();
        System.out.print("Nhap email");
        String email=Input.inputString();              
        String ngay=Input.inputDate();
        int tienLuong=Input.inputInt("Nhap tien luong(int): ");
        System.out.println("Chon loai chuc vu");
        System.out.println("1.Giam doc");
        System.out.println("2.Le tan");
        System.out.println("3.An Ninh Bao ve");
        System.out.println("4.PhucVuPhong;");
        System.out.println("5.PhucVuMonAn");
        System.out.println("6.TongDai");
        System.out.println("7.ChuyenVienYTe");
        System.out.println("8.TiepThi");
        System.out.println("9.KeToan");
        System.out.println("10.DauBep");
        System.out.println("11.NVHanhLY");
        System.out.println("12.NVKyThuat");
        System.out.println("13.IT");
        System.out.println("14KySuCanhQuan");
        System.out.println("15.KySuMoitruong");
        int choice =Input.inputInt("hay nhap lua chon cua ban (bang so nguyen)");
        switch(choice)
            {
            case 1:
                    return new NhanVien(ChucVu.Giam_Doc, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 2:
                    return new NhanVien(ChucVu.Le_Tan, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 3:
                    return new NhanVien(ChucVu.An_Ninh_Baove, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 4:
                    return new NhanVien(ChucVu.Phuc_Vu_Phong, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 5:
                    return new NhanVien(ChucVu.Phuc_Vu_MonAn, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 6:
                    return new NhanVien(ChucVu.Tong_Dai, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 7:
                    return new NhanVien(ChucVu.Chuyen_Vien_YTe, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 8:
                    return new NhanVien(ChucVu.Tiep_Thi, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 9:
                    return new NhanVien(ChucVu.Ke_Toan, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 10:
                    return new NhanVien(ChucVu.Dau_Bep, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 11:
                    return new NhanVien(ChucVu.NV_Hanh_LY, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
       
            case 12:
                    return new NhanVien(ChucVu.NV_Ky_Thuat, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 13:
                    return new NhanVien(ChucVu.IT, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            case 14:
                    return new NhanVien(ChucVu.Ky_Su_Canh_Quan, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
    
            case 15:
                    return new NhanVien(ChucVu.Ky_Su_Moitruong, tienLuong, ccd, sdt, email, diachi, id, name, ngay);
            
            default:
                    return new NhanVien(ChucVu.Giam_Doc, tienLuong, ccd, sdt, email, diachi, id, name, ngay);       

        }
    }
    
    @Override
    public String toString() {
        return String.format("%s %15s %15s %15s %15s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),super.getCcd(),super.getSdt(),super.getEmail(),super.getDiachi(),chucvu.toString(),tienLuong);
        
    }
    
    
    
}
