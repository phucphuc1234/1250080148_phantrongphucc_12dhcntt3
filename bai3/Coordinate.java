/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author admin
 */
public class Coordinate {

    private double x;
    private double y;
    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static Coordinate tinh(Coordinate p1, Coordinate p2) {
        return new Coordinate(p1.x + p2.x, p1.y + p2.y);
    }
    public Coordinate doixung() {
        return new Coordinate(this.x, -this.y);
    }
    public void in() {
        System.out.println("(" + x + ", " + y + ")");
    }
}


