import java.util.Scanner;

public class PlaneService {


    public Plane create() {
        Plane animal = new Plane();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter model");
        String model = scanner.next();
        System.out.println("Enter country");
        String country = scanner.next();
        System.out.println("enter year");
        int year = scanner.nextInt();
        System.out.println("enter hours");
        int hours = scanner.nextInt();
        System.out.println("enter isMilitary");
        boolean isMilitary = scanner.nextBoolean();
        System.out.println("enter weigth");
        int weigth = scanner.nextInt();
        System.out.println("enter wingspan");
        int wingspan = scanner.nextInt();
        System.out.println("enter topSpeed");
        int topSpeed = scanner.nextInt();
        System.out.println("enter seats");
        int seats = scanner.nextInt();
        System.out.println("enter cost");
        int cost = scanner.nextInt();


        Plane plane1 = new Plane();
        plane1.setModel(model);
        plane1.setCountry(country);
        plane1.setYear(year);
        plane1.setHours(hours);
        plane1.setMilitary(isMilitary);
        plane1.setWeigth(weigth);
        plane1.setWingspan(wingspan);
        plane1.setTopSpeed(topSpeed);
        plane1.setSeats(seats);
        plane1.setCost(cost);

        return plane1;
    }

    public void Task1(Plane p) {

        System.out.println("Enter model: " + p.getModel());
        System.out.println("Enter country: " + p.getCountry());
        System.out.println("Enter year: " + p.getYear());
        System.out.println("Enter hours: " + p.getHours());
        System.out.println("Enter isMilitary: " + p.isMilitary());
        System.out.println("Enter weigth: " + p.getWeigth());
        System.out.println("Enter wingspan: " + p.getWingspan());
        System.out.println("Enter topSpeed: " + p.getTopSpeed());
        System.out.println("Enter seats: " + p.getSeats());
        System.out.println("Enter cost: " + p.getCost());


    }

    public void Task2(Plane p1) {

        if (p1.isMilitary()) {
            System.out.println(create().getCost());
            System.out.println(create().getTopSpeed());
        } else {
            System.out.println(create().getModel());
            System.out.println(create().getCountry());
        }
    }

    public static Plane Task3(Plane p1, Plane p2) {
        if (p1.getYear() > p2.getYear() || p1.getYear() == p2.getYear()) {
            return p1;
        } else {
            return p2;
        }
    }

    public static Plane Task4(Plane p1, Plane p2) {
        if (p2.getWingspan() > p1.getWingspan() || p1.getWingspan() == p2.getWingspan()) {
            return p2;
        } else {
            return p1;
        }
    }

    public void Task5(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() < p2.getSeats() && p2.getSeats() < p3.getSeats()) {

            System.out.println(p1);
        } else if (p2.getSeats() < p1.getSeats() && p1.getSeats() < p3.getSeats()) {
            System.out.println(p2);
        } else if (p3.getSeats() < p2.getSeats() && p2.getSeats() < p3.getSeats()) {
            System.out.println(p3);
        } else if (p1.getSeats() == p2.getSeats() || p1.getSeats() == p3.getSeats() || p3.getSeats() == p2.getSeats()) {
            System.out.println(p1);
        }

    }

    public void Task6(Plane[] planes) {

        for (Plane p : planes) {
            if (!p.isMilitary()) {
                Task1(p);
            }

        }

    }

    public void Task7(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                Task1(p);
            }
        }
    }

    public Plane Task8(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (min.getWeigth() >= planes[i].getWeigth()) {
                min = planes[i];
            }
        }
        return min;
    }

    public Plane Task9(Plane[] planes) {
        Plane min = null;
        for (Plane p : planes) {
            if (min == null) {
                if (p.isMilitary()) {
                    min = p;
                }
            } else {
                if (p.isMilitary() && p.getCost() < min.getCost()) {
                    min = p;
                }
            }
        }
        return min;

    }
}
