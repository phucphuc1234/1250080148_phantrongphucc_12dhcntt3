/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.ArrayList;
import java.util.Scanner;

class danhsachhocsinh {
    private ArrayList<hocsinh> danhSach;
    public danhsachhocsinh() {
        danhSach = new ArrayList<>();
    }
    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hs: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("nhap thong tin sv thu " + (i + 1) + ":");
            hocsinh hs = new hocsinh();
            hs.nhaphs();
            danhSach.add(hs);
        }
    }
    public void inDanhSach() {
        System.out.println("danh sach hoc sinh:");
        for (hocsinh hs : danhSach) {
            hs.xuat();
        }
    }
    public void sapXepGiamDan() {
        danhSach.sort((hs1, hs2) -> Double.compare(hs2.getDiemTrungBinh(), hs1.getDiemTrungBinh()));
    }
}
