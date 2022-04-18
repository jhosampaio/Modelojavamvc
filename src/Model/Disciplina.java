/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author jhona
 */
public class Disciplina {
    
    private String Turma;
    private String Nome;
    
    public Disciplina(){  
    }

    public Disciplina(String Turma, String Nome) {
        this.Turma = Turma;
        this.Nome = Nome;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
   
    
}
