package com.stackroute;


interface Drawable{
    void draw();
}

class Reactangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}
public class Interface {

    public static void main(String[] args){
        Drawable d = new Circle();
        d.draw();
        Drawable d1 = new Reactangle();
        d1.draw();
    }
}
