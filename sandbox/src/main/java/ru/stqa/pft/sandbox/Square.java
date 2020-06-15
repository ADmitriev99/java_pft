package ru.stqa.pft.sandbox;

public class Square {

    private double length;

    public Square(){
        this.length=0;
    }
    public  Square(double length){
        this.length=length;
    }
    public static double Area (Square r){
        return r.length*r.length;
    }
    public double Area(){
        return this.length*this.length;
    }

    public static void main(String[] args) {
        Square r = new Square();
        Square r1 = new Square(5);
        //System.out.println(Area(r1));
        System.out.println(r1.Area());
    }

}
