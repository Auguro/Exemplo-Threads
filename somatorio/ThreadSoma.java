/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somatorio;

/**
 *
 * @author 05200203
 */
public class ThreadSoma extends Thread{

    private final int[] vet;
    private final int inicio;
    private final int fim;
    private int acum = 0;
    
    public ThreadSoma(int[] vet, int inicio, int fim) {
        this.vet = vet;
        this.inicio = inicio;
        this.fim = fim;   
    }
    @Override
    public void run(){
        for (int i = this.inicio; i < this.fim; i++) {
            this.acum = this.acum + vet[i];
        }
    }
    
    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }
}
