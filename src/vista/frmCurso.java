/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Curso;
import modelo.Lista_Doble;

/**
 *
 * @author Delma
 */
public class frmCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCurso
     */
    Lista_Doble ld = new Lista_Doble();
    DefaultTableModel model;

    public frmCurso() {
        initComponents();
        this.setLocation(150, 40);
        this.setTitle("Mantenimiento de Curso");
        
        model = new DefaultTableModel();
        model.addColumn("CÓDIGO");
        model.addColumn("ASIGNATURA");
        model.addColumn("CICLO");
        model.addColumn("CRÉDITOS");
        model.addColumn("HORAS");
        tblCursos.setModel(model);

        ajustarColumnas();
        listar();
        deshabilitarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxCodigo = new javax.swing.JComboBox<>();
        boxCiclo = new javax.swing.JComboBox<>();
        txtAsignatura = new javax.swing.JTextField();
        txtCredito = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Mantenimiento de Cursos");
        setVisible(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel2.setText("Asignatura:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel3.setText("Ciclo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel4.setText("N° de Creditos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel5.setText("Cant. de horas:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        boxCodigo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        boxCodigo.setEnabled(false);
        boxCodigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxCodigoItemStateChanged(evt);
            }
        });
        jPanel1.add(boxCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        boxCiclo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        boxCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));
        boxCiclo.setEnabled(false);
        boxCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCicloActionPerformed(evt);
            }
        });
        jPanel1.add(boxCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, -1));

        txtAsignatura.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jPanel1.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 230, -1));

        txtCredito.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jPanel1.add(txtCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 60, -1));

        txtHoras.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jPanel1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 50, -1));

        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 40));

        btnModificar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 130, 50));

        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 40));

        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 130, 50));

        btnAdicionar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 130, 50));

        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Asignatura", "Ciclo", "Creditos", "Horas"
            }
        ));
        tblCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCursos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 620, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        limpiar();
        habilitar(false, true, true, true, true, true, true, false, true, false);
        boxCodigo.addItem(String.valueOf(ld.codigoCorelativoCur()));
        boxCodigo.setSelectedIndex(ld.tamañoCurso());
        txtAsignatura.requestFocus();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!btnAdicionar.isEnabled()) {
            deshabilitarTodo();
        }
        habilitar(true, true, true, true, true, true, true, true, false, false);
        boxCodigo.requestFocus();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int codCurso = leerCodigo();
            Curso buscado = ld.buscarCurso(codCurso);
            //ld.eliminar(buscado);
            listar();
            mensaje("Curso eliminado exitosamente");
            deshabilitarTodo();
        } catch (Exception error) {
            error("Seleccione un código de curso", boxCodigo);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            int codCurso = leerCodigo();
            String asignatura = leerAsignatura();
            if (asignatura.length() != 0) {
                int ciclo = leerCiclo();
                if (ciclo != -1) {
                    try {
                        int creditos = leerCreditos();
                        try {
                            int horas = leerHoras();
                            if (!btnAdicionar.isEnabled()) {
                                Curso curso = new Curso(codCurso, asignatura, ciclo, creditos, horas);
                                ld.insertarCurso(curso);
                                
                                listar();
                                mensaje("Nuevo curso añadido exitosamente");
                                deshabilitarTodo();
                            } else if (!btnModificar.isEnabled()) {
                                Curso buscado = ld.buscarCurso(codCurso);
                                buscado.setAsignatura(asignatura);
                                buscado.setCiclo(ciclo);
                                buscado.setCreditos(creditos);
                                buscado.setHoras(horas);

                                listar();
                                mensaje("Curso modificado exitosamente");
                                deshabilitarTodo();
                            }
                        } catch (Exception error) {
                            error("Ingrese un número de horas válido", txtHoras);
                        }
                    } catch (Exception error) {
                        error("Ingrese una cantidad de créditos válida", txtCredito);
                    }
                } else {
                    error("Seleccione el ciclo al que pertenece el curso", boxCiclo);
                }
            } else {
                error("Ingrese el nombre de la asignatura", txtAsignatura);
            }
        } catch (Exception error) {
            error("Seleccione un código de curso", boxCodigo);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        deshabilitarTodo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void boxCodigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxCodigoItemStateChanged
        try {
            int codCurso = leerCodigo();
            Curso buscado = ld.buscarCurso(codCurso);
            txtAsignatura.setText(buscado.getAsignatura());
            boxCiclo.setSelectedIndex(buscado.getCiclo());
            txtCredito.setText("" + buscado.getCreditos());
            txtHoras.setText("" + buscado.getHoras());
            tblCursos.setRowSelectionInterval(boxCodigo.getSelectedIndex(), boxCodigo.getSelectedIndex());
        } catch (Exception error) {
        }
    }//GEN-LAST:event_boxCodigoItemStateChanged

    private void tblCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursosMouseClicked
        if (!btnAdicionar.isEnabled()) {
        } else {
            try {
                Curso buscado = ld.buscarCurso(101 + tblCursos.getSelectedRow());
                boxCodigo.setSelectedIndex(tblCursos.getSelectedRow());
                txtAsignatura.setText(buscado.getAsignatura());
                boxCiclo.setSelectedIndex(buscado.getCiclo());
                txtCredito.setText("" + buscado.getCreditos());
                txtHoras.setText("" + buscado.getHoras());
            } catch (Exception error) {
            }
        }
    }//GEN-LAST:event_tblCursosMouseClicked

    private void boxCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCicloActionPerformed

    void habilitar(boolean codigo, boolean asignatura, boolean ciclo, boolean creditos, boolean horas,
            boolean aceptar, boolean cancelar, boolean adicionar, boolean modificar, boolean eliminar) {
        boxCodigo.setEnabled(codigo);
        txtAsignatura.setEditable(asignatura);
        boxCiclo.setEnabled(ciclo);
        txtCredito.setEditable(creditos);
        txtHoras.setEditable(horas);
        btnAceptar.setEnabled(aceptar);
        btnCancelar.setEnabled(cancelar);
        btnAdicionar.setEnabled(adicionar);
        btnModificar.setEnabled(modificar);
        btnEliminar.setEnabled(eliminar);
    }

    void deshabilitarTodo() {
        listarCboCodigo();
        habilitar(false, false, false, false, false, false, false, true, true, true);
        limpiar();
    }

    void limpiar() {
        boxCodigo.setSelectedIndex(-1);
        txtAsignatura.setText("");
        boxCiclo.setSelectedIndex(-1);
        txtCredito.setText("");
        txtHoras.setText("");
    }

    void listarCboCodigo() {
        boxCodigo.removeAllItems();
        ld.cajaCurso(boxCodigo);
    }

    void ajustarColumnas() {
        TableColumnModel modelocolumna = tblCursos.getColumnModel();
        modelocolumna.getColumn(0).setPreferredWidth(jScrollPane1.getWidth() * 1);
        modelocolumna.getColumn(1).setPreferredWidth(jScrollPane1.getWidth() * 6);
        modelocolumna.getColumn(2).setPreferredWidth(jScrollPane1.getWidth() * 1);
        modelocolumna.getColumn(3).setPreferredWidth(jScrollPane1.getWidth() * 1);
        modelocolumna.getColumn(4).setPreferredWidth(jScrollPane1.getWidth() * 1);
    }

    void listar() {
        model.getDataVector().removeAllElements();
        ld.Lista_Cursos(model);
    }

    int leerCodigo() {
        return Integer.parseInt(boxCodigo.getSelectedItem().toString());
    }

    String leerAsignatura() {
        return txtAsignatura.getText().trim().toUpperCase();
    }

    int leerCiclo() {
        return boxCiclo.getSelectedIndex();
    }

    int leerCreditos() {
        return Integer.parseInt(txtCredito.getText());
    }

    int leerHoras() {
        return Integer.parseInt(txtHoras.getText());
    }

    void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    void error(String s, JComboBox cbo) {
        JOptionPane.showMessageDialog(this, s, "", JOptionPane.ERROR_MESSAGE);
        cbo.requestFocus();
    }

    void error(String s, JTextField txt) {
        JOptionPane.showMessageDialog(this, s, "", JOptionPane.ERROR_MESSAGE);
        txt.selectAll();
        txt.requestFocus();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCiclo;
    public javax.swing.JComboBox<String> boxCodigo;
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnAdicionar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCursos;
    public javax.swing.JTextField txtAsignatura;
    public javax.swing.JTextField txtCredito;
    public javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
