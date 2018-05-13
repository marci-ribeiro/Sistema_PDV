package Formularios;

public class frmMenu extends javax.swing.JFrame {
    public frmMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivos = new javax.swing.JMenu();
        mnArquivosClientes = new javax.swing.JMenuItem();
        mnArquivosProdutos = new javax.swing.JMenuItem();
        mnArquivosUsuários = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnArquivosAltSenha = new javax.swing.JMenuItem();
        mnArquivosAltUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnArquivosSair = new javax.swing.JMenuItem();
        mnMovimentos = new javax.swing.JMenu();
        mnMovimentosVendas = new javax.swing.JMenuItem();
        mnMovimentosRelatorios = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        mnAjudaSobre = new javax.swing.JMenuItem();
        mnAjudaAjuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Sistema de Caixa"); // NOI18N

        mnArquivos.setText("Arquivos");
        mnArquivos.setToolTipText("");

        mnArquivosClientes.setMnemonic('C');
        mnArquivosClientes.setText("Clientes");
        mnArquivosClientes.setToolTipText("");
        mnArquivos.add(mnArquivosClientes);

        mnArquivosProdutos.setText("Produtos");
        mnArquivosProdutos.setToolTipText("");
        mnArquivos.add(mnArquivosProdutos);

        mnArquivosUsuários.setText("Usuários");
        mnArquivosUsuários.setToolTipText("");
        mnArquivos.add(mnArquivosUsuários);
        mnArquivos.add(jSeparator1);

        mnArquivosAltSenha.setText("Alterar Senha");
        mnArquivosAltSenha.setToolTipText("");
        mnArquivosAltSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivosAltSenhaActionPerformed(evt);
            }
        });
        mnArquivos.add(mnArquivosAltSenha);

        mnArquivosAltUsuario.setText("Alterar Usuário");
        mnArquivosAltUsuario.setToolTipText("");
        mnArquivos.add(mnArquivosAltUsuario);
        mnArquivos.add(jSeparator2);

        mnArquivosSair.setText("Sair");
        mnArquivosSair.setToolTipText("");
        mnArquivos.add(mnArquivosSair);

        jMenuBar1.add(mnArquivos);

        mnMovimentos.setText("Movimentos");

        mnMovimentosVendas.setMnemonic('C');
        mnMovimentosVendas.setText("Vendas");
        mnMovimentosVendas.setToolTipText("");
        mnMovimentos.add(mnMovimentosVendas);

        mnMovimentosRelatorios.setText("Relatório Vendas");
        mnMovimentosRelatorios.setToolTipText("");
        mnMovimentos.add(mnMovimentosRelatorios);

        jMenuBar1.add(mnMovimentos);

        mnAjuda.setText("Ajuda");

        mnAjudaSobre.setText("Sobre");
        mnAjuda.add(mnAjudaSobre);

        mnAjudaAjuda.setText("Ajuda");
        mnAjudaAjuda.setToolTipText("");
        mnAjuda.add(mnAjudaAjuda);

        jMenuBar1.add(mnAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnArquivosAltSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivosAltSenhaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnArquivosAltSenhaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenuItem mnAjudaAjuda;
    private javax.swing.JMenuItem mnAjudaSobre;
    private javax.swing.JMenu mnArquivos;
    private javax.swing.JMenuItem mnArquivosAltSenha;
    private javax.swing.JMenuItem mnArquivosAltUsuario;
    private javax.swing.JMenuItem mnArquivosClientes;
    private javax.swing.JMenuItem mnArquivosProdutos;
    private javax.swing.JMenuItem mnArquivosSair;
    private javax.swing.JMenuItem mnArquivosUsuários;
    private javax.swing.JMenu mnMovimentos;
    private javax.swing.JMenuItem mnMovimentosRelatorios;
    private javax.swing.JMenuItem mnMovimentosVendas;
    // End of variables declaration//GEN-END:variables
}
