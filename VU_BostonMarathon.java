/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.vu_bostonmarathon;

/**
 *
 * @author HP
 */
import java.util.*;
class Runner{
    String name;
    int time;
    Runner(String name, int time){
        this.name = name;
        this.time = time;
    }
}

public class VU_BostonMarathon {
    public static void main(String[] args) {
     List<Runner> runners = new ArrayList<>();
        // Add runners with their times (in minutes)
         runners.add(new Runner("Elena",341));
        runners.add(new Runner("Thomas", 273));
        runners.add(new Runner("Hamilton", 278));
        runners.add(new Runner("Suzie", 329));
        runners.add(new Runner("Phil",445 ));
        runners.add(new Runner("Matt",402 ));
        runners.add(new Runner("Alex",388));
        runners.add(new Runner("Emma",275));
        runners.add(new Runner("John",243));
        runners.add(new Runner("James",334));
        runners.add(new Runner("Jane",412));
        runners.add(new Runner("Emily",393));
        runners.add(new Runner("Daniel",299));
        runners.add(new Runner("Neda",343));
        runners.add(new Runner("Aaron",317));
        runners.add(new Runner("Kate",265));


        // Sort runners based on their time
        runners.sort(Comparator.comparingInt(runner -> runner.time));

        // Fastest runner
        Runner fastest = runners.get(0);
        System.out.println("Fastest runner: " + fastest.name + " with time " + fastest.time + " minutes");

        // Second fastest runner
        Runner secondFastest = runners.get(1);
        System.out.println("Second fastest runner: " + secondFastest.name + " with time " + secondFastest.time + " minutes");
    }
}   



   
