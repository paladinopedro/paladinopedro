/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer.times;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import soccer.jogadores.Jogador;
/**
 *
 * @author Maria Luiza
 */
public class Time {
    private String nome;
    private String mascote;
    private float torcida;
    private String apelido;
    
    private Jogador[] listaJogadores = new Jogador[11];

    public Time(){
        
    }
    
    public Time(String nome, String mascote, String apelido, float torcida, Jogador[] listaJogadors){
        this.nome = nome;
        this.torcida = torcida;
        this.mascote = mascote;
        this.apelido = apelido;
        this.listaJogadores = listaJogadors;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public float getTorcida() {
        return torcida;
    }

    public void setTorcida(float torcida) {
        this.torcida = torcida;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void getListaJogadores() {
        for(int i= 0; i<listaJogadores.length;i++){
            if(this.listaJogadores[i] != null){
                JOptionPane.showMessageDialog(null, "Time: " + getNome() +
                                                    "\nJogador: " + listaJogadores[i].getNome());
           
            }
        }
    }

    public void setListaJogadores(Jogador listaJogadores) {
        boolean existeJogador = false;
        //Verificação do jogar
        for (int i = 0; i < this.listaJogadores.length; i++) {
            if(this.listaJogadores[i] != null){
                if (listaJogadores.getNome().equalsIgnoreCase(this.listaJogadores[i].getNome())) {
                    existeJogador = true;
                    break;
                }
            } 
        }
        
        if(existeJogador == false){
            
            // Inserção do jogador
            for(int i = 0; i<this.listaJogadores.length; i++){
                int posFimLista = this.listaJogadores.length - 1;
                if(this.listaJogadores[i] == null){
                    this.listaJogadores[i] = listaJogadores;
                    JOptionPane.showMessageDialog(null, "Jogador adicionado");
                    break;
                }

                if(i == posFimLista){
                    JOptionPane.showMessageDialog(null,"Time Completo");
                }
                
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Jogador Já Cadastrado");
        }
                
        
    }
    
    
    
}
