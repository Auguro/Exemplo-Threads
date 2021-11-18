package detetive;

public class clue {
    
    
    public static long localizadorSequencial(int[] vetor) {
        long maior = 0;

        for (int elem : vetor) {
            if (elem > maior) {
                maior = elem;
            }
        }

        return maior;
    }

    public static long localizadorParalela2T(int[] vetor) throws InterruptedException {
        ThreadLocalizador t0 = new ThreadLocalizador(vetor, 0, (int) Math.ceil((vetor.length) / 2));
        ThreadLocalizador t1 = new ThreadLocalizador(vetor, (int) Math.ceil((vetor.length) / 2), vetor.length);

        t0.start();
        t1.start();
        t0.join();
        t1.join();

        int marioral = 0;
        if (t0.getMaior() > t1.getMaior()) {
            marioral = t0.getMaior();
        } else {
            marioral = t1.getMaior();
        }

        return marioral;
    }

    public static long localizadorParalela3T(int[] vetor) throws InterruptedException {
        ThreadLocalizador t0 = new ThreadLocalizador(vetor, 0, (vetor.length) / 3);
        ThreadLocalizador t1 = new ThreadLocalizador(vetor, (vetor.length) / 3, ((vetor.length) / 3) * 2);
        ThreadLocalizador t2 = new ThreadLocalizador(vetor, ((vetor.length) / 3) * 2, vetor.length);

        t0.start();
        t1.start();
        t2.start();
        t0.join();
        t1.join();
        t2.join();

        int marioral = 0;
        
        if (t0.getMaior() > t1.getMaior() && t0.getMaior() > t2.getMaior()) {
            marioral = t0.getMaior();
        } else if(t1.getMaior() > t0.getMaior() && t1.getMaior() > t2.getMaior()){
            marioral = t1.getMaior();
        } else {
            marioral = t2.getMaior();
        }

        return marioral;
    }

    public static long localizadorParalela4T(int[] vetor) throws InterruptedException {
        ThreadLocalizador t0 = new ThreadLocalizador(vetor, 0, (vetor.length) / 4);
        ThreadLocalizador t1 = new ThreadLocalizador(vetor, (vetor.length) / 4, ((vetor.length) / 4) * 2);
        ThreadLocalizador t2 = new ThreadLocalizador(vetor, ((vetor.length) / 4) * 2, ((vetor.length) / 4) * 3);
        ThreadLocalizador t3 = new ThreadLocalizador(vetor, ((vetor.length) / 4) * 3, vetor.length);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t0.join();
        t1.join();
        t2.join();
        t3.join();

        int marioral = 0;
                
        if (t0.getMaior() > t1.getMaior() && t0.getMaior() > t2.getMaior() && t0.getMaior() > t3.getMaior()) {
            marioral = t0.getMaior();
        } else if(t1.getMaior() > t0.getMaior() && t1.getMaior() > t2.getMaior() && t1.getMaior() > t3.getMaior()){
            marioral = t1.getMaior();
        } else if(t2.getMaior() > t0.getMaior() && t2.getMaior() > t1.getMaior() && t2.getMaior() > t3.getMaior()){
            marioral = t2.getMaior();
        } else {
            marioral = t3.getMaior();
        }

        return marioral;
    }
}
