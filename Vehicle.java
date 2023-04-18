
package btlop;

import java.util.Scanner;

public class Vehicle {

    public String TenChuXe,LoaiXe;
    public int DungTich;
    public float TriGia,Thue;
    Scanner scan= new Scanner(System.in);
    
    public Vehicle(){
    }
    public Vehicle(String TenChuXe, String LoaiXe, int DungTich,float TriGia,float Thue){
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;
        this.Thue = Thue;
    }
    public String getTenChuXe(){
        return TenChuXe;
    }
    public void setTenChuXe(String TenChuXe){
        this.TenChuXe = TenChuXe;
    }
    public String getLoaiXe(){
        return LoaiXe;
    }
    public void setLoaiXe(String LoaiXe){
        this.LoaiXe = LoaiXe;
    }
    public int getDungTich(){
        return DungTich;
    }
    public void setDungTich(int DungTich){
        this.DungTich = DungTich;
    }
    public float getTriGia(){
        return TriGia;
    }
    public void setTriGia(float TriGia){
        this.TriGia = TriGia;
    }
    public float getThue(){
         return Thue;
    }
    public void setThue(float Thue) {
        this.Thue = Thue;
    }
    public void Nhap(){
        System.out.println("Nhap ten chu xe:");
        TenChuXe=scan.nextLine();
        System.out.println("Nhap loai xe:");
        LoaiXe=scan.nextLine();
        System.out.println("Nhap dung tich:");
        DungTich=scan.nextInt();
        System.out.println("Nhap tri gia:");
        TriGia=scan.nextFloat();
    }
    public double Thue(){
        double thue = 0;
        if(DungTich<100){
            thue = (0.01*TriGia);  
        }
        if(DungTich>=100&DungTich<200);{
            thue = (0.03*TriGia);
        }
        if(DungTich>=200){
            thue=(0.05*TriGia);
        }
        else{
            System.out.println("Gia tri dung tich khong hop le");
        }
        return thue;
    }
    public void Xuat(){
        System.out.println("Ten chu xe:"+TenChuXe);
        System.out.println("Loai xe:"+LoaiXe);
        System.out.println("Dung tich:"+DungTich);
        System.out.println("Tri gia:"+TriGia);
        System.out.println("Thue phai nop:" +Thue()+"\n");
    }
    
}


