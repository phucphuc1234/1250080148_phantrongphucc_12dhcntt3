/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
public class hocsinh {
    // Lớp Học Sinh

    private int maso;
    private String hoten;
    private double diemTrungBinh;

    // Constructor không tham số
    public hocsinh() {
    }

    // Constructor có tham số
    public hocsinh(int maso, String hoten, double diemTrungBinh) {
        this.maso = maso;
        this.hoten = hoten;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Constructor sao chép
    public hocsinh(hocsinh hs) {
        this.maso = hs.maso;
        this.hoten = hs.hoten;
        this.diemTrungBinh = hs.diemTrungBinh;
    }

    // Getter và Setter
    public int getmaSo() {
        return maso; 
    }
    public void setmaSo(int maso) {
        this.maso = maso; 
    }

    public String gethoten() { 
        return hoten; 
    }
    public void sethoten(String hoten) {
        this.hoten = hoten; 
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh; 
    }
   public void nhaphs(){
   Scanner scanner =new Scanner(System.in);
   System.out.println("nhap ma so: ");
   maso=scanner.nextInt();
   System.out.println("nhap ho ten: ");
   hoten =scanner.nextLine();
   System.out.println("nhap diem trung binh: ");
   diemTrungBinh=scanner.nextDouble();
   }
   public void xuat(){
  System.out.println(maso+" "+hoten+" "+diemTrungBinh);
}
   public void xeploai(){
  if(diemTrungBinh>9){      
      System.out.println("xep loai gioi");
  }
      else if(diemTrungBinh<9 && diemTrungBinh >=7){
               System.out.println("xep loai kha");
      }
               else if(diemTrungBinh<5){
                   System.out.println("xep loai yeu");
}
               else{
                   System.out.println("xep loai trung binh");
               }
}
}
