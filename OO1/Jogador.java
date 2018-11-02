/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

public class Jogador {
      String nome, time, nacionalidade;
      int idade, vitorias, derrotas;

      void Vitorias(int vitorias){
          this.vitorias = vitorias;
      }
      void Derrotas(int derrotas){
          this.derrotas=derrotas;
      }
      
      void ganhar_disputa(){ 
          this.vitorias = vitorias++;
      }
      void perder_disputa(){
          this.derrotas = derrotas++;
      }
      
  
    public Jogador(String nome, String time, String nacionalidade, int idade, int vitorias, int derrotas) {
        this.nome = nome;
        this.time = time;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

}