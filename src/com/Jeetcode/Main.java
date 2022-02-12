package com.Jeetcode;

public class Main {

    public static void main(String[] args) {


        // x = broj od kojeg krece lista
        // y = broj na kojem zavrsava lista

        int x = 10;
        int y = 20;

        for (int i = x; i <= y; i++) {

            // Brojevi sa kojima zelimo provjeriti djeljivost liste

            int a = 3;
            int b = 7;
            int c = 11;


            // Operacije koje provjeravaju djeljivost brojeva
            boolean djeljiva = (i % a == 0);
            boolean djeljivb = (i % b == 0);
            boolean djeljivc = (i % c == 0);


            if ( djeljiva == true) {
                System.out.println(  "Broj je djeljiv sa " + a);
            } else if (djeljivb == true) {
                System.out.println("Broj je djeljiv sa " + b);
            } else  if (djeljivc == true) {
                System.out.println("Broj je djeljiv sa " + c);
            } else System.out.println ("Broj nije djeljiv");
        }


    }
}









