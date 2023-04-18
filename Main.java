
package btlop;

public class Main {
    public static void main(String[] args){
        Vehicle xe1= new Vehicle();
        Vehicle xe2= new Vehicle();
        Vehicle xe3= new Vehicle();
        
        xe1.Nhap();
        xe2.Nhap();
        xe3.Nhap();
        System.out.println("Ten chu xe  Loai xe  Dung tich  Tri gia  Thue phai nop");
        System.out.println("");
        xe1.Xuat();
        xe2.Xuat();
        xe3.Xuat();
    }
}
