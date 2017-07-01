/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Controladores.VendedorController;
import java.awt.Component;
import javax.swing.JOptionPane;
import modelobd.Vendedor;
import modelogui.ModeloTablaVendedor;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class PanelVistaVendedor extends javax.swing.JPanel {

    /**
     * Creates new form PanelVistaVendedor
     */
     JOptionPane op;
    private Vendedor cl;
    public PanelVistaVendedor() {
        initComponents();
        jTable1.setModel(new ModeloTablaVendedor(ModeloTablaVendedor.VISTA));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDatoVendedor = new javax.swing.JTextField();
        rbCodigo = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        rbRuc = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Buscar Cliente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 1, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtDatoVendedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDatoVendedor.setPreferredSize(new java.awt.Dimension(250, 21));
        txtDatoVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDatoVendedorKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 1, 0);
        jPanel1.add(txtDatoVendedor, gridBagConstraints);

        rbCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbCodigo.setSelected(true);
        rbCodigo.setText("Por Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 1, 0);
        jPanel1.add(rbCodigo, gridBagConstraints);

        rbNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbNombre.setText("Por Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 1, 0);
        jPanel1.add(rbNombre, gridBagConstraints);

        rbRuc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbRuc.setText("Por RUC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 1, 0);
        jPanel1.add(rbRuc, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jButton1, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatoVendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatoVendedorKeyPressed
        String condicion = VendedorController.vendedroTmp.SELECT_POR_CODIGO;
        String texto = "'"+txtDatoVendedor.getText()+"%'";
        if(rbCodigo.isSelected())
        {
            condicion += texto;
        }else if(rbNombre.isSelected())
        {
            condicion = VendedorController.vendedroTmp.SELECT_POR_NOMBRE+texto;
        }else if(rbRuc.isSelected())
        {
            condicion = VendedorController.vendedroTmp.SELECT_POR_RUC+texto;
        }
        jTable1.setModel(new ModeloTablaVendedor(ModeloTablaVendedor.VISTA,condicion));
    }//GEN-LAST:event_txtDatoVendedorKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getOptionPane();
        op.setValue(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount() == 2)
        {
            if(jTable1.getSelectedRow() != -1)
            {
                ModeloTablaVendedor mtc = (ModeloTablaVendedor)jTable1.getModel();
                VendedorController.setVendedor(mtc.getVendedor(jTable1.getSelectedRow()));
                cl = mtc.getVendedor(jTable1.getSelectedRow());
                getOptionPane();
                op.setValue(0);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public Vendedor getCl() {
        return cl;
    }

    
     private void getOptionPane()
    {
        if(op != null)
        {
            return;
        }
        Component pdr =this.getParent(); 
        while(pdr.getParent() != null)
        {
            if(pdr instanceof JOptionPane)
            {
                op = (JOptionPane)pdr;
                break;
            }            
            pdr = pdr.getParent();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JRadioButton rbRuc;
    private javax.swing.JTextField txtDatoVendedor;
    // End of variables declaration//GEN-END:variables
}
