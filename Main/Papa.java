/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static detetive.clue.localizadorParalela2T;
import static detetive.clue.localizadorParalela3T;
import static detetive.clue.localizadorParalela4T;
import static detetive.clue.localizadorSequencial;
import java.util.Random;
import java.util.Scanner;
import static somatorio.SomatorioPika.somaParalela2T;
import static somatorio.SomatorioPika.somaParalela3T;
import static somatorio.SomatorioPika.somaParalela4T;
import static somatorio.SomatorioPika.somaSequencial;
import util.MedidorTempo;

/**
 *
 * @author 05200203
 */
public class Papa {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        MedidorTempo sequencial = new MedidorTempo();

        System.out.println("Determine o tamanho do vetor");

        int N = scan.nextInt();

        int[] vet = new int[N];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(100);
        }
        
        System.out.println("Escolha a opção");
        System.out.println("1-Soma");
        System.out.println("2-Procurar o maior");
        int opcao = scan.nextInt();
        
        long result = 0;
        switch (opcao) {
            case 1:
                System.out.println("Escolha a velocidade");
                System.out.println("1-perneta");
                System.out.println("2-duas pernas");
                System.out.println("3-tres pernas");
                System.out.println("4-pikasso");
                opcao = scan.nextInt();

                
                switch (opcao) {
                    case 1:
                        sequencial.inicia();
                        System.out.println(somaSequencial(vet));
                        sequencial.termina();
                        break;
                    case 2:
                        sequencial.inicia();
                        result = somaParalela2T(vet);
                        System.out.println(result);
                        sequencial.termina();
                        break;
                    case 3:
                        sequencial.inicia();
                        result = somaParalela3T(vet);
                        System.out.println(result);
                        sequencial.termina();
                        break;
                    case 4:
                        sequencial.inicia();
                        result = somaParalela4T(vet);
                        System.out.println(result);
                        sequencial.termina();
                        break;
                }
                break;
            case 2:
                System.out.println("Escolha a velocidade");
                System.out.println("1-nhé");
                System.out.println("2-da pro gasto");
                System.out.println("3-legal");
                System.out.println("4-esse ai é massa");
                opcao = scan.nextInt();

                
                switch (opcao) {
                    case 1:
                        sequencial.inicia();
                        System.out.println(localizadorSequencial(vet));
                        sequencial.termina();
                        break;
                    case 2:
                        sequencial.inicia();
                        result = localizadorParalela2T(vet);
                        System.out.println(result);
                        sequencial.termina();
                        break;
                    case 3:
                        sequencial.inicia();
                        result = localizadorParalela3T(vet);
                        System.out.println(result);
                        sequencial.termina();
                        break;
                    case 4:
                        sequencial.inicia();
                        result = localizadorParalela4T(vet);
                        System.out.println(result);
                        sequencial.termina();
                        break;
                }
                break;
        }

        System.out.println(Math.ceil(sequencial.getTimeInMilisec()));
    }
}
