import javax.swing.*;
import java.util.Scanner;

public class vehicle {
    int noseates;
    String fuel;
    int Speed;

    public vehicle(int noseates, String fuel, int speed) {
        this.fuel = fuel;
        this.noseates = noseates;
        this.Speed = speed;
    }

    @Override
    public String toString() {
        return "Attributes of vehicle\n" + "\nNo. of seats : " + noseates + "\nFuel used : " + fuel + "\nspeed : " + Speed;
    }
}

interface Fling {
    int maxHeight = 20000;
}

class Aeroplane extends vehicle implements Fling {
    int takeOfSpeed;

    Aeroplane(int noseates, String fuel, int speed, int takeOfSpeed) {
        super(noseates, fuel, speed);
        this.takeOfSpeed = takeOfSpeed;
    }

    @Override
    public String toString() {
        return "Attributes of  Aeroplane \n " + "\nNo. of seats : " + noseates + "\nFuel used : " + fuel + "\nspeed : " + Speed + "\nMaximum Height" + maxHeight;
    }
}

class Rocket extends vehicle implements Fling {
    public Rocket(int noseates, String fuel, int speed) {
        super(noseates, fuel, speed);
    }

    @Override
    public String toString() {
        return "Attributes of  Rocket \n " + "\nNo. of seats : " + noseates + "\nFuel used : " + fuel + "\nspeed : " + Speed;
    }

}

class bus extends vehicle {
    String type;

    public bus(String type, int noseates, int speed, String fuel) {
        super(noseates, fuel, speed);
        this.type = type;
    }


    public String print() {
        return "Attributes of  bus  " + " \nNo. of seats :  " + noseates + "\nFuel used: " + fuel + "\n speed : " + Speed + " \ntype :" + type;
    }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        vehicle[] v = new vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter your choice 1 to create bus and 2 to create Aeroplane 3 to create to Rocket ");
            int choice = sc.nextInt();
            if (choice == 1) {
                int seats;
                String fuel;
                int Speed;
                String type;
                System.out.println("Enter fuel,speed , seats and Type of bus");
                fuel = sc.next();
                Speed = sc.nextInt();
                seats = sc.nextInt();
                type = sc.next();
                v[i] = new bus(fuel, Speed, seats, type);
            } else if (choice == 2) {
                int seats;
                int takeoffSpeed;
                String fuel;
                int speed;
                System.out.println("Enter seats , fuel , speed , and  takeOffSpeed");
                seats = sc.nextInt();
                fuel = sc.next();
                speed = sc.nextInt();
                takeoffSpeed = sc.nextInt();

                v[i] = new Aeroplane(seats, fuel, speed, takeoffSpeed);
            } else {
                int seats;
                String fuel;
                int speed;
                System.out.println("Enter seats , fuel , speed");
                seats = sc.nextInt();
                fuel = sc.next();
                speed = sc.nextInt();
                v[i] = new Rocket(seats, fuel, speed);

            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] instanceof Fling) {
                count++;
                System.out.println(v[i].toString());
            } else if (v[i] instanceof bus) {
                System.out.println(((bus) v[i]).print());
            } else if (v[i] instanceof Rocket) {
                System.out.println(v[i].toString());
            }
        }
        System.out.println("total Flying are :" + count);
    }
}