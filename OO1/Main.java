/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

/**
 *
 * @author biadejesus
 */

public class Main {

    public static void main(String[] args) {
       Jogador j1,j2,j3, j4;
        
        j1 = new Jogador( "Neymar" , "PSG", "Brasileiro", 24, 0, 0);
        j2 = new Jogador( "Messi" , "Barcelona", "Argentino", 30, 0, 0);
        j3 = new Jogador( "CR7" , "Real_madrid", "Português", 32, 0, 0);
        j4 = new Jogador( "Coutinho" , "Barcelona", "Brasileiro", 24, 0, 0);
        
        ManoAMano disputa = new ManoAMano();
        
        disputa.marcarJogo(j1, j3);
        disputa.disputar();
        
        System.out.println("O status atualizado do jogador 1 é: "+j1.vitorias);
        
        System.out.println("-----------------------------------");
        System.out.println("O status atualizado do jogador 3 é: "+j3.vitorias);
       
    }
}
