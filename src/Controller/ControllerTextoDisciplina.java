/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Disciplina;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 *
 * @author jhona
 */
public class ControllerTextoDisciplina extends ControllerArquivoTexto {
    
    public ArrayList <Disciplina> lista = new ArrayList ();
    
    public void lerDisciplina() {
        setArquivo("Abrir");
        ler();
        String aux = getTexto();
        String tk = String.valueOf(';') + String.valueOf('\n');

        StringTokenizer tokens = new StringTokenizer(aux, tk);            
            while (tokens.hasMoreTokens()) {
            Disciplina disc = new Disciplina();
            disc.setTurma(tokens.nextToken());
            disc.setNome(tokens.nextToken());
            lista.add(disc);                   
                
        }
    }

   public void gravarDisciplina() {
       String aux = "";
       for(int i = 0; i<lista.size();i++){
         aux += lista.get(i).getTurma()+";" + lista.get(i).getNome() + ";\n";
       }
        setTexto(aux);
        setArquivo("Salvar");        
        escrever(true);
    }
        
    public Disciplina pesquisaDisciplina (String Nome){
        try{
            for (int i = 0; i<this.lista.size(); i++){
                if(this.lista.get(i).getNome().equals(Nome)){
                    return this.lista.get(i);
                }              
            }
        }
        catch (NullPointerException nexc){
            return null;
        }
       
        return null;
      
    }
    
    public void editarDisciplina(String Turma, String Nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equals(Nome)) {
                lista.get(i).setTurma(Turma);
                lista.get(i).setNome(Nome);               

            }
        }
    }
    
    public void excluirDisciplina(String Nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equals(Nome)) {
                lista.remove(i);
            }
        }
    }     
   
    public ArrayList <Disciplina> getLista() {
        return lista;
    }

    public void setLista(ArrayList <Disciplina> lista) {
        this.lista = lista;
    }
    
    public void addDisciplina (String Turma, String Nome){
        lista.add(new Disciplina(Turma, Nome));
    }
}