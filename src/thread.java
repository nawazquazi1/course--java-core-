public class thread {
    public static void main(String[] args) {
        System.out.println("Child Thread : " + Thread.currentThread().getName());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        MyThread m1 = new MyThread();
        MyThread2 m2 = new MyThread2();
        MyThread3 m3 = new MyThread3();
        m1.start();
        m2.start();
        m3.start();
    }
}

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
//            Thread.currentThread().setName("akib");
            System.out.println("Task  " + i + " Start " + Thread.currentThread().getName());
        }
//        Thread.currentThread().setPriority(4);
//        System.out.println();
    }

    }



class MyThread2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
//            Thread.currentThread().setName("nawaz");
            System.out.println("Task " + i + " Start " + Thread.currentThread().getName());
        }
//        System.out.println(Thread.currentThread().getPriority());
    }
}

class MyThread3 extends Thread {
    public void run() {
        for (int i = 10; i <= 15; i++) {
//            Thread.currentThread().setName("quazi");
            System.out.println("Task " + i + " Start " + Thread.currentThread().getName());
        }
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
    }
}

//sleep method
class Sleep extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Sleep sleep = new Sleep();
        sleep.start();

        Sleep sleep1 = new Sleep();
        sleep1.start();
    }
}

class Timer extends Thread {
    public void run() {
        int k = 1;
        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i <= 59; i++) {
                System.out.println(k + " : : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 59) {
                    k++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Timer t = new Timer();
        t.start();

    }
}

// yield methode
class Yield extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
        Yield y = new Yield();
        y.start();
        for (int i = 1; i <= 5; i++) {
            Thread.yield();
            System.out.println("Main Thread " + " - " + i);
        }
    }
}

// daemon thread
class Daemon extends Thread {
    public void run() {
        try {
            System.out.println("In run Method: " + Thread.currentThread());
            int i = 1;
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println(i + " in run ...Woke up Again ");
                i++;
            }
        } finally {
            System.out.println("Leaving run Method..");
        }
    }

    public static void main(String[] args) {
        System.out.println("starting Main thread");
        Daemon de0 = new Daemon();
        de0.setDaemon(true);//
        de0.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException io) {
        }
        System.out.println("Time Up ...Exiting Now");

    }

}

//join methode
class join extends Thread {
    static Thread main;

    public void run() {
        try {
            main.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println(" child Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        main = Thread.currentThread();
        join j1 = new join();
        j1.start();
//         j1.join();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// program to join method
class Medical extends Thread {
    public void run() {

        try {
            System.out.println("Medical starts ");
            Thread.sleep(3000);
            System.out.println("Medical completed ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TestDriver extends Thread {
    public void run() {
        try {
            System.out.println("Test Driver starts");
            Thread.sleep(5000);
            System.out.println("Test Drive completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OfficerSign extends Thread {
    public void run() {
        try {
            System.out.println("officer takes the files ");
            Thread.sleep(3000);
            System.out.println("Officer work completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class run {
    public static void main(String[] args) throws InterruptedException {
        Medical m1 = new Medical();
        m1.start();
        m1.join();
        TestDriver t1 = new TestDriver();
        t1.start();
        t1.join();
        OfficerSign of1 = new OfficerSign();
        of1.start();
    }
}

// interrupted method
class interrupted extends Thread {
    public void run() {
        System.out.println(Thread.interrupted());
//        System.out.println(Thread.currentThread().isInterrupted());
//        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.interrupted());
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        interrupted in = new interrupted();
        in.start();
        in.interrupt();
    }

}

//synchronized key word
class seatBookManger {
    static int Total_seat = 20;

    synchronized static void BookSEat(int seat) {
        if (Total_seat >= seat) {
            System.out.println(seat + " your seat book success full");
            Total_seat = Total_seat - seat;
            System.out.println(" seats left : " + Total_seat);
        } else {
            System.out.println("sorry seats cannot be booked ... !!!");
            System.out.println("seats left : " + Total_seat);
        }
    }
}

class book extends Thread {
    seatBookManger b;
    int seats;

    book(seatBookManger b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.BookSEat(seats);
    }
}

class book1 extends Thread {
    seatBookManger b;
    int seats;

    book1(seatBookManger b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.BookSEat(seats);
    }
}

class MoveBookApp extends Thread {
    static seatBookManger b;
    int seat;

    public void run() {
        seatBookManger.BookSEat(seat);
    }

    public static void main(String[] args) throws InterruptedException {

        b = new seatBookManger();
//        MoveBookApp m1 = new MoveBookApp();
//        m1.seat = 3;
//        m1.start();
        book b1 = new book(b, 5);
        b1.start();
        book1 b2 = new book1(b, 9);
        b2.start();

        seatBookManger c = new seatBookManger();
        book c1 = new book(c, 7);
        c1.start();
        book1 c2 = new book1(c, 6);
        c2.start();
//
//        MoveBookApp m2 = new MoveBookApp();
//        m2.seat = 8;
//        m2.start();

    }
}

// inter Thread communication method
class TotalEarning extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }
}
class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning t1=new TotalEarning();
        t1.start();
        synchronized (t1){
            t1.wait();
            System.out.println("Total earning : " + t1.total+ " Rs");
        }

    }
}
