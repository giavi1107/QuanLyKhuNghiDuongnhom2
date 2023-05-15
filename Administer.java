/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class Administer {
//    private ArrayList <QuanLy> listNhanVien =new ArrayList<>();
//    private ArrayList <QuanLy> listKhachHang =new ArrayList<>();
//    private ArrayList <QuanLy> listDatPhong =new ArrayList<>();
//    private ArrayList <QuanLy> listDichVu =new ArrayList<>();
//    private ArrayList <QuanLy> listGiayPhep =new ArrayList<>();
//    private ArrayList <QuanLy> listThu =new ArrayList<>();
//    private ArrayList <QuanLy> listChi =new ArrayList<>();
      // danh sach chua nguoi thanh phan la nhan vien 
    private ArrayList <NhanVien> listNhanVien =new ArrayList<>();
    // danh sach chua nguoi thanh phan la khach hang 
    private ArrayList <Person> listKhachHang =new ArrayList<>();
    private ArrayList <Phong> listDatPhong =new ArrayList<>();
    private ArrayList <QuanLy> listDichVu =new ArrayList<>();
    private ArrayList <QuanLy> listGiayPhep =new ArrayList<>();
    private ArrayList <QuanLy> listThu =new ArrayList<>();
    private ArrayList <QuanLy> listChi =new ArrayList<>();
    //  doi tuong duoc tra ve
    
    private void addNhanVien(NhanVien t)
    {
        listNhanVien.add(t);
    }
    
    private void addKhachHang(KhachHang t)
    {
        listKhachHang.add(t);
    }
    
    private void addDatPhong(DatPhong t)
    {
        listDatPhong.add(t);
    }
    
    private void addDichVu(DichVu t)
    {
        listDichVu.add(t);
    }
    
    private void addGiayPhep(DocumentGiayPhep t)
    {
         listGiayPhep.add(t);
    }
    
    private void addThu(Thu t)
    {
        listThu.add(t);
    }
    
    private void addChi(Chi t)
    {
        listChi.add(t);
    }


    // tao ham cac doi tuong co chua trong mang
    private void showNhanVien()
    {
   
        System.out.println("Danh sách nhân viên :");
        // neu mang rong se xuat ra thong bao
        if(this.listNhanVien.size()==0)
        {
            System.out.println("Trống!!");
       
        }
       
        String label= String.format("%s %15s %15s %15s %15s %15s %15s %15s %15s","Id","Name","Ngày","CCCD","SĐT","Email","Địa chỉ","Chức Vụ","Tiền lương");
        System.out.println(label);
        for (QuanLy quanLy : listNhanVien) {
            System.out.println(quanLy.toString());
        }
       
    }
    
    // tao ham cac doi tuong co chua trong mang
    private void showKhachHang()
    {
        System.out.println("Danh sách khách hàng:");
        // neu mang rong se xuat ra thong bao
        if(this.listKhachHang.size()==0)
        {
            System.out.println("Trống!!");
        }
        String label= String.format("%s %15s %15s %15s %15s %15s %15s %15s","Id","Name","Ngày","CCCD","SĐT","Email","Địa chỉ","Loại khách hàng");
        System.out.println(label);
        for (QuanLy quanLy : listKhachHang) {


            System.out.println(quanLy.toString());
        }
       
    }
    
    // tao ham cac doi tuong co chua trong mang
    private void showDatPhong()
    {
   
        System.out.println("Danh sách đặt phòng :");
        // neu mang rong se xuat ra thong bao
        if(this.listDatPhong.size()==0)
        {
            System.out.println("Trống!!");
       
        }
       
        String label= String.format("%s %15s %15s %15s %15s %15s %15s %15s","Id","Name","Ngày","Giá tiền thuê(1m2)","Diện tích","Số ngày thuê","Trạng thái phòng","Loại Phòng");
        System.out.println(label);
        for (Phong quanLy : listDatPhong) {
            System.out.println(quanLy.toString());
        }
       
    }
    
//    private void showPhongTrong()
//    {
//   
//        System.out.println("Danh sách đặt phòng :");
//        // neu mang rong se xuat ra thong bao
//        if(this.listDatPhong.size()==0)
//        {
//            System.out.println("Trống!!");
//       
//        }
//       
//        String label= String.format("%s %15s %15s %15s %15s %15s %15s %15s","Id","Name","Ngày","Giá tiền thuê(1m2)","Diện tích","Số ngày thuê","Trạng thái phòng","Loại Phòng");
//        System.out.println(label);
//        for (DatPhong datPhong : listDatPhong) {
//            if(điều kiện trống){
//                System.out.println(datPhong.toString());
//            }
//        }
//       
//    }
    
  
    // tao ham cac doi tuong co chua trong mang
    private void showDichVu()
    {
   
        System.out.println("Danh sách dịch vụ :");
        // neu mang rong se xuat ra thong bao
        if(this.listDichVu.size()==0)
        {
            System.out.println("Trống!!");
       
        }
        
        String label= String.format("%s %15s %15s %15s %15s ","Id","Name","Ngày","Loại dịch vụ","Giá tiền");
        System.out.println(label);
        for (QuanLy quanLy : listDichVu){
            System.out.println(quanLy.toString());
        }
       
    }
    
    private void showGiayPhep()
    {
   
        System.out.println("Danh sách giấy phép :");
        // neu mang rong se xuat ra thong bao
        if(this.listGiayPhep.size()==0)
        {
            System.out.println("Trống!!");
       
        }
       
        String label= String.format("%s %15s %15s %15s %15s","Id","Name","Ngày","Tên NVQL","Loại giấy phép");
        System.out.println(label);
        for(QuanLy quanLy : listGiayPhep){
            System.out.println(quanLy.toString());
        }
       
    }
    
    private void showThu()
    {
   
        System.out.println("Danh sách thu :");
        // neu mang rong se xuat ra thong bao
        if(this.listThu.size()==0)
        {
            System.out.println("Trống!!");
       
        }
       
        String label= String.format("%s %15s %15s %15s %15s %15s %15s","Id","Name","Ngày","Tên NVQL","Mô tả","Loại thu","Tiền thu");
        System.out.println(label);
        for(QuanLy quanLy : listThu){
            System.out.println(quanLy.toString());
        }
       
    }
    
    private void showChi()
    {
   
        System.out.println("Danh sách chi :");
        // neu mang rong se xuat ra thong bao
        if(this.listChi.size()==0)
        {
            System.out.println("Trống!!");
       
        }
       
        String label= String.format("%s %15s %15s %15s %15s %15s %15s","Id","Name","Ngày","Tên NVQL","Mô tả","Loại chi","Tiền chi");
        System.out.println(label);
        for(QuanLy quanLy : listChi){
            System.out.println(quanLy.toString());
        }
    }
    
//    private double tongLuongNV()
//    {
//        double tongLuong =0;
//        for(NhanVien nv: listNhanVien){
//            tongLuong+=nv.getTienLuong();
//        }
//        return tongLuong;
//    }

    private double tongsoTienThuDatPhong()
    {
        double sumTienDatPhong =0;
        for(Phong dp: listDatPhong){
            sumTienDatPhong+=dp.GiaPhong();
        }
        return sumTienDatPhong ;
    }
//    
//    private double tongsoTienThuDichVu()
//    {
//        double sumTienDichVu  =0;
//        for(QuanLy quanLy: listDichVu){
//            sumTienDichVu +=quanLy.getGiaTien();
//        }
//        return sumTienDichVu ;
//    }
//    
//    private double tongThu()
//    {
//        double sumThu =0;
//        for(QuanLy quanLy: listThu){
//            sumThu +=quanLy.getTienThu();
//        }
//        return sumThu +tongsoTienThuDatPhong() + tongsoTienThuDichVu();
//    }
//    private double tongChi()
//    {
//        double sumChi  =0;
//        for(QuanLy quanLy: listThu){
//            sumChi+=quanLy.getTienChi();
//        }
//        return sumChi + tongLuongNV();
//    }
//    
    
    // xóa đối tượng ở vị trí thứ id 
    private void xoaKhachHang(int id){
        
        for(Person kh:listKhachHang)
        {
            if(kh.getId()==id)
            {this.listKhachHang.remove(kh);}
        }
        
    }

     private void subMenu(int choice)
     {
        if(choice==1)
        {
            System.out.println("1. Thêm thông tin nhân viên");
            System.out.println("2. Thêm thông tin khách hàng");
            System.out.println("3. Thêm thông tin đặt phòng");
            System.out.println("4. Thêm thông tin dịch vụ");
            System.out.println("5. Thêm thông tin giấy phép");
            System.out.println("6. Thêm thông tin tiền thu");
            System.out.println("7. Thêm thông tin tiền chi");
        }
        else if (choice ==2)
        {
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Hiển thị danh sách khách hàng");
            System.out.println("3. Hiển thị danh sách đặt phòng");
            System.out.println("4. Hiển thị danh sách dịch vụ");
            System.out.println("5. Hiển thị danh sách giấy phép");
            System.out.println("6. Hiển thị danh sách tiền thu");
            System.out.println("7. Hiển thị danh sách tiền chi");
        }
        else if (choice ==3)
        {
            System.out.println("1. Xóa khách hàng");
            //System.out.println("2. Cập nhập phòng");
        }
        else if(choice==4){
            System.out.println("1. Tổng số nhân viên");
            System.out.println("2. Tổng số khách hàng");
            System.out.println("3. Tổng số đặt phòng");
            System.out.println("4. Tổng số dịch vụ");
            System.out.println("5. Tổng số giấy phép");
        }
//        else if(choice==5){
//            System.out.println("1. Tổng số tiền lương nhân viên");
//            System.out.println("2. Tổng số tiền có được từ đặt phòng");
//            System.out.println("3. Tổng số tiền có được từ dịch vụ");
//            System.out.println("4. Tổng số tiền thu");
//            System.out.println("5. Tổng số tiền chi");
//            System.out.println("6. Tổng số doanh thu");
//        }
         
     }
     
    public void menu()
    {
        while(true)
        {
            System.out.println("1. Thêm thông tin trong khu nghĩ dưỡng");
            System.out.println("2. Hiển thị danh sách trong khu nghĩ dưỡng");
            //System.out.println("3. Các thủ tục khi trả phòng ");
            System.out.println("3. Hiển thị các loại tổng số");
            System.out.println("4. Tổng số tiền có được từ đặt phòng:");
            System.out.println("5. Thoát");
            int choice =Input.inputInt("Nhập lựa chọn: ");
            menu(choice);
        }

    }
    private void menu(int choice)
    {
        int choice1=0;
        switch(choice){
            case 1 :
                subMenu(choice);
                choice1=Input.inputInt("Nhập lựa chọn: ");
                if(choice1==1)
                {
                   //bien t da duoc gan la doi tuong duoc trả ve
                    NhanVien t=NhanVien.nhapNhanVien(listNhanVien.size()+1);
                    addNhanVien(t);

                }
                else if(choice1==2)
                {
                    KhachHang t=KhachHang.nhapKhachHang(listKhachHang.size()+1);
                    addKhachHang(t);

                }
                // loithong 
                else if(choice1==3)
                {
                    DatPhong t=DatPhong.nhapDatPhong(listDatPhong.size()+1);
                    addDatPhong(t);

                }
                else if(choice1==4)
                {
                    DichVu t=DichVu.nhapDichVu(listDichVu.size()+1);
                    addDichVu(t);

                }
                else if(choice1==5)
                {
                    DocumentGiayPhep t=DocumentGiayPhep.nhapGiayPhep(listGiayPhep.size()+1);
                    addGiayPhep(t);

                }
                else if(choice1==6)
                {
                    Thu t=Thu.nhapThu(listThu.size()+1);
                    addThu(t);

                }
                else if(choice1==7)
                {
                    Chi t=Chi.nhapChi(listChi.size()+1);
                    addChi(t);
                }
                break;
            case 2 :
                subMenu(choice);
                choice1=Input.inputInt("Nhập lựa chọn: ");
                if(choice1==1)
                {
                    showNhanVien();
                }
                else if(choice1==2)
                {
                    showKhachHang();
                }
                if(choice1==3)
                {
                    showDatPhong();

                }
                else if(choice1==4)
                {
                    showDichVu();

                }
                if(choice1==5)
                {
                    showGiayPhep();
                }
                else if(choice1==6)
                {
                    showThu();

                }
                if(choice1==7)
                {
                    showChi();
                }
                break;
//            case 3 :
//                subMenu(choice);
//                choice1=Input.inputInt("Nhập lựa chọn: ");
//                if(choice1==1)
//                {
//                    int id=Input.inputInt("Nhap ma khach hang ban muon xoa");
//                    xoaKhachHang(id);
//                }
////                else if(choice1==2)
////                {
////                    //cập nhật/xóa đặt phòng
////                }
//                break;  
            case 3 :
                subMenu(choice);
                choice1=Input.inputInt("Nhập lựa chọn: ");
                if(choice1==1)
                {
                    System.out.println("Tổng số nhân viên : "+listNhanVien.size());
                }
                else if(choice1==2)
                {
                    System.out.println("Tổng số khách hàng: "+listKhachHang.size());
                }
                if(choice1==3)
                {
                    System.out.println("Tổng số phòng đã được đặt: "+listDatPhong.size());
                }
                else if(choice1==4)
                {
                    System.out.println("Tổng số dịch vụ đã được đặt: "+listDichVu.size());
                }
                if(choice1==5)
                {
                    System.out.println("Tổng số giấy phép: "+listGiayPhep.size());
                }
                break;
            case 4 :
                System.out.println("Tổng số tiền có được từ đặt phòng: "+tongsoTienThuDatPhong());
                
//                if(choice1==3)
//                {
//                    System.out.println("Tổng số tiền có được từ dịch vụ: "+tongsoTienThuDichVu());
//                }
//                else if(choice1==4)
//                {
//                    System.out.println("Tổng số tiền thu: "+tongThu());
//                }
//                if(choice1==5)
//                {
//                    System.out.println("Tổng số tiền chi: "+tongChi());
//                }
//                else if(choice1==6)
//                {
//                    System.out.println("Tổng số doanh thu: "+ ( tongThu() - tongChi() ));
//                }
//                break;
//            case 6 :
//                System.exit(0);
//                break;
        }

   }
        
}