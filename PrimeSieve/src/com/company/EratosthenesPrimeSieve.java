package com.company;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    int max;
    private ArrayList<Boolean> primes = new ArrayList<>();

    public EratosthenesPrimeSieve(int max) {
        this.max = max;
        siev();
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {
    }

    public ArrayList<Boolean> siev(){

        for(int i = 0; i <= max; i++) {
            primes.add(i, true);
        }

        for(int i = 2; i <= max; i++) {
            if(primes.get(i) == true) {
                int j = i;
                do {
                    j = j+i;
                    if(j <= max) {
                        primes.set(j, false);
                    }
                } while(j <= max);
            }
        }
        return primes;
    }
}
