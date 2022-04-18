
package Controller;

import Model.Aluno;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 *
 * @author jhona
 */
public class ControllerTextoAluno extends ControllerArquivoTexto {
    
    public ArrayList <Aluno> lista = new ArrayList ();
    
    public void lerAluno() {
        setArquivo("Abrir");
        ler();
        String aux = getTexto();
        String tk = String.valueOf(';') + String.valueOf('\n');

        StringTokenizer tokens = new StringTokenizer(aux, tk);            
            while (tokens.hasMoreTokens()) {
            Aluno a = new Aluno();
            a.setRA(Integer.valueOf(tokens.nextToken()));
            a.setNome(tokens.nextToken());
            lista.add(a);                   
                
        }
    }

   public void gravarAluno() {
       String aux = "";
       for(int i = 0; i<lista.size();i++){
         aux += lista.get(i).getRA()+";" + lista.get(i).getNome() + ";\n";
       }
        setTexto(aux);
        setArquivo("Salvar");        
        escrever(true);
    }
        
    public Aluno pesquisaAluno (String Nome){
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
    
    public void editarAluno(int RA, String Nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equals(Nome)) {
                lista.get(i).setRA(RA);
                lista.get(i).setNome(Nome);               

            }
        }
    }
    
    public void excluirAluno(String Nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equals(Nome)) {
                lista.remove(i);
            }
        }
    }     
   
    public ArrayList <Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList <Aluno> lista) {
        this.lista = lista;
    }
    
    public void addAluno (int RA, String Nome){
        lista.add(new Aluno (RA, Nome));
    }
}

  
  

