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
public class DatPhong extends Phong{
    // khai báo ngày Thuê là static 
    private  int soNgayThue;
    // khai báo trạng thái phòng là static 
    private  TrangThaiPhong trangThaiPhong;
// khai báo Loại phòng là static 
    private  LoaiPhong loaiphong;
    
    //constructor 

    public DatPhong(int soNgayThue, TrangThaiPhong trangThaiPhong, LoaiPhong loaiphong, double giatien1m2, double dienTich, int id, String name, String ngay) {
        super(giatien1m2, dienTich, id, name, ngay);
        this.soNgayThue = soNgayThue;
        this.trangThaiPhong = trangThaiPhong;
        this.loaiphong = loaiphong;
    }

    /// getter va setter cho cac thuoc tinh 
    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public TrangThaiPhong getTrangThaiPhong() {
        return trangThaiPhong;
    }

    public void setTrangThaiPhong(TrangThaiPhong trangThaiPhong) {
        this.trangThaiPhong = trangThaiPhong;
    }

    public LoaiPhong getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(LoaiPhong loaiphong) {
        this.loaiphong = loaiphong;
    }
    
    ///////////////////////////HÀM NHẬP PHÒNG////
    
    public static DatPhong nhapDatPhong(int id)
    {
        LoaiPhong loaiphong;
        TrangThaiPhong trangThaiPhong;
        String name=Input.inputString("Nhap ten phong: ");
        System.out.print("nhap dia chi cua phong(lau 1,..): ");
        String diachi=Input.inputString();
        double giaTien1m2=Input.inputDouble("nhap gia tien 1 m2: ");
        double dienTich=Input.inputDouble("Nhap dien tich phong:");        
        
        String ngay=Input.inputString("Nhap ngay dat phong(dd/MM/yyyy)");
        int soNgayThue=Input.inputInt("Nhap so ngay thue");
        System.out.println("Chon loai phong ");
        System.out.println("1.Cao Cap Nhat/Trong");
        System.out.println("2.Cao Cap/Trong");
        System.out.println("3.Pho Thong/Trong");
        System.out.println("4.Cao Cap Nhat/Co Nguoi O");
        System.out.println("5.Cao Cap/Co Nguoi O");
        System.out.println("6.Pho Thong/Co Nguoi O");
        System.out.println("7.Cao Cap Nhat/Chua Ve Sinh");
        System.out.println("8.Cao Cap/Chua Ve Sinh");
        System.out.println("9.Pho Thong/Chua Ve Sinh");
        System.out.println("10.Cao Cap Nhat/Da Ve Sinh");
        System.out.println("11.Cao Cap/Da Ve Sinh");
        System.out.println("12.Pho Thong/Da Ve Sinh");
        System.out.println("13.Cao Cap Nhat/Dang Bao Tri");
        System.out.println("14.Cao Cap/Dang Bao Tri");
        System.out.println("15.Pho Thong/Dang Bao Tri");
        
        
        
        int choice1=Input.inputInt("nhap lua chon cua ban bang so (1/2/3): ");
        switch(choice1)
        {
            
            case 1:
                
                  loaiphong=LoaiPhong.Cao_Cap_Nhat;
                  trangThaiPhong=TrangThaiPhong.Trong;
                return new DatPhong(soNgayThue,TrangThaiPhong.Trong,LoaiPhong.Cao_Cap_Nhat, giaTien1m2, dienTich, id, name, ngay);
            case 2:
                loaiphong=LoaiPhong.Cao_Cap;
                trangThaiPhong=TrangThaiPhong.Trong;
                return new DatPhong(soNgayThue,TrangThaiPhong.Trong,LoaiPhong.Cao_Cap, giaTien1m2, dienTich, id, name, ngay);
            case 3:
                loaiphong=LoaiPhong.Pho_Thong;
                trangThaiPhong=TrangThaiPhong.Trong;
                return new DatPhong(soNgayThue,TrangThaiPhong.Trong,LoaiPhong.Pho_Thong, giaTien1m2, dienTich, id, name, ngay);
            case 4 :
                loaiphong=LoaiPhong.Cao_Cap_Nhat;
                trangThaiPhong=TrangThaiPhong.Co_Khach_O;
                return new DatPhong(soNgayThue,TrangThaiPhong.Co_Khach_O,LoaiPhong.Cao_Cap_Nhat, giaTien1m2, dienTich, id, name, ngay);
            case 5:
                loaiphong=LoaiPhong.Cao_Cap;
                trangThaiPhong=TrangThaiPhong.Co_Khach_O;
                return new DatPhong(soNgayThue,TrangThaiPhong.Co_Khach_O,LoaiPhong.Cao_Cap, giaTien1m2, dienTich, id, name, ngay);
            case 6:
                loaiphong=LoaiPhong.Pho_Thong;
                trangThaiPhong=TrangThaiPhong.Co_Khach_O;
                return new DatPhong(soNgayThue,TrangThaiPhong.Co_Khach_O,LoaiPhong.Pho_Thong, giaTien1m2, dienTich, id, name, ngay);    
            case 7 :
                loaiphong=LoaiPhong.Cao_Cap_Nhat;
                trangThaiPhong=TrangThaiPhong.Chua_Ve_Sinh;
                return new DatPhong(soNgayThue,TrangThaiPhong.Chua_Ve_Sinh,LoaiPhong.Cao_Cap_Nhat, giaTien1m2, dienTich, id, name, ngay);
            case 8:
                loaiphong=LoaiPhong.Cao_Cap;
                trangThaiPhong=TrangThaiPhong.Chua_Ve_Sinh;
                return new DatPhong(soNgayThue,TrangThaiPhong.Chua_Ve_Sinh,LoaiPhong.Cao_Cap, giaTien1m2, dienTich, id, name, ngay);
            case 9:
                loaiphong=LoaiPhong.Pho_Thong;
                trangThaiPhong=TrangThaiPhong.Chua_Ve_Sinh;
                return new DatPhong(soNgayThue,TrangThaiPhong.Chua_Ve_Sinh,LoaiPhong.Pho_Thong, giaTien1m2, dienTich, id, name, ngay);
            case 10 :
                loaiphong=LoaiPhong.Cao_Cap_Nhat;
                trangThaiPhong=TrangThaiPhong.Da_Ve_Sinh;
                return new DatPhong(soNgayThue,TrangThaiPhong.Da_Ve_Sinh,LoaiPhong.Cao_Cap_Nhat, giaTien1m2, dienTich, id, name, ngay);
            case 11:
                loaiphong=LoaiPhong.Cao_Cap;
                trangThaiPhong=TrangThaiPhong.Da_Ve_Sinh;
                return new DatPhong(soNgayThue,TrangThaiPhong.Da_Ve_Sinh,LoaiPhong.Cao_Cap, giaTien1m2, dienTich, id, name, ngay);
            case 12:
                loaiphong=LoaiPhong.Pho_Thong;
                trangThaiPhong=TrangThaiPhong.Da_Ve_Sinh;
                return new DatPhong(soNgayThue,TrangThaiPhong.Da_Ve_Sinh,LoaiPhong.Pho_Thong, giaTien1m2, dienTich, id, name, ngay);
            case 13 :
                loaiphong=LoaiPhong.Cao_Cap_Nhat;
                trangThaiPhong=TrangThaiPhong.Dang_Bao_Tri;
                return new DatPhong(soNgayThue,TrangThaiPhong.Dang_Bao_Tri,LoaiPhong.Cao_Cap_Nhat, giaTien1m2, dienTich, id, name, ngay);
            case 14:
                loaiphong=LoaiPhong.Cao_Cap;
                trangThaiPhong=TrangThaiPhong.Dang_Bao_Tri;
                return new DatPhong(soNgayThue,TrangThaiPhong.Dang_Bao_Tri,LoaiPhong.Cao_Cap, giaTien1m2, dienTich, id, name, ngay);
            case 15:
                loaiphong=LoaiPhong.Pho_Thong;
                trangThaiPhong=TrangThaiPhong.Dang_Bao_Tri;
                return new DatPhong(soNgayThue,TrangThaiPhong.Dang_Bao_Tri,LoaiPhong.Pho_Thong, giaTien1m2, dienTich, id, name, ngay);    
            default:
                loaiphong=LoaiPhong.Pho_Thong;
                System.out.println("mac dinh: pho thong , trong ");
                trangThaiPhong=TrangThaiPhong.Trong;
                return new DatPhong(soNgayThue,TrangThaiPhong.Trong,LoaiPhong.Pho_Thong, giaTien1m2, dienTich, id, name, ngay);
                
                
               
        }
        
        
                
    }
            
    
    
    public double GiaPhong()
    {
        if(loaiphong==LoaiPhong.Cao_Cap_Nhat)
        {return super.GiaPhong()*this.soNgayThue*1.5;}
        else
        {
            return super.GiaPhong()*this.soNgayThue;
        }
  
    }

    
    @Override
    public String toString() {
        
        return String.format("%s %15s %15s %15s %15s %15s %15s %15s",super.getId(),super.getName(),super.getNgay(),super.getGiatien1m2(),super.getDienTich(),soNgayThue,trangThaiPhong.toString(),loaiphong.toString());
        
    }
    
    
    
    
}


