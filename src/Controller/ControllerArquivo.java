package Controller;

import java.io.File;
import javax.swing.JFileChooser;

public abstract class ControllerArquivo {
    protected File arquivo = null;
    public abstract boolean ler();
    public abstract boolean escrever(boolean append);
    
    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return arquivo;
    }

    /**
     * @param TextoBotao o texto para o botão de escolha do usuário
     */
    public void setArquivo(String TextoBotao) {
        arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showDialog(null, TextoBotao) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        }     
    }
}
