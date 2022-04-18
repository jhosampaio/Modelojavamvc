
package Controller;

import Model.Departamento;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 *
 * @author jhona
 */
public class ControllerTextoDepartamento extends ControllerArquivoTexto {
    
    public ArrayList <Departamento> lista = new ArrayList ();
    
    public void lerDepartamento() {
        setArquivo("Abrir");
        ler();
        String aux = getTexto();
        String tk = String.valueOf(';') + String.valueOf('\n');

        StringTokenizer tokens = new StringTokenizer(aux, tk);            
            while (tokens.hasMoreTokens()) {
            Departamento d = new Departamento();
            d.setCodigo(Integer.valueOf(tokens.nextToken()));
            d.setNome(tokens.nextToken());
            lista.add(d);                   
                
        }
    }

   public void gravarDepartamento() {
       String aux = "";
       for(int i = 0; i<lista.size();i++){
         aux += lista.get(i).getCodigo()+";" + lista.get(i).getNome() + ";\n";
       }
        setTexto(aux);
        setArquivo("Salvar");        
        escrever(true);
    }
        
    public Departamento pesquisaDepartamento (String Nome){
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
    
    public void editarDepartamento(int Codigo, String Nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equals(Nome)) {
                lista.get(i).setCodigo(Codigo);
                lista.get(i).setNome(Nome);               

            }
        }
    }
    
    public void excluirDepartamento(String Nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equals(Nome)) {
                lista.remove(i);
            }
        }
    }     
   
    public ArrayList <Departamento> getLista() {
        return lista;
    }

    public void setLista(ArrayList <Departamento> lista) {
        this.lista = lista;
    }
    
    public void addAluno (int Codigo, String Nome){
        lista.add(new Departamento(Codigo, Nome));
    }
}

  
  

