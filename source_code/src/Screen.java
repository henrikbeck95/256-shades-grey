import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Screen extends javax.swing.JFrame {
    public static Scanner ENTRADA = new Scanner(System.in);
    public static Variables var = new Variables();
    public static Controller ct = new Controller();
    
    JLabel LB = new JLabel();
    JLabel LB2 = new JLabel();
    
    public Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanePrincipal = new javax.swing.JScrollPane();
        jScrollPaneMiniatura = new javax.swing.JScrollPane();
        jPanelNull = new javax.swing.JPanel();
        btnLimparConteudo = new javax.swing.JButton();
        btnCarregarImagem = new javax.swing.JButton();
        lblMenuFerramentas = new javax.swing.JLabel();
        btnEscalaCinza = new javax.swing.JButton();
        btnEscalaBrancoPreto = new javax.swing.JButton();
        btnExportarImagem = new javax.swing.JButton();
        jPanelImagemOriginal = new javax.swing.JPanel();
        lblImagemOriginal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("@henrikbeck95 - 256 tons de cinza");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLimparConteudo.setText("Limpar conteúdo");
        btnLimparConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConteudoActionPerformed(evt);
            }
        });

        btnCarregarImagem.setText("Carregar imagem");
        btnCarregarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImagemActionPerformed(evt);
            }
        });

        lblMenuFerramentas.setText("Menu de ferramentas");

        btnEscalaCinza.setText("Escala de cinza");
        btnEscalaCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalaCinzaActionPerformed(evt);
            }
        });

        btnEscalaBrancoPreto.setText("Escala de branco e preto");
        btnEscalaBrancoPreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalaBrancoPretoActionPerformed(evt);
            }
        });

        btnExportarImagem.setText("Exportar imagem");
        btnExportarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNullLayout = new javax.swing.GroupLayout(jPanelNull);
        jPanelNull.setLayout(jPanelNullLayout);
        jPanelNullLayout.setHorizontalGroup(
            jPanelNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNullLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMenuFerramentas)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNullLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanelNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExportarImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEscalaBrancoPreto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEscalaCinza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparConteudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarregarImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelNullLayout.setVerticalGroup(
            jPanelNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNullLayout.createSequentialGroup()
                .addComponent(lblMenuFerramentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarregarImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparConteudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEscalaCinza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEscalaBrancoPreto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btnExportarImagem))
        );

        lblImagemOriginal.setText("Imagem original");

        javax.swing.GroupLayout jPanelImagemOriginalLayout = new javax.swing.GroupLayout(jPanelImagemOriginal);
        jPanelImagemOriginal.setLayout(jPanelImagemOriginalLayout);
        jPanelImagemOriginalLayout.setHorizontalGroup(
            jPanelImagemOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemOriginalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblImagemOriginal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelImagemOriginalLayout.setVerticalGroup(
            jPanelImagemOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagemOriginalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImagemOriginal))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelImagemOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelNull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneMiniatura))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelNull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelImagemOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneMiniatura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImagemActionPerformed
        JFileChooser JBUSCA = new JFileChooser(); //Abre a janela do explorer para buscar a imagem
        var.setJBUSCA(JBUSCA);

        if(JBUSCA.showOpenDialog(jPanelNull) == JFileChooser.APPROVE_OPTION){
            File arquivo = JBUSCA.getSelectedFile();
            var.setArquivo(arquivo);
            
            janelaPrincipal();
            janelaMiniatura();   
        }
    }//GEN-LAST:event_btnCarregarImagemActionPerformed

    void janelaPrincipal(){
        ImageIcon icon = new ImageIcon(var.getArquivo().toString());
        icon.setImage(icon.getImage().getScaledInstance(jScrollPanePrincipal.getWidth() - 10, jScrollPanePrincipal.getHeight() - 10, 1));
        LB.setIcon(icon);
        jScrollPanePrincipal.getViewport().add(LB);
    }
    
    void janelaMiniatura(){
        ImageIcon icon2 = new ImageIcon(var.getArquivo().toString());
        icon2.setImage(icon2.getImage().getScaledInstance(jScrollPaneMiniatura.getWidth() - 10, jScrollPaneMiniatura.getHeight() - 10, 1));
        LB2.setHorizontalAlignment(LB2.CENTER);
        LB2.setVerticalAlignment(LB2.CENTER);
        LB2.setIcon(icon2);
        jScrollPaneMiniatura.getViewport().add(LB2);
    }
    
    private void btnLimparConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConteudoActionPerformed
        LB.setIcon(null);
        //LB2.setIcon(null);
    }//GEN-LAST:event_btnLimparConteudoActionPerformed

    private void btnEscalaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalaCinzaActionPerformed
        BufferedImage original = null;
        try {
            original = ImageIO.read(var.getArquivo());
        } catch (IOException ex) {
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        }

        int w = original.getWidth();
        int h = original.getHeight();

        BufferedImage processada = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int colorido = original.getRGB(x, y);
                int cinza = ct.escalaDeCinza(colorido);
                processada.setRGB(x, y, cinza);
            }
        }
        
        var.setProcessada(processada);
        renderizar();
    }//GEN-LAST:event_btnEscalaCinzaActionPerformed

    private void renderizar(){
        ImageIcon icon = new ImageIcon(var.getProcessada());
        icon.setImage(icon.getImage().getScaledInstance(jScrollPanePrincipal.getWidth() - 10, jScrollPanePrincipal.getHeight() - 10, 1));
        LB.setIcon(icon);
        jScrollPanePrincipal.getViewport().add(LB);
    }
    
    private void btnExportarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarImagemActionPerformed
        ct.exportarImagem(var.getProcessada());
    }//GEN-LAST:event_btnExportarImagemActionPerformed

    private void btnEscalaBrancoPretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalaBrancoPretoActionPerformed
        BufferedImage original = null;
        try {
            original = ImageIO.read(var.getArquivo());
        } catch (IOException ex) {
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        }

        int w = original.getWidth();
        int h = original.getHeight();

        BufferedImage processada = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int colorido = original.getRGB(x, y);
                int cinza = ct.escalaBrancoPreto(colorido);
                processada.setRGB(x, y, cinza);
            }
        }
        
        var.setProcessada(processada);
        renderizar();
    }//GEN-LAST:event_btnEscalaBrancoPretoActionPerformed
    
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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarImagem;
    private javax.swing.JButton btnEscalaBrancoPreto;
    private javax.swing.JButton btnEscalaCinza;
    private javax.swing.JButton btnExportarImagem;
    private javax.swing.JButton btnLimparConteudo;
    private javax.swing.JPanel jPanelImagemOriginal;
    public javax.swing.JPanel jPanelNull;
    private javax.swing.JScrollPane jScrollPaneMiniatura;
    private javax.swing.JScrollPane jScrollPanePrincipal;
    private javax.swing.JLabel lblImagemOriginal;
    private javax.swing.JLabel lblMenuFerramentas;
    // End of variables declaration//GEN-END:variables
}