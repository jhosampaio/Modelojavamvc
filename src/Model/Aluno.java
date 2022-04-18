/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author jhona
 */
public class Aluno {
    private int RA;
    private String Nome;

    public Aluno() {
    }

    public Aluno(int RA, String Nome) {
        this.RA = RA;
        this.Nome = Nome;
    }   

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
  

    
}

    