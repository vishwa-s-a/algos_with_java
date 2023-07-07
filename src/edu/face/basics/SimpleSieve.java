package edu.face.basics;

public class SimpleSieve {
    public static void sieve(int limit) {

        Boolean num[] = new Boolean[limit + 1];// creating array of boolean variables like true and false
        for (int i = 2; i <= limit; i++) {
            num[i] = true;// we are making all entries in the array as true
        }
        // now the main implementation of Simple sieve algorithm will happen here after
        for (int p = 2; p * p <= limit; p++) {
            if (num[p] == true) {
                for (int j = p * p; j <= limit; j += p) {
                    
                        num[j] = false;
                    
                }
            }

        }

        // now to print all the prime numbers
        for (int i = 2; i <= limit; i++) {
            if (num[i] == true) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        sieve(100);
    }
}
