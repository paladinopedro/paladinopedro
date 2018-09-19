/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.awt.JobAttributes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import soccer.jogadores.Atacante;
import soccer.jogadores.Defensor;
import soccer.jogadores.Goleiro;
import soccer.jogadores.Jogador;
import soccer.jogadores.Meia;
//import soccer.jogadores.Posicao;
import soccer.ligas.Mata_mata;
//import soccer.ligas.Pontos_corridos;
import soccer.times.Time;

/**
 *
 * @author Maria Luiza
 */
public class Soccer {
    private ArrayList<Jogador> jogador = new ArrayList();
    private ArrayList<Time> tim = new ArrayList();
    private ArrayList<Mata_mata> mata = new ArrayList();
//    private ArrayList<Pontos_corridos> ponto = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int escolha = 0;
        Soccer soc = new Soccer();
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer: "
                    +"\n   Se quiser sair DIGITE 0"
                    + "\n1 - Cadastrar Jogador:"
                    + "\n2 - Cadastrar Time: " 
                    + "\n3 - Cadastrar Liga:"
                    //+ "\n4 - Cadastrar Liga Pontos Corridos:"
                    + "\n4 - Mostrar Jogadores cadastrados:"
                    + "\n5 - Ver Times cadastrados:" 
                    + "\n6 - Mostrar Ligas:" 
                    //+ "\n8 - Ver Liga Pontos Corrido"
                    + "\n7 - Adicionar jogador no time:"
                    + "\n8 - Buscar Time:"
                    + "\n9 - Adicionar Time na Liga:"
                    //+ "\n10 - Adicionar Time na liga de  Pontos Corridos"
                    + "\n10 - Buscar liga:"));
            switch(escolha){
                case 1: 
                    try{
                    //int inscri = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de Inscrição de seu Jogador:"));
                    int escolhaT = Integer.parseInt(JOptionPane.showInputDialog("Digite a escolha de jogador"
                + "\n1 - Goleiro"
                + "\n2 Defensor"
                + "\n3 - Meia"
                + "\n4 - Atacante"));
                    String posi = JOptionPane.showInputDialog("Digite sua posição:");
                    
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu Jogador:"));
                    
                    
                    soc.cadastrarJogador(nome, num, posi, escolhaT);
                    break;
                    } catch(NumberFormatException x ){
                        JOptionPane.showMessageDialog(null,"ERRO, SÓ É PERMITIDO NUMERO");
                        break;
                    }
                case 2:
                    try{
                    String nomeTime = JOptionPane.showInputDialog("Digite o nome do seu Time:");
                    String nomeMascote = JOptionPane.showInputDialog("Digite o nome do mascote:");
                    float torcida = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho da torcida:"));
                    String apelido = JOptionPane.showInputDialog("Digite o apelido do seu Time:");
                    soc.cadastrarTimes(nomeTime, nomeMascote, torcida , apelido);
                    break;
                    } catch(NumberFormatException x ){
                        JOptionPane.showMessageDialog(null,"ERRO, SÓ É PERMITIDO NUMERO EM TORCIDA");
                        break;
                    }
                case 3:
                    String nomeLigaMM = JOptionPane.showInputDialog("Digite o nome de sua Liga:");
                    soc.cadastrarLigaMataMata(nomeLigaMM);
                    break;
//                case 4:
//                    String nomeLigaPC = JOptionPane.showInputDialog("Digite o nome da sua liga:");
//                    soc.cadastrarLigaPontoCorrido(nomeLigaPC);
//                    break;
                case 4:
                    String vizualiza = soc.mostrarJogador();
                    JOptionPane.showMessageDialog(null, vizualiza);
                    break;
                case 5:
                    soc.mostrarTime();
                    break;
                case 6:
                    soc.mostrarLigaMM();
                    break;
//                case 8:
//                    soc.mostraarLigaPC();
//                    break;
                case 7:
                    String nomeJog = JOptionPane.showInputDialog("Digite o nome do jogador para inserir em algum time:");
                    String nomeTime1 = JOptionPane.showInputDialog("Nome do time");
                    soc.adicionarJog(nomeJog, nomeTime1);
                    break;
                case 8:
                    String nomeP = JOptionPane.showInputDialog("Digite o time para buscar");
                    soc.mostraTimeCompleto(nomeP);
                    break;
                case 9:
                    String nomeTim = JOptionPane.showInputDialog("Digite o Time para adicionar");
                    String nomeLigaM = JOptionPane.showInputDialog("Digite a liga no qual vai adicionar");
                    soc.adicionarLigaMM(nomeTim, nomeLigaM);
                    break;
                case 10:
                    String nomeTi = JOptionPane.showInputDialog("Digite o nome da Liga para buscar");
                    soc.mostrarCompletoLigaMM(nomeTi);
                    break;
                case 11:
                    String nomeLiga = JOptionPane.showInputDialog("Digite o nome da liga para ver os times");
                    soc.mostrarCompletoLigaMM(nomeLiga);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    
            }
        }while(escolha!=0);
            
    }
    private void cadastrarJogador(String nome, int num, String posi, int escolha){
        Jogador jogG = new Goleiro();
        Jogador jogD = new Defensor();
        Jogador jogM = new Meia();
        Jogador jogA = new Atacante();
        
        
        if(escolha == 1){
            jogG.setNome(nome);
            jogG.setNum(num);
            jogG.setPosi(posi);
            jogador.add(jogG);
            System.out.println("foi");
        }
        if(escolha == 2){
            jogD.setNome(nome);
            jogD.setNum(num);
            jogD.setPosi(posi);
            jogador.add(jogD);
        }
        if(escolha == 3){
            jogM.setNome(nome);
            jogM.setNum(num);
            jogM.setPosi(posi);
            jogador.add(jogM);
        }
        if(escolha == 4){
            jogA.setNome(nome);
            jogA.setNum(num);
            jogA.setPosi(posi);
            jogador.add(jogA);
        }
        
        
        
        
        
        
//        //jog.setInscri(inscri);
//        jog.setNome(nome);
//        jog.setNum(num);
//        jog.setPosi(posi);
//        jogador.add(jog);
        
    }
    
    private void cadastrarTimes(String nome, String mascote, float torcida, String apelido){
        Time equipe = new Time();
        equipe.setNome(nome);
        equipe.setMascote(mascote);
        equipe.setTorcida(torcida);
        equipe.setApelido(apelido);
        tim.add(equipe);
    }
    
    private void cadastrarLigaMataMata(String nomeLigaMM){
        Mata_mata m = new Mata_mata();
        m.setNome(nomeLigaMM);
        mata.add(m);
        
    }
    
//    private void cadastrarLigaPontoCorrido(String nomeLigaPC){
//        Pontos_corridos pc = new Pontos_corridos();
//        pc.setNome(nomeLigaPC);
//        ponto.add(pc);
//    }
    
    private String mostrarJogador(){
        String mensagem = "";
        for (Jogador j: jogador){
            if(j instanceof Atacante ){
                
            mensagem = mensagem + "Nome: " + j.getNome() + "\nNumero: " + j.getNum()+ "\nPosição :" + j.getPosi();

            } 
            
            if(j instanceof Goleiro ){
                
            mensagem = mensagem + "Nome: " + j.getNome() + "\nNumero: " + j.getNum()+ "\nPosição :" + j.getPosi();

            }  
            if(j instanceof Defensor ){
                
            mensagem = mensagem + "Nome: " + j.getNome() + "\nNumero: " + j.getNum()+ "\nPosição :" + j.getPosi();

            }
            
            if(j instanceof Meia ){
                
            mensagem = mensagem + "Nome: " + j.getNome() + "\nNumero: " + j.getNum()+ "\nPosição :" + j.getPosi();

            }  
        
        }
        return mensagem;
    }
    
    private void mostrarTime(){
        for(Time t: tim){
            JOptionPane.showMessageDialog(null, "Nome: " + t.getNome() + "\nMascote: " + t.getMascote() + "\nTorcida: " + t.getTorcida() + "\nApelido: " + t.getApelido());
        }
    }
    
    private void mostrarLigaMM(){
        for(Mata_mata mm: mata ){
            JOptionPane.showMessageDialog(null, "Nome " + mm.getNome());
        }
    }
    
//    private void mostraarLigaPC(){
//        for(Pontos_corridos pc: ponto){
//            JOptionPane.showMessageDialog(null, "Nome " + pc.getNome());
//        }
//    }
    
    private void mostraTimeCompleto(String nomeP){
        Jogador j;
        for(Time t: tim){
            if(t.getNome().equalsIgnoreCase(nomeP)){
                t.getListaJogadores();
            }
        }
    }
    
    private void adicionarJog(String nome, String nomeTime){
        
        for(Jogador j: jogador){
           
            if(j.getNome().equalsIgnoreCase(nome)){
//                for(Time time: tim ){
//                    if(time.get)
//                }
                for(Time t: tim){
                    if(t.getNome().equalsIgnoreCase(nomeTime)){
                        t.setListaJogadores(j);
                        break;
                    
                    }
                }
                break;
            }
//            else{
//                JOptionPane.showMessageDialog(null,"Erro!!");
//                break;
//            }
            
            
                
        }
    }
    
    private void adicionarLigaMM(String nomeTimeLiga, String nomeLigaMM){
        for (Time t: tim){
            if(t.getNome().equalsIgnoreCase(nomeTimeLiga)){
                for(Mata_mata mm: mata){
                    if(mm.getNome().equalsIgnoreCase(nomeLigaMM)){
                        mm.setListaCampeonatoM(t);
                        break;
                    }
                }         
            }
        }
    }
    
    private void mostrarCompletoLigaMM(String nomeLiga){
        Time t = new Time();
        for(Mata_mata mm: mata){
            if(mm.getNome().equalsIgnoreCase(nomeLiga)){
                mm.getListaCampeonatoM();
               
            }
        }
    }
    
    
}

  