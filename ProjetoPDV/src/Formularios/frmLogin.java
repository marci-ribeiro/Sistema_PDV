package Formularios;

import Classes.DadosLogin;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {
    public frmLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        cmdLogin = new javax.swing.JToggleButton();
        cmdSair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        lbUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbUsuario.setText("Usuário:");

        lbSenha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbSenha.setText("Senha:");

        txtSenha.setToolTipText("");
        txtSenha.setName("txtsenha"); // NOI18N

        txtUsuario.setName("txtusuario"); // NOI18N

        cmdLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        cmdSair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cmdSair.setText("Sair");
        cmdSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdSairActionPerformed

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        DadosLogin clsdados = new DadosLogin(); 
        
        if (!clsdados.ValidarUsuarios(txtUsuario.getText(), new String(txtSenha.getPassword()))){
            JOptionPane.showMessageDialog(rootPane, "Usuário e Senha incorretos.");
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.requestFocusInWindow();
            return;
        }
        frmMenu frmmenu = new frmMenu();
        this.setVisible(false);
        frmmenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frmmenu.setVisible(true);
    }//GEN-LAST:event_cmdLoginActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }            
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cmdLogin;
    private javax.swing.JToggleButton cmdSair;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
