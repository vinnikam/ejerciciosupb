/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactosapp.vista;

import contactosapp.Contacto;
import contactosapp.Libreta;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinni
 */
public class Ventana extends javax.swing.JFrame {
    private Libreta lalibreta = new Libreta();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        btGuarda = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("LIBRETA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 70, 30);

        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 80, 14);

        jLabel3.setText("Apellidos: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 60, 14);

        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 80, 14);

        jLabel5.setText("Celular");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 60, 14);

        jLabel6.setText("Empresa");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 180, 70, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 60, 130, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 90, 130, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 120, 130, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 150, 130, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(140, 180, 130, 20);

        btGuarda.setText("Guardar");
        btGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardaActionPerformed(evt);
            }
        });
        getContentPane().add(btGuarda);
        btGuarda.setBounds(270, 220, 110, 23);

        btSalir.setText("Cerrar App");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(273, 270, 110, 23);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardaActionPerformed
        // TODO add your handling code here:
        this.adicionarContacto();
    }//GEN-LAST:event_btGuardaActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        this.salir();
    }//GEN-LAST:event_btSalirActionPerformed

    private void adicionarContacto(){
        Contacto cnuevo = new Contacto("", "", 1);
        if(lalibreta.adicionarContacto(cnuevo)){
            JOptionPane.showMessageDialog(this, "Creo contacto");
        }else{
            JOptionPane.showMessageDialog(this, "No creo contacto");
        }
    }
    private void salir(){
        System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuarda;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
