/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerTextoDepartamento;
import Model.Departamento;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhona
 */
public class JDepartamento extends javax.swing.JFrame {
   
    ControllerTextoDepartamento controle = new ControllerTextoDepartamento();    
    String modoInterface;
    
    public void LoadTable (){
        DefaultTableModel modelo = new DefaultTableModel (new Object[]{"Codigo","Nome"},0);
        
        for (int i=0 ; i<controle.lista.size();i++){
            Object linha[] = new Object []{controle.lista.get(i).getCodigo(),controle.lista.get(i).getNome()};
            modelo.addRow(linha);
        
        }
        tblDeps.setModel(modelo);
        tblDeps.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblDeps.getColumnModel().getColumn(1).setPreferredWidth(200);        
        tblDeps.setModel(modelo);
    
    }

    /**
     * Creates new form JDepartamento
     */
    public JDepartamento() {
        initComponents();
        setLocationRelativeTo(null);
        modoInterface = "Navegar";
        ManipulaInterface();
    }
    public void ManipulaInterface(){
        switch(modoInterface){
            case "Navegar":
                btnDep_Salvar.setEnabled(false);
                btnDep_Cancelar.setEnabled(false);
                textDep_Codigo.setEnabled(false);
                textDep_Nome.setEnabled(false);
                btnDep_Novo.setEnabled(true);
                btnDep_Editar.setEnabled(false);
                btnDep_Excluir.setEnabled(false);
                btnDep_Gravar.setEnabled(false);
                btnDep_Ler.setEnabled(true);
                break;
            case "Novo":
                btnDep_Salvar.setEnabled(true);
                btnDep_Cancelar.setEnabled(true);
                textDep_Codigo.setEnabled(true);
                textDep_Nome.setEnabled(true);
                btnDep_Novo.setEnabled(false);
                btnDep_Editar.setEnabled(false);
                btnDep_Excluir.setEnabled(false);
                btnDep_Gravar.setEnabled(false);
                btnDep_Ler.setEnabled(true);
                break;
                
            case "Editar":
                btnDep_Salvar.setEnabled(true);
                btnDep_Cancelar.setEnabled(true);
                textDep_Codigo.setEnabled(true);
                textDep_Nome.setEnabled(true);
                btnDep_Novo.setEnabled(true);
                btnDep_Editar.setEnabled(false);
                btnDep_Excluir.setEnabled(false);
                btnDep_Gravar.setEnabled(false);
                btnDep_Ler.setEnabled(true);
                break;
                
            case "Gravar":
                btnDep_Salvar.setEnabled(false);
                btnDep_Cancelar.setEnabled(false);
                textDep_Codigo.setEnabled(false);
                textDep_Nome.setEnabled(false);
                btnDep_Novo.setEnabled(true);
                btnDep_Editar.setEnabled(false);
                btnDep_Excluir.setEnabled(false);
                btnDep_Gravar.setEnabled(false);
                btnDep_Ler.setEnabled(true);
                break;
                
            case "Ler":
                btnDep_Salvar.setEnabled(false);
                btnDep_Cancelar.setEnabled(false);
                textDep_Codigo.setEnabled(false);
                textDep_Nome.setEnabled(false);
                btnDep_Novo.setEnabled(true);
                btnDep_Editar.setEnabled(true);
                btnDep_Excluir.setEnabled(true);
                btnDep_Gravar.setEnabled(true);
                btnDep_Ler.setEnabled(true);
                break;
                
            case "Excluir":
                btnDep_Salvar.setEnabled(false);
                btnDep_Cancelar.setEnabled(false);
                textDep_Codigo.setEnabled(false);
                textDep_Nome.setEnabled(false);
                btnDep_Novo.setEnabled(true);
                btnDep_Editar.setEnabled(true);
                btnDep_Excluir.setEnabled(true);
                btnDep_Gravar.setEnabled(true);
                btnDep_Ler.setEnabled(true);
                break;
                
            case "Selecao":
                btnDep_Salvar.setEnabled(false);
                btnDep_Cancelar.setEnabled(false);
                textDep_Codigo.setEnabled(false);
                textDep_Nome.setEnabled(false);
                btnDep_Novo.setEnabled(true);
                btnDep_Editar.setEnabled(true);
                btnDep_Excluir.setEnabled(true);
                btnDep_Gravar.setEnabled(true);
                btnDep_Ler.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDep_Editar = new javax.swing.JButton();
        TabelaDep = new javax.swing.JScrollPane();
        tblDeps = new javax.swing.JTable();
        btnDep_Excluir = new javax.swing.JButton();
        btnDep_Voltar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        textDep_Codigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        textDep_Nome = new javax.swing.JTextField();
        btnDep_Salvar = new javax.swing.JButton();
        btnDep_Cancelar = new javax.swing.JButton();
        btnDep_Novo = new javax.swing.JButton();
        btnDep_Gravar = new javax.swing.JButton();
        btnDep_Ler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departamento");

        btnDep_Editar.setText("Editar");
        btnDep_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_EditarActionPerformed(evt);
            }
        });

        tblDeps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeps.setRequestFocusEnabled(false);
        tblDeps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepsMouseClicked(evt);
            }
        });
        TabelaDep.setViewportView(tblDeps);
        if (tblDeps.getColumnModel().getColumnCount() > 0) {
            tblDeps.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblDeps.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        btnDep_Excluir.setText("Excluir");
        btnDep_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_ExcluirActionPerformed(evt);
            }
        });

        btnDep_Voltar.setText("Voltar");
        btnDep_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_VoltarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Inserir/Editar Departamento"));

        lblCodigo.setText("Código:");

        lblNome.setText("Nome:");

        btnDep_Salvar.setText("Salvar");
        btnDep_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_SalvarActionPerformed(evt);
            }
        });

        btnDep_Cancelar.setText("Cancelar");
        btnDep_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDep_Nome))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDep_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(btnDep_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDep_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(textDep_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(textDep_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDep_Cancelar)
                    .addComponent(btnDep_Salvar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnDep_Novo.setText("Novo");
        btnDep_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_NovoActionPerformed(evt);
            }
        });

        btnDep_Gravar.setText("Gravar");
        btnDep_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_GravarActionPerformed(evt);
            }
        });

        btnDep_Ler.setText("Ler");
        btnDep_Ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDep_LerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabelaDep, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnDep_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDep_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDep_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDep_Ler, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDep_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDep_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(TabelaDep, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDep_Gravar)
                        .addComponent(btnDep_Ler))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDep_Novo)
                        .addComponent(btnDep_Editar)
                        .addComponent(btnDep_Excluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnDep_Voltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDep_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_EditarActionPerformed
        int codigo = Integer.parseInt(textDep_Codigo.getText());
        controle.editarDepartamento(codigo,textDep_Nome.getText());
        LoadTable();
        modoInterface = "Editar";
        ManipulaInterface();
        textDep_Codigo.setText("");
        textDep_Nome.setText("");
    }//GEN-LAST:event_btnDep_EditarActionPerformed

    private void tblDepsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepsMouseClicked
        int index = tblDeps.getSelectedRow();
        if(index >= 0 && index<controle.lista.size()){
            Departamento d = controle.lista.get(index);
            textDep_Codigo.setText(Integer.toString(d.getCodigo()));
            textDep_Nome.setText(d.getNome());
        }
    }//GEN-LAST:event_tblDepsMouseClicked

    private void btnDep_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_ExcluirActionPerformed
        String Nome = textDep_Nome.getText();
        controle.excluirDepartamento(Nome);
        LoadTable();
        modoInterface = "Excluir";
        ManipulaInterface();
        textDep_Codigo.setText("");
        textDep_Nome.setText("");
    }//GEN-LAST:event_btnDep_ExcluirActionPerformed

    private void btnDep_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_VoltarActionPerformed
        new JMenuInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDep_VoltarActionPerformed

    private void btnDep_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_SalvarActionPerformed
        int codigo = Integer.parseInt(textDep_Codigo.getText());
        controle.addAluno(codigo, textDep_Nome.getText());    
                
        LoadTable();
        modoInterface = "Selecao";
        ManipulaInterface();
        textDep_Codigo.setText("");
        textDep_Nome.setText("");
        

    }//GEN-LAST:event_btnDep_SalvarActionPerformed

    private void btnDep_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_CancelarActionPerformed
        textDep_Codigo.setText("");
        textDep_Nome.setText("");
        modoInterface = "Selecao";
        ManipulaInterface();
    }//GEN-LAST:event_btnDep_CancelarActionPerformed

    private void btnDep_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_NovoActionPerformed
        textDep_Codigo.setText("");
        textDep_Nome.setText("");
        
        modoInterface = "Novo";
        ManipulaInterface();
    }//GEN-LAST:event_btnDep_NovoActionPerformed

    private void btnDep_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_GravarActionPerformed
        controle.gravarDepartamento();
    }//GEN-LAST:event_btnDep_GravarActionPerformed

    private void btnDep_LerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDep_LerActionPerformed
        controle.lerDepartamento();
        LoadTable();
        modoInterface = "Ler";
        ManipulaInterface();
    }//GEN-LAST:event_btnDep_LerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabelaDep;
    private javax.swing.JButton btnDep_Cancelar;
    private javax.swing.JButton btnDep_Editar;
    private javax.swing.JButton btnDep_Excluir;
    private javax.swing.JButton btnDep_Gravar;
    private javax.swing.JButton btnDep_Ler;
    private javax.swing.JButton btnDep_Novo;
    private javax.swing.JButton btnDep_Salvar;
    private javax.swing.JButton btnDep_Voltar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblDeps;
    private javax.swing.JTextField textDep_Codigo;
    private javax.swing.JTextField textDep_Nome;
    // End of variables declaration//GEN-END:variables
}
