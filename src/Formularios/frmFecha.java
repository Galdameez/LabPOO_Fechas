package Formularios;

import Entidades.Fecha;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class frmFecha extends javax.swing.JFrame {

      //Instancia, si eso son. Instancias.
      SpinnerModel modelSpinner;
      DefaultTableModel mdlFechas;
      Fecha fecha;

      public frmFecha() {
            //Establesco parametros del JFrame y creo el objeto Fecha, a pesar que tiene un constructor con parametros, no los utilizaré.
            initComponents();
            this.setVisible(true);
            this.setTitle("Fecha");
            this.fecha = new Fecha();
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            cboMeses = new javax.swing.JComboBox<>();
            jLabel4 = new javax.swing.JLabel();
            spnAños = new javax.swing.JSpinner();
            spnDia = new javax.swing.JSpinner();
            jLabel5 = new javax.swing.JLabel();
            spnHoras = new javax.swing.JSpinner();
            jLabel6 = new javax.swing.JLabel();
            spnMinutos = new javax.swing.JSpinner();
            btnCrearFecha = new javax.swing.JButton();
            jScrollPane2 = new javax.swing.JScrollPane();
            jtFechas = new javax.swing.JTable();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
            jLabel1.setText("Fecha y Hora");

            jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
            jLabel2.setText("Día");

            jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
            jLabel3.setText("Mes");

            cboMeses.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            cboMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
            cboMeses.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        cboMesesMouseClicked(evt);
                  }
            });
            cboMeses.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cboMesesActionPerformed(evt);
                  }
            });

            jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
            jLabel4.setText("Año");

            spnAños.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            spnAños.setModel(new javax.swing.SpinnerNumberModel(2020, 1980, 2050, 1));

            spnDia.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            spnDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

            jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
            jLabel5.setText("Hora");

            spnHoras.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            spnHoras.setModel(new javax.swing.SpinnerNumberModel(1, 1, 23, 1));

            jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
            jLabel6.setText("Minutos");

            spnMinutos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            spnMinutos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 59, 1));

            btnCrearFecha.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            btnCrearFecha.setText("Crear Fecha");
            btnCrearFecha.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnCrearFechaActionPerformed(evt);
                  }
            });

            jtFechas.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            jtFechas.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Fecha"
                  }
            ));
            jScrollPane2.setViewportView(jtFechas);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel1)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCrearFecha)
                                    .addGap(0, 0, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnAños, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))))
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3)
                              .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(spnAños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(spnHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(spnMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            setSize(new java.awt.Dimension(417, 477));
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void cboMesesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMesesMouseClicked
            //AH si!, esto no hace nada, por lo que parece, es un evento que al fin de acabo, termino siendo inservible.
      }//GEN-LAST:event_cboMesesMouseClicked

      private void cboMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesesActionPerformed
            //Mediante un actionPerfomed, cada vez que se elige un mes, se actualiza para saber si tiene 30 o 31 días.
            switch (this.cboMeses.getSelectedIndex()) {
                  case 0:
                  case 2:
                  case 4:
                  case 6:
                  case 7:
                  case 9:
                  case 11:
                        this.modelSpinner = new SpinnerNumberModel(1, 1, 31, 1);
                        this.spnDia.setModel(this.modelSpinner);
                        break;
                  case 1:
                        //En el caso de Febrero, tiene 28 días.  (Tremendo error si es año bisiesto).
                        this.modelSpinner = new SpinnerNumberModel(1, 1, 28, 1);
                        this.spnDia.setModel(this.modelSpinner);
                        break;
                  //Todos estos son meses que tienen 31 días.
                  case 3:
                  case 5:
                  case 8:
                  case 10:
                        this.modelSpinner = new SpinnerNumberModel(1, 1, 30, 1);
                        this.spnDia.setModel(this.modelSpinner);
                        break;
            }
      }//GEN-LAST:event_cboMesesActionPerformed

      private void btnCrearFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFechaActionPerformed
            //Manda a llamar las funciones que están  abajo.
            this.actualizarFecha();
            this.agregarArrowFecha();

      }//GEN-LAST:event_btnCrearFechaActionPerformed

      //Esta función toma un Modelo de Tabla, hace un nuevo Arrow y lo agrega a la tabla
      public void agregarArrowFecha() {
            this.mdlFechas = (DefaultTableModel) this.jtFechas.getModel();
            String arrowFecha[] = {this.fecha.getFecha()};
            this.mdlFechas.addRow(arrowFecha);
      }

      //Con esto se asignan datos al objeto fecha, si este ya tiene datos. Se sustituyen, se evita la creación de nuevos objetos
      private void actualizarFecha() {
            this.fecha.setDia(String.valueOf(this.spnDia.getValue()));
            this.fecha.setMes(this.cboMeses.getSelectedItem().toString());
            this.fecha.setAño(String.valueOf(this.spnAños.getValue()));
            this.fecha.setHoras((int) this.spnHoras.getValue());
            this.fecha.setMinutos((int) (this.spnMinutos.getValue()));
            this.fecha.crearFecha();
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnCrearFecha;
      private javax.swing.JComboBox<String> cboMeses;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JTable jtFechas;
      private javax.swing.JSpinner spnAños;
      private javax.swing.JSpinner spnDia;
      private javax.swing.JSpinner spnHoras;
      private javax.swing.JSpinner spnMinutos;
      // End of variables declaration//GEN-END:variables

}
