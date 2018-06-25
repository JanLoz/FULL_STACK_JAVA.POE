package com.m2i.poe;

public class Main {

    public static void main(String[] args) {
        int[] tab = {2, 55, 86, -105};
        System.out.println(isPrime(7));

        int [] result=getPrimeNumbers(tab);

    }

    ///////////Conception//////////////////////////
    public static boolean isPrime(int n) {
        boolean result = true;
        if (n = 2) {
            result = false;
        }
        else{
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;


    }



    ////////////////////////////////////

   /* public static void getPrimeNumbers(int[] tab) {
        int[] result=new int[tab.length)];
        int index=0;
        for( int i:tab) {
            if (isPrime(i)) {
                result tab
            }



    }
    }*/
}