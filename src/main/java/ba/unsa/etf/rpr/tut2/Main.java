package ba.unsa.etf.rpr.tut2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();

        while(true){
            System.out.print("Unesite broj ili rijec stop: ");
            String line = scanner.nextLine();
            //prihvati i stop sa space-om poslije
            if ("stop".equalsIgnoreCase(line.trim())){
                break;
            }
            try{
                Double number = Double.parseDouble(line);
                numbers.add(number);
            }catch (Exception e){
                System.out.println("Uneseni string nije broj niti stop!");

            }
        }

        System.out.println("Rezultati: ");
        System.out.println("Vaša lista je: [" + numbers + "].");
        System.out.println("Najmanji broj: " + MatematikaUtils.min(numbers));
        System.out.println("Majveci broj: : " + MatematikaUtils.max(numbers));
        System.out.println("Srednja vrijednost: " + MatematikaUtils.mean(numbers));
        System.out.println("Standardna devijacija: " + MatematikaUtils.stdev(numbers));
    }
}