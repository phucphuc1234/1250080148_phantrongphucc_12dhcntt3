/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        Coordinate p1 = new Coordinate(1,2);
        Coordinate p2 = new Coordinate(3, 4);
        System.out.print("Toa do p1: ");
        p1.in();
        System.out.print("Toa do p2: ");
        p2.in();
        Coordinate sumPoint = Coordinate.tinh(p1, p2);
        System.out.print("tong p1 va p2: ");
        sumPoint.in();
        Coordinate doiXungP1 = p1.doixung();
        System.out.print("diem doi xung quanh truc hoanh: ");
        doiXungP1.in();
    }
}

