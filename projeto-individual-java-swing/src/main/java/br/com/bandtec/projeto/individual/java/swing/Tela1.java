package br.com.bandtec.projeto.individual.java.swing;

import java.util.concurrent.ThreadLocalRandom;

public class Tela1 extends javax.swing.JFrame {
    
    // atributos CPU
    Integer maxCpu = 0;
    Integer minCpu = 100;
    Integer mediaCpu = 0;
    
    // atributos Disco
    Integer maxDisco = 0;
    Integer minDisco = 100;
    Integer mediaDisco = 0;
    
    // atributos Memória
    Integer maxMemoria = 0;
    Integer minMemoria = 100;
    Integer mediaMemoria = 0;
    
    public Tela1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        prgBarCpu = new javax.swing.JProgressBar();
        prgBarDisco = new javax.swing.JProgressBar();
        prgBarMemoria = new javax.swing.JProgressBar();
        lblCpu = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        lblMaxCpu = new javax.swing.JLabel();
        lblMinCpu = new javax.swing.JLabel();
        lblMediaCpu = new javax.swing.JLabel();
        lblMaxDisco = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        lblMaxMemoria = new javax.swing.JLabel();
        lblMinMemoria = new javax.swing.JLabel();
        lblMediaMemoria = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnLeitura = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prgBarCpu.setStringPainted(true);

        prgBarDisco.setStringPainted(true);

        prgBarMemoria.setStringPainted(true);

        lblCpu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCpu.setText("CPU");

        lblDisco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDisco.setText("Disco");

        lblMemoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMemoria.setText("Memória");

        lblMaxCpu.setText("Max:");

        lblMinCpu.setText("Min:");

        lblMediaCpu.setText("Média:");

        lblMaxDisco.setText("Max:");

        lblMinDisco.setText("Min:");

        lblMediaDisco.setText("Média:");

        lblMaxMemoria.setText("Max:");

        lblMinMemoria.setText("Min:");

        lblMediaMemoria.setText("Média:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 51, 153));
        lblTitulo.setText("LEITURA DOS DADOS DA MÁQUINA");

        btnLeitura.setBackground(new java.awt.Color(255, 0, 102));
        btnLeitura.setForeground(new java.awt.Color(255, 255, 255));
        btnLeitura.setText("Fazer Leitura");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpu)
                            .addComponent(lblMemoria)
                            .addComponent(prgBarMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prgBarDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prgBarCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaxCpu)
                            .addComponent(lblMinCpu)
                            .addComponent(lblMediaCpu)
                            .addComponent(lblMaxDisco)
                            .addComponent(lblMinDisco)
                            .addComponent(lblMediaDisco)
                            .addComponent(lblMaxMemoria)
                            .addComponent(lblMinMemoria)
                            .addComponent(lblMediaMemoria))
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnLeitura)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu)
                    .addComponent(lblMaxCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prgBarCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMediaCpu)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMaxDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMediaDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxMemoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMinMemoria))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMemoria)
                                .addGap(5, 5, 5)
                                .addComponent(prgBarMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMediaMemoria)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prgBarDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnLeitura)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        
        // número randomico para os componentes
        Integer randomCpu = ThreadLocalRandom.current().nextInt(0, 101);
        Integer randomDisco = ThreadLocalRandom.current().nextInt(0, 101);
        Integer randomMemoria = ThreadLocalRandom.current().nextInt(0, 101);
        
        // inserindo valor randomico à barra de progresso
        prgBarCpu.setValue(randomCpu);
        prgBarDisco.setValue(randomDisco);
        prgBarMemoria.setValue(randomMemoria);
        
        // inserindo valores Maximos e Mínimos das barras á legenda
        // CPU
        if (randomCpu > maxCpu) {
            lblMaxCpu.setText("Max: " + randomCpu);
            maxCpu = randomCpu;
        } 
        
        if (randomCpu < minCpu) {
            lblMinCpu.setText("Min: " + randomCpu);
            minCpu = randomCpu;
        }
         
        // Disco
        if (randomDisco > maxDisco) {
            lblMaxDisco.setText("Max: " + randomDisco);
            maxDisco = randomDisco;
        } 
        
        if (randomDisco < minDisco){
            lblMinDisco.setText("Min: " + randomDisco);
            minDisco = randomDisco;
        }
            
        // Memória
        if (randomMemoria > maxMemoria) {
            lblMaxMemoria.setText("Max: " + randomMemoria);
            maxMemoria = randomMemoria;
        } 
        
        if (randomMemoria < minMemoria) {
            lblMinMemoria.setText("Min: " + randomMemoria);
            minMemoria = randomMemoria;
        }
        
        // inserindo Média dos valores Mínimos e Máximos das barras á legenda
        // CPU
        if (maxCpu > 0 && minCpu > 0) {
            lblMediaCpu.setText("Media: " + ((maxCpu + minCpu)/2));
        }
        
        // Disco
        if (maxDisco > 0 && minDisco > 0) {
            lblMediaDisco.setText("Media: " + ((maxDisco + minDisco)/2));
        }
        
        // Memória
        if (maxMemoria > 0 && minMemoria > 0) {
            lblMediaMemoria.setText("Media: " + ((maxMemoria + minMemoria)/2));
        }

    }//GEN-LAST:event_btnLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMaxCpu;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxMemoria;
    private javax.swing.JLabel lblMediaCpu;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaMemoria;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMinCpu;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinMemoria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JProgressBar prgBarCpu;
    private javax.swing.JProgressBar prgBarDisco;
    private javax.swing.JProgressBar prgBarMemoria;
    // End of variables declaration//GEN-END:variables
}
