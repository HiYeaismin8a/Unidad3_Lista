/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import Clases.LEDPrioridad_C;
import Clases.ListaConValores;
import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class ListaDoblePrioridad extends javax.swing.JFrame {

    /**
     * Creates new form ListaDoblePrioridad
     */
    public ListaDoblePrioridad() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrioridad = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        botonListaNumero = new javax.swing.JRadioButton();
        botonListaCaracter = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTVALORACOMPARAR = new javax.swing.JTextField();
        TXTVALOR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnELIMINAR2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Valor:");

        jLabel2.setText("Prioridad:");

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        butonGroup.add(botonListaNumero);
        botonListaNumero.setText("Lista P. Número");
        botonListaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaNumeroActionPerformed(evt);
            }
        });

        butonGroup.add(botonListaCaracter);
        botonListaCaracter.setText("Lista P. Caracter");
        botonListaCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaCaracterActionPerformed(evt);
            }
        });

        jLabel3.setText("VALOR:");

        jLabel4.setText("VALOR A COMPARAR:");

        TXTVALOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTVALORActionPerformed(evt);
            }
        });

        jButton1.setText("INSERTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnELIMINAR2.setText("ELIMINAR");
        btnELIMINAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINAR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtPrioridad, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonListaNumero)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonListaCaracter)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTVALOR, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(TXTVALORACOMPARAR)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnELIMINAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonListaNumero))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTVALORACOMPARAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXTVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonListaCaracter)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnELIMINAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void mostrarLista() {
        jTextArea1.setText(lista.mostrar());
    }

    public void inicializacion() {
        //LISTA CARACTER
        jLabel4.setVisible(false);
        jLabel3.setVisible(false);
        TXTVALORACOMPARAR.setVisible(false);
        TXTVALOR.setVisible(false);
        jButton1.setVisible(false);
        btnELIMINAR2.setVisible(false);
        
        //lista NUMERO
        btnEliminar.setVisible(false);
        btnInsertar.setVisible(false);
        txtValor.setVisible(false);
        txtPrioridad.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
    }
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        //validar que los campos esten llenos, regresar el cursor al campo de texto y 
        //verificar que prioridad sea entero.
        if (botonListaNumero.isSelected()) {
            if (validaciones() == true) {
                valor = txtValor.getText().charAt(0);
                prioridad = Integer.parseInt(txtPrioridad.getText());

                if (prioridad < 1 || prioridad > 3) {
                    JOptionPane.showMessageDialog(this, "ERROR, la prioridad debe de ser entre 1 y 3");
                    txtValor.setText("");
                    txtPrioridad.setText("");
                    return;

                }

                boolean respuesta = lista.insertar(valor, prioridad);
                if (respuesta = true) {
                    JOptionPane.showMessageDialog(this, "Se insertó el valor: " + valor + "en Lista Núm.");
                    txtValor.setText("");
                    txtPrioridad.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Lista llena");
                }
                txtValor.setText("");
                txtPrioridad.setText("");
                mostrarLista();
            }
            return;
        }
    }//GEN-LAST:event_btnInsertarActionPerformed
    public boolean validaciones() {
        if ("".equals(txtValor.getText())) {
            JOptionPane.showMessageDialog(this, "No dejar en blanco el campo valor.");
            return false;
        }

        if ("".equals(txtPrioridad.getText())) {
            JOptionPane.showMessageDialog(this, "No dejar en blanco el campo valor.");
            return false;
        }

        String cadena = "\\D";
        if (txtPrioridad.getText().matches(cadena)) {
            JOptionPane.showMessageDialog(this, "Solo ingresar números en la PRIORIDAD.");
            return false;
        }

        return true;
    }

    public boolean validaciones2() {
        if ("".equals(TXTVALOR.getText())) {
            JOptionPane.showMessageDialog(this, "No dejar en blanco el campo valor.");
            return false;
        }

        if ("".equals(TXTVALORACOMPARAR.getText())) {
            JOptionPane.showMessageDialog(this, "No dejar en blanco el campo valor.");
            return false;
        }

        String cadena = "\\D";
        if (txtPrioridad.getText().matches(cadena)) {
            JOptionPane.showMessageDialog(this, "Solo ingresar números en la PRIORIDAD.");
            return false;
        }

        return true;
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //Validar que los campos esten llenos y validar que prioridad sea entero
        if (botonListaNumero.isSelected()) {
            if (validaciones() == true) {
                valor = txtValor.getText().charAt(0);
                prioridad = Integer.parseInt(txtPrioridad.getText());
                resultado = lista.eliminar(valor, prioridad);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(this, "Se a eliminado: " + valor + "ListaNUM");
                    txtValor.setText("");
                    txtPrioridad.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encuentra ese valor.");
                    txtValor.setText("");
                    txtPrioridad.setText("");;
                }
                mostrarLista();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TXTVALORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTVALORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTVALORActionPerformed
    public void mostrarLista2() {
        jTextArea1.setText(listaValores.mostrar());
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (botonListaCaracter.isSelected()) {
            if (validaciones2() == true) {
                valor = TXTVALOR.getText().charAt(0);
                valorAcomparar = TXTVALORACOMPARAR.getText().charAt(0);

                /*if (prioridad < 1 || prioridad > 3) {
                JOptionPane.showMessageDialog(this, "ERROR, la prioridad debe de ser entre 1 y 3");
                TXTVALOR.setText("");
            TXTVALORACOMPARAR.setText("");
                return;

            }*/
                boolean respuesta = listaValores.insertar(valor, valorAcomparar);
                if (respuesta = true) {
                    JOptionPane.showMessageDialog(this, "Se insertó el valor: " + valor + "en Lista CARACTER");
                    TXTVALOR.setText("");
                    TXTVALORACOMPARAR.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Lista llena");
                }
                TXTVALOR.setText("");
                TXTVALORACOMPARAR.setText("");
                mostrarLista2();
            }
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un RadioButon.R");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnELIMINAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINAR2ActionPerformed
        // TODO add your handling code here:
        if (botonListaCaracter.isSelected()) {
            if (validaciones2() == true) {
                valor = TXTVALOR.getText().charAt(0);
                valorAcomparar = TXTVALORACOMPARAR.getText().charAt(0);
                resultado = listaValores.eliminar(valor, valorAcomparar);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(this, "Se a eliminado: " + valor + "en Lista CARACTER");
                    TXTVALOR.setText("");
                    TXTVALORACOMPARAR.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encuentra ese valor.");
                    TXTVALOR.setText("");
                    TXTVALORACOMPARAR.setText("");;
                }
                mostrarLista2();
            }
        }
    }//GEN-LAST:event_btnELIMINAR2ActionPerformed

    private void botonListaCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaCaracterActionPerformed
        // TODO add your handling code here:
        if (botonListaCaracter.isSelected()) {
            jLabel4.setVisible(true);
            jLabel3.setVisible(true);
            TXTVALORACOMPARAR.setVisible(true);
            TXTVALOR.setVisible(true);
            jButton1.setVisible(true);
            btnELIMINAR2.setVisible(true);
        }
  btnEliminar.setVisible(false);
        btnInsertar.setVisible(false);
        txtValor.setVisible(false);
        txtPrioridad.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_botonListaCaracterActionPerformed

    private void botonListaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaNumeroActionPerformed
        // TODO add your handling code here:
        if (botonListaNumero.isSelected()) {
            
            btnEliminar.setVisible(true);
            btnInsertar.setVisible(true);
            txtValor.setVisible(true);
            txtPrioridad.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
        }
        jLabel4.setVisible(false);
        jLabel3.setVisible(false);
        TXTVALORACOMPARAR.setVisible(false);
        TXTVALOR.setVisible(false);
        jButton1.setVisible(false);
        btnELIMINAR2.setVisible(false);
    }//GEN-LAST:event_botonListaNumeroActionPerformed
    LEDPrioridad_C lista = new LEDPrioridad_C();
    ListaConValores listaValores = new ListaConValores();
    char valor, valorAcomparar;
    int prioridad;
    boolean resultado;

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
            java.util.logging.Logger.getLogger(ListaDoblePrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDoblePrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDoblePrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDoblePrioridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDoblePrioridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTVALOR;
    private javax.swing.JTextField TXTVALORACOMPARAR;
    private javax.swing.JRadioButton botonListaCaracter;
    private javax.swing.JRadioButton botonListaNumero;
    private javax.swing.JButton btnELIMINAR2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.ButtonGroup butonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtPrioridad;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
