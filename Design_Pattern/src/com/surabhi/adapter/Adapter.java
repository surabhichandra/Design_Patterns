package com.surabhi.adapter;

interface Movable{
    public void move();
}
class Car implements Movable{
    public void move(){
        System.out.println("Car is moving");
    }
}
interface Flyable{
    public void fly();
}
class Aeroplane implements Flyable{
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class Adapterflytomove implements Movable{
    Flyable flyable;

    public Adapterflytomove(Flyable flyable) {
        this.flyable = flyable;
    }

    public void move(){
        flyable.fly();
    }
}
class Main{
    public static void main(String[] args) {
        Flyable myPlane= new Aeroplane();
        Movable myCar=new Car();
        Adapterflytomove myMoveablePlane=new Adapterflytomove(myPlane);
        myCar.move();
        myMoveablePlane.move();
    }
}
