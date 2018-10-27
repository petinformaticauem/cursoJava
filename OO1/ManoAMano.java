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

import java.util.Random;

public class ManoAMano {
    Jogador desafiante;
    Jogador desafiado;

    void marcarJogo(Jogador j1, Jogador j2){
            this.desafiado = j1;
            this.desafiante = j2;
    }
    
    void  disputar(){
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(2);
            if(vencedor==0){
                System.out.println("-----------------------------------");
                System.out.println("vitorioso: "+this.desafiado.nome);
                System.out.println("-----------------------------------");
                this.desafiado.ganhar_disputa();
                this.desafiante.perder_disputa();
            }else if(vencedor ==1){
                System.out.println("-----------------------------------");
                System.out.println("vitorioso: "+this.desafiante.nome);
                System.out.println("-----------------------------------");
                this.desafiante.ganhar_disputa();
                this.desafiado.perder_disputa();    
                  
            }  
    }

}

