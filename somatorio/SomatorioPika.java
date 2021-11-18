package somatorio;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import util.MedidorTempo;

public class SomatorioPika {

    public static long somaSequencial(int[] vetor) {
        long acum = 0;

        for (int elem : vetor) {
            acum = acum + elem;
        }

        return acum;
    }

    public static long somaParalela2T(int[] vetor) throws InterruptedException {
        ThreadSoma t0 = new ThreadSoma(vetor, 0, (int) Math.ceil((vetor.length) / 2));
        ThreadSoma t1 = new ThreadSoma(vetor, (int) Math.ceil((vetor.length) / 2), vetor.length);

        t0.start();
        t1.start();
        t0.join();
        t1.join();

        int soma = (t0.getAcum() + t1.getAcum());

        return soma;
    }

    public static long somaParalela3T(int[] vetor) throws InterruptedException {
        ThreadSoma t0 = new ThreadSoma(vetor, 0, (vetor.length) / 3);
        ThreadSoma t1 = new ThreadSoma(vetor, (vetor.length) / 3, ((vetor.length) / 3) * 2);
        ThreadSoma t2 = new ThreadSoma(vetor, ((vetor.length) / 3) * 2, vetor.length);

        t0.start();
        t1.start();
        t2.start();
        t0.join();
        t1.join();
        t2.join();

        int soma = (t0.getAcum() + t1.getAcum() + t2.getAcum());

        return soma;
    }

    public static long somaParalela4T(int[] vetor) throws InterruptedException {
        ThreadSoma t0 = new ThreadSoma(vetor, 0, (vetor.length) / 4);
        ThreadSoma t1 = new ThreadSoma(vetor, (vetor.length) / 4, ((vetor.length) / 4) * 2);
        ThreadSoma t2 = new ThreadSoma(vetor, ((vetor.length) / 4) * 2, ((vetor.length) / 4) * 3);
        ThreadSoma t3 = new ThreadSoma(vetor, ((vetor.length) / 4) * 3, vetor.length);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t0.join();
        t1.join();
        t2.join();
        t3.join();

        int soma = (t0.getAcum() + t1.getAcum() + t2.getAcum() + t3.getAcum());

        return soma;
    }
}
