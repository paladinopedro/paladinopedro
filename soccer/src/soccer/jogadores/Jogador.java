/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer.jogadores;
import java.util.ArrayList;
import soccer.jogadores.Posicao;
/**
 *
 * @author Maria Luiza
 */
public abstract class Jogador {
    //private int inscri;
    protected String nome;
    protected int num;
    protected String posi;
    
    


//    public int getInscri(){
//        return inscri;
//    }
//    public void setInscri(int inscri){
//        this.inscri = inscri;
//    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPosi() {
        return posi;
    }
    
    public void setPosi(String posi) {
        this.posi = posi;
    }

    
    
    
   
}
