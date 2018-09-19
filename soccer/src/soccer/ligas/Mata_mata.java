/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer.ligas;
import javax.swing.JOptionPane;
import soccer.times.Time;
/**
 *
 * @author Maria Luiza
 */
public class Mata_mata {
    
    private String nome;
    
    private Time[] listaCampeonatoM = new Time[8];
    
//    public Mata_mata(){
//        
//    }
//    
//    public Mata_mata(String nome, Time[] listaCampeonatoM){
//        this.nome = nome;
//        this.listaCampeonatoM = listaCampeonatoM;
//    }

    public void getListaCampeonatoM() {
        String mensagem = "";
        for(int i= 0; i<listaCampeonatoM.length;i++){
            if(listaCampeonatoM[i] != null){
                mensagem = mensagem + "\n Nome Time " + listaCampeonatoM[i].getNome();
//                JOptionPane.showMessageDialog(null, "Nome Liga: " + getNome() +
//                                                 "\n Nome Time: " + listaCampeonatoM[i].getNome());
             
            }
                
  
        }
    JOptionPane.showMessageDialog(null, "Nome Liga : " + getNome() + "\n" + mensagem);
    }

    public void setListaCampeonatoM(Time listaCampeonatoM) {
        boolean existeTime = false;
        for (int i = 0; i < this.listaCampeonatoM.length; i++) {
            if(this.listaCampeonatoM[i] != null){
                if (listaCampeonatoM.getNome().equalsIgnoreCase(this.listaCampeonatoM[i].getNome())) {
                    existeTime = true;
                    break;
                }
            }
             
        }
        
        if(!existeTime){
            for(int t = 0; t<this.listaCampeonatoM.length; t++){
                int posFimLista = this.listaCampeonatoM.length - 1;
                if(this.listaCampeonatoM[t] == null){
                        this.listaCampeonatoM[t] = listaCampeonatoM;
                        //System.out.print(t);
                        JOptionPane.showMessageDialog(null, "Time adicionado");
                        break;
                } 
                
                if(t == posFimLista){
                    JOptionPane.showMessageDialog(null,"Campeonato Completo");
                    break;
                }
                 
            }
        }else{
            JOptionPane.showMessageDialog(null,"Time Já Cadastrado");
        }    
        
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
