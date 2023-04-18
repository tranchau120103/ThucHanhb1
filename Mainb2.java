package TH1;

import java.util.ArrayList;
import java.util.List;

public class Mainb2 {

    public static void main(String[] args) {
        LopHocPhan lopHocPhan=new LopHocPhan();
        lopHocPhan.maLHP="123456";
        lopHocPhan.tenLHP="LT huong doi tuong";
        lopHocPhan.tenGV="Nguyen Van A";
        lopHocPhan.thongTinLopHoc="Thu 7, Tiet 4-6, phong A1.1";
        SinhVien sv1=new SinhVien();
        SinhVien sv2=new SinhVien();
        SinhVien sv3=new SinhVien();
        sv1.maSV="123";
        sv1.hoTen="Nguyen Van A";
        sv2.maSV="543";
        sv2.hoTen="Le Thi B";
        sv3.maSV="321";
        sv3.hoTen="Luong Van C";
        List<SinhVien> list= new ArrayList<>();
        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        System.out.println("-Ma LHP: "+lopHocPhan.maLHP);
        System.out.println("-Ten LHP: "+lopHocPhan.tenLHP);
        System.out.println("-GV giang day: "+lopHocPhan.tenGV);
        System.out.println("-Thong tin buoi hoc: "+lopHocPhan.thongTinLopHoc);
        System.out.println("\nDanh sach sinh vien");
        System.out.println(sv1.maSV+" | "+sv1.hoTen);
        System.out.println(sv2.maSV+" | "+sv2.hoTen);
        System.out.println(sv3.maSV+" | "+sv3.hoTen);
        System.out.println("Tong so sinh vien:"+list.size());
    }
    
}