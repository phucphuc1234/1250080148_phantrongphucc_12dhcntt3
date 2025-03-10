/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
public class demo1 {
    public static void main(String[] args) {
     hocsinh hs1=new hocsinh();
     hs1.nhaphs();
     hs1.xuat();
     hocsinh hs2=new hocsinh(123,"Phan Trong Phuc",9.3f);
     hs2.xuat();
     hocsinh hs3=new hocsinh(hs2);
     hs3.xuat();
     hs3.sethoten("phun trong phat");
     hs3.xuat();
    
     hocsinh maxDiemHs = hs1;
        if (hs2.getDiemTrungBinh() > maxDiemHs.getDiemTrungBinh()) {
            maxDiemHs = hs2;
        }
        if (hs3.getDiemTrungBinh() > maxDiemHs.getDiemTrungBinh()) {
            maxDiemHs = hs3;
        }
        System.out.println("hoc sinh co diem trung binh cao nhat: ");
        maxDiemHs.xuat();
    }
    
}