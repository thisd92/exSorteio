package sorteio;

import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {

    private Sorteio sorteio;
    private Sorteado sorteados;

    public Interface() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/roleta.png"));
        Image imagemIcone = icon.getImage();
        setIconImage(imagemIcone);

        // Define a fonte padrão
        Font fontePadrao = new Font("Arial", Font.PLAIN, 20);

        // Configura a fonte padrão para toda a aplicação
        UIManager.put("Label.font", new FontUIResource(fontePadrao));
        UIManager.put("Button.font", new FontUIResource(fontePadrao));
        UIManager.put("TextField.font", new FontUIResource(fontePadrao));
        UIManager.put("ComboBox.font", new FontUIResource(fontePadrao));
        UIManager.put("List.font", new FontUIResource(fontePadrao));
        UIManager.put("TextArea.font", new FontUIResource(fontePadrao));

        initComponents();
        setTitle("Sorteio");
        sorteio = new Sorteio();
        sorteados = new Sorteado();

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
        btnDelPalpite = new javax.swing.JButton();
        bntPrevPalpites = new javax.swing.JButton();

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

        btnDelPalpite.setText("Deletar Palpite");
        btnDelPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelPalpiteActionPerformed(evt);
            }
        });

        bntPrevPalpites.setText("Sorteios Anteriores");
        bntPrevPalpites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPrevPalpitesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(labelPalpite)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPalpite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAtualizarPalpite, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(boxParticipantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelPalpite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMostrarPalpites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntPrevPalpites, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSorteio)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSorteio)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizarPalpite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPalpite))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelPalpite)
                    .addComponent(btnPalpite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonMostrarPalpites)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSortear)
                    .addComponent(bntPrevPalpites))
                .addGap(25, 25, 25))
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
            Resultados resultados = new Resultados(this, true, sorteio, sorteados);
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

    private void btnDelPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelPalpiteActionPerformed
        // TODO add your handling code here:
        deletarPalpite();
    }//GEN-LAST:event_btnDelPalpiteActionPerformed

    private void bntPrevPalpitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrevPalpitesActionPerformed
        // TODO add your handling code here:
        if (sorteados != null) {
            PrevPalpites prevPalpite = new PrevPalpites(this, true, sorteio, sorteados);
            prevPalpite.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum sorteio foi realizado ainda.");
        }
    }//GEN-LAST:event_bntPrevPalpitesActionPerformed

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

    private void deletarPalpite() {
        Pessoa participanteSelecionado = (Pessoa) boxParticipantes.getSelectedItem();
        if (participanteSelecionado != null) {
            try {
                sorteio.deletarPalpite(participanteSelecionado);
                JOptionPane.showMessageDialog(this, "Palpite deletado com sucesso!");
                atualizarBoxParticipantes();
                txtNome.setText("");
                txtPalpite.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao deletar palpite.");
            }
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
    private javax.swing.JButton bntPrevPalpites;
    private javax.swing.JComboBox<Pessoa> boxParticipantes;
    private javax.swing.JButton btnAtualizarPalpite;
    private javax.swing.JButton btnDelPalpite;
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
