package ru.stqa.pft.sandbox;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        this.length=0;
        this.width=0;
    }
    public  Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public static double Area (Rectangle r){
        return r.length*r.width;
    }
    public  double Area(){
        return this.length*this.width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2, 5);
        System.out.println(r1.Area());
    }
}
