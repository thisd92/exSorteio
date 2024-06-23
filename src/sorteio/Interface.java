package sorteio;

import java.util.List;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    private Sorteio sorteio;

    public Interface() {
        initComponents();
        sorteio = new Sorteio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnPalpite = new javax.swing.JButton();
        labelSorteio = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelPalpite = new javax.swing.JLabel();
        buttonSortear = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtPalpite = new javax.swing.JTextField();
        buttonMostrarPalpites = new javax.swing.JButton();
        boxParticipantes = new javax.swing.JComboBox<>();
        btnAtualizarPalpite = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");

        btnPalpite.setText("Cadastrar Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });

        labelSorteio.setText("Sorteio");

        labelNome.setText("Nome");

        labelPalpite.setText("Palpite");

        buttonSortear.setText("Sortear o Numero");
        buttonSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSortearActionPerformed(evt);
            }
        });

        buttonMostrarPalpites.setText("Mostar Palpites");
        buttonMostrarPalpites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarPalpitesActionPerformed(evt);
            }
        });

        boxParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxParticipantesActionPerformed(evt);
            }
        });

        btnAtualizarPalpite.setText("Atualizar Palpite");
        btnAtualizarPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPalpiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(labelSorteio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(buttonSortear)
                                .addGap(18, 18, 18)
                                .addComponent(buttonMostrarPalpites)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelPalpite))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtualizarPalpite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPalpite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxParticipantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSorteio)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPalpite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPalpite)
                    .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPalpite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSortear)
                    .addComponent(buttonMostrarPalpites))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        try {
            String nome = txtNome.getText();
            int palpite = Integer.parseInt(txtPalpite.getText());
            Pessoa participante = new Pessoa(nome, palpite);
            sorteio.cadastrarPessoa(participante);
            atualizarBoxParticipantes();
            JOptionPane.showMessageDialog(this, "Participante cadastrado com sucesso!");
            txtNome.setText("");
            txtPalpite.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Não há nome ou palpite cadastrado");
        }

    }//GEN-LAST:event_btnPalpiteActionPerformed

    private void buttonMostrarPalpitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarPalpitesActionPerformed
        Palpites palpites = new Palpites(this, true, sorteio);
        palpites.setVisible(true);
    }//GEN-LAST:event_buttonMostrarPalpitesActionPerformed

    private void buttonSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSortearActionPerformed
        List<Pessoa> participantes = sorteio.getPessoas();
        if (participantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há participantes cadastrados");
            return;
        } else {
            Resultados resultados = new Resultados(this, true, sorteio);
            resultados.setVisible(true);
        }
    }//GEN-LAST:event_buttonSortearActionPerformed

    private void btnAtualizarPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPalpiteActionPerformed
        // TODO add your handling code here:
        editarPalpite();
    }//GEN-LAST:event_btnAtualizarPalpiteActionPerformed

    private void boxParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxParticipantesActionPerformed
        // TODO add your handling code here:
        atualizarCamposParticipanteSelecionado();
    }//GEN-LAST:event_boxParticipantesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    private void atualizarBoxParticipantes() {
        boxParticipantes.removeAllItems();
        List<Pessoa> participantes = sorteio.getPessoas();
        for (Pessoa p : participantes) {
            boxParticipantes.addItem(p);
        }
    }

    private void atualizarCamposParticipanteSelecionado() {
        Pessoa participanteSelecionado = (Pessoa) boxParticipantes.getSelectedItem();
        if (participanteSelecionado != null) {
            txtNome.setText(participanteSelecionado.getNome());
            txtPalpite.setText(String.valueOf(participanteSelecionado.getNumeroEscolhido()));
        }
    }

    private void editarPalpite() {
        Pessoa participanteSelecionado = (Pessoa) boxParticipantes.getSelectedItem();
        if (participanteSelecionado != null) {
            try {
                int novoPalpite = Integer.parseInt(txtPalpite.getText());
                sorteio.atualizarPalpite(participanteSelecionado, novoPalpite);
                JOptionPane.showMessageDialog(this, "Palpite atualizado com sucesso!");
                atualizarCamposParticipanteSelecionado();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erro: Palpite deve ser um número inteiro válido.");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Pessoa> boxParticipantes;
    private javax.swing.JButton btnAtualizarPalpite;
    private javax.swing.JButton btnPalpite;
    private javax.swing.JButton buttonMostrarPalpites;
    private javax.swing.JButton buttonSortear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPalpite;
    private javax.swing.JLabel labelSorteio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPalpite;
    // End of variables declaration//GEN-END:variables
}
