package podstawy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        timeGen(start);
    }

    public static void timeGen(long start) throws InterruptedException {
        boolean run = true;
        while(run){
            getRandomEfect(start);
        }
    }

    public static void getRandomEfect(long start) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
//        String option = scanner.nextLine();
        long maximum = 900000;
        long minimum = 0;
        long number = ((long) (Math.random() * (maximum - minimum))) + minimum;
        switch ((int) number){
            case 1:
                System.out.println("Głodny");
                getTimeOfEvent(start);
//                if(scanner.hasNextLine()){
//                    System.out.println("nakarm");
//
//                }
                sleep();
                break;
            case 100:
                System.out.println("Sprzątnij klatkę");
                getTimeOfEvent(start);
                sleep();

                break;
            case 10000:
                System.out.println("Chory");
                getTimeOfEvent(start);
                sleep();

                break;
            case 100000:
                System.out.println("Pobaw się");
                getTimeOfEvent(start);
                sleep();
                break;
            case 1000000:
                System.out.println("pogłaskaj");
                getTimeOfEvent(start);
                sleep();
                break;
            case 10000000:
                System.out.println("Szczeka");
                getTimeOfEvent(start);
                sleep();
                break;
        }
    }

    public static void sleep() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void getTimeOfEvent(long start){
        long elapsedTime = System.nanoTime() - start;
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;
        System.out.println(elapsedTimeInSecond + " seconds");
        //return true;
    }
}
