/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GABRIELA
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    Paquete p;

    public Vista(Paquete q) {
        initComponents();
        p = q;
        System.out.println(p);
        JCBPaquetes.removeAllItems();
        JCBPaquetes.addItem("Seleccione una opcion");

        JCBPaquetes.addItem(p.getNombre());

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
        JCBClases = new javax.swing.JComboBox<>();
        JCBAtributos = new javax.swing.JComboBox<>();
        JCBMetodos = new javax.swing.JComboBox<>();
        JCBPaquetes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel1.setText("Paquete:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel2.setText("Clases:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel3.setText("Atributos:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel4.setText("Metodos:");

        JCBClases.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        JCBClases.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBClasesItemStateChanged(evt);
            }
        });
        JCBClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBClasesActionPerformed(evt);
            }
        });

        JCBAtributos.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        JCBMetodos.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        JCBPaquetes.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        JCBPaquetes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBPaquetesItemStateChanged(evt);
            }
        });
        JCBPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBPaquetesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCBClases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCBAtributos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCBMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBPaquetes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCBPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBClasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBClasesItemStateChanged
        JCBAtributos.removeAllItems();
        JCBAtributos.addItem("Seleccione una opcion");

        JCBMetodos.removeAllItems();
        JCBMetodos.addItem("Seleccione una opcion");

        int combo = JCBClases.getSelectedIndex();
        if (combo != -1) {
            for (int i = 0; i < p.getListaClase().size(); i++) {
                if (JCBClases.getSelectedItem().equals(p.getListaClase().get(i).getNomClass())) {
                    for (int j = 0; j < p.getListaClase().get(i).getAtributos().size(); j++) {
                        JCBAtributos.addItem(p.getListaClase().get(i).getAtributos().get(j));
                    }
                    for (int j = 0; j < p.getListaClase().get(i).getMetodos().size(); j++) {
                        JCBMetodos.addItem(p.getListaClase().get(i).getMetodos().get(j));
                    }
                }
            }
        }
    }//GEN-LAST:event_JCBClasesItemStateChanged

    private void JCBClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBClasesActionPerformed

    }//GEN-LAST:event_JCBClasesActionPerformed

    private void JCBPaquetesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBPaquetesItemStateChanged
        // TODO add your handling code here:
        JCBClases.removeAllItems();
        JCBClases.addItem("Seleccione una opcion");

        int combo = JCBPaquetes.getSelectedIndex();
        if (combo != -1) {
            for (int i = 0; i < p.getListaClase().size(); i++) {
                if (JCBPaquetes.getSelectedItem().equals(p.getNombre())) {
                    JCBClases.addItem(p.getListaClase().get(i).getNomClass());
                }
            }
        }
    }//GEN-LAST:event_JCBPaquetesItemStateChanged

    private void JCBPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBPaquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBPaquetesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBAtributos;
    private javax.swing.JComboBox<String> JCBClases;
    private javax.swing.JComboBox<String> JCBMetodos;
    private javax.swing.JComboBox<String> JCBPaquetes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
