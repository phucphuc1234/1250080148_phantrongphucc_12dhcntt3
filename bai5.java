/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
class tamgiac {
    private double a, b, c;
    public tamgiac(double a, double b, double c) {
            this.a=a;
            this.b=b;
            this.c=c;
        }
    public double cv() {
        return a + b + c;
    }
    public double tinhheron() {
        double p = cv() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public String loai() {
        if (a == b && b == c) {
            return "tam giac deu";
        } else if (a == b || a == c || b == c) {
            return "tam giac can";
        } else if (a * a + b * b == c * c ||a * a + c * c == b * b || b * b + c * c == a * a) {
            return "tam giac vuong";
        } else {
            return "tam giac thuong";
        }
    }
    public void hienThi() {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Tam giác không hợp lệ.");
        } else {
            System.out.println("Cạnh a: " + a + ", Cạnh b: " + b + ", Cạnh c: " + c);
            System.out.println("Chu vi: " + cv());
            System.out.println("Diện tích: " + tinhheron());
            System.out.println("Loại: " + loai());
        }
    }
}
public class bai5 {
    public static void main(String[] args) {
        tamgiac tg1 = new tamgiac(2, 3, 5);
        tamgiac tg2 = new tamgiac(5, 6, 5);
        tamgiac tg3 = new tamgiac(3, 8, 7);
        System.out.println("tam giac 1:");
        System.out.println("Chu vi: " + tg1.cv());
        System.out.println("dien tich heron: " + tg1.tinhheron());
        System.out.println("Loai tam giac: " + tg1.loai());
        System.out.println("tam giac 1:");
        System.out.println("Chu vi: " + tg2.cv());
        System.out.println("dien tich heron: " + tg2.tinhheron());
        System.out.println("Loai tam giac: " + tg2.loai());
        System.out.println("tam giac 1:");
        System.out.println("Chu vi: " + tg3.cv());
        System.out.println("dien tich heron: " + tg3.tinhheron());
        System.out.println("Loai tam giac: " + tg3.loai());

    }
}

