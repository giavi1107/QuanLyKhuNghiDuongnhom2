/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
/**
 *
 * @author ACER
 */
public class KhachHang extends Person{
    
    
    private LoaiKhachHang loaiKhachHang;
    // constructor 

    public KhachHang(LoaiKhachHang loaiKhachHang, String ccd, String sdt, String email, String diachi, int id, String name, String ngay) {
        super(ccd, sdt, email, diachi, id, name, ngay);
        this.loaiKhachHang = loaiKhachHang;
    }

   

    public LoaiKhachHang getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }
    
    public static KhachHang nhapKhachHang(int id)
    {
        String name=Input.inputString("Nhap ten khach hang: ");
        System.out.print("nhap dia chi khach hang");
        String diachi=Input.inputString();
        System.out.print("Nhap so dien thoai");
        String sdt=Input.inputString();
        System.out.print("Nhap can cuoc cong dan ");
        String ccd=Input.inputString();
        System.out.print("Nhap email");
        String email=Input.inputString();              
        
        String ngay=Input.inputDate();
        System.out.println("Chon loai khach hang ");
        System.out.println("1. VIP");
        System.out.println("2.Normal");
        
        int choice1 =Input.inputInt("Nhap lua chon cua ban bang so(1 hoac 2): ");
        switch(choice1)
        {
        
            case 1:
                return new KhachHang(LoaiKhachHang.VIP, ccd, sdt, email, diachi, id, name, ngay);
            
            case 2 :
                return new KhachHang(LoaiKhachHang.NORMAL, ccd, sdt, email, diachi, id, name, ngay);
 
            default:
                return new KhachHang(LoaiKhachHang.VIP, ccd, sdt, email, diachi, id, name, ngay);    
        }
        
    }

    @Override
    public String toString() {
        
        return String.format("%s %15s %15s %15s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),super.getCcd(),super.getSdt(),super.getEmail(),super.getDiachi(),loaiKhachHang.toString());
       
    }
}
