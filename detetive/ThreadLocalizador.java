/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detetive;

/**
 *
 * @author 05200203
 */
public class ThreadLocalizador extends Thread{

    private final int[] vet;
    private final int inicio;
    private final int fim;
    private int maior = 0;
    
    public ThreadLocalizador(int[] vet, int inicio, int fim) {
        this.vet = vet;
        this.inicio = inicio;
        this.fim = fim;   
    }
    @Override
    public void run(){
        for (int i = this.inicio; i < this.fim; i++) {
            if(this.maior < vet[i]){
                this.maior = vet[i];
            }
        }
    }
    
    public int getMaior() {
        return maior;
    }

    public void setMaior(int acum) {
        this.maior = maior;
    }
}
