package org.oops;

public class Abstract {

    public static void main(String[] args) {
        Person2 john = new Vegan();
        john.speak();
        john.eat();
        System.out.println("************");
        Person2 mia = new NonVegan();
        mia.speak();
        mia.eat();

    }

}

abstract class Person2 {

    public void speak(){
        System.out.println("Shares his/her thoughts.");
    }

    public abstract void eat();

}
class Vegan extends Person2{

    @Override
    public void eat() {
        System.out.println("Eats vegan food");
    }
}

class NonVegan extends Person2{

    @Override
    public void eat() {
        System.out.println("Eats non vegan food");

    }

}


abstract class pen {
    abstract void write();
    abstract void refil();
    public  void naw(){
    }
}

class fountainpan extends pen {

    @Override
    void write() {
        System.out.println("write  ");
    }

    @Override
    void refil() {
        System.out.println("refill");

    }

    void changenib() {
        System.out.println("Changing the nib");
    }
}

class monkay  {
    void jump() {
        System.out.println("jumping...");
    }

    void bite() {
        System.out.println("biting..");
    }
}

interface basicanimal {
    void eat();
    void sleep();
}

class human extends monkay implements basicanimal {
    void speek() {
        System.out.println("hey nawaz");
    }

    @Override
    public void eat() {
        System.out.println("eatiingg,,");
    }

    @Override
    public void sleep() {

        System.out.println("sleping..");
    }

}

class cylinder {
    int rdiuse;
    int height;
    int breath;
    int length;

    public cylinder(int rdiuse, int height, int length, int breath) {
        this.rdiuse = rdiuse;
        this.height = height;
        this.length = length;
        this.breath = breath;
    }

    public int getRdiuse() {
        return rdiuse;
    }

    public void setRdiuse(int rdiuse) {
        this.rdiuse = rdiuse;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfacearea() {
        return 2 * Math.PI * rdiuse * rdiuse + 2 * Math.PI * rdiuse * height;
    }

    public double volume() {
        return Math.PI * rdiuse * rdiuse * height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }
}

class abstracte {

    public static void main(String[] args) {


//        cylinder cy = new cylinder(3, 6, 4, 5);
//        System.out.println("surfacearea " + cy.surfacearea());
//        System.out.println("volume " + cy.volume());
//        System.out.println("Height " + cy.getHeight());
//        System.out.println("Rdiuse " + cy.getRdiuse());
//        System.out.println("Breath " + cy.getBreath());
//        System.out.println("Length " + cy.getLength());

//        cy.setHeight(3);
//        cy.setRdiuse(34);
//        System.out.println(cy.getRdiuse());
//        System.out.println(cy.getHeight());

        fountainpan fa=new fountainpan();
        fa.write();
        fa.refil();
        fa.changenib();

        human hu =new human();
        hu.jump();
        hu.bite();
        hu.eat();
        hu.sleep();
        hu.speek();

    }
}

