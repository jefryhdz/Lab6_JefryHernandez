
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jd_login = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_logincorreo = new javax.swing.JTextField();
        pf_logincontra = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jd_CrearCuenta = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_mail = new javax.swing.JTextField();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        pf_password = new javax.swing.JPasswordField();
        pf_confirmr = new javax.swing.JPasswordField();
        tf_numero = new javax.swing.JTextField();
        cb_pais = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jd_mensajes = new javax.swing.JDialog();
        cb_buzon = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_mensajes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Login");

        jLabel12.setText("Correo");

        jLabel13.setText("Contraseña");

        jButton4.setText("Ingresar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_loginLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(pf_logincontra))
                            .addGroup(jd_loginLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(43, 43, 43)
                                .addComponent(tf_logincorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton4)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_logincorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pf_logincontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(31, 31, 31))
        );

        jLabel2.setText("Creacion de usuario");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Correo");

        jLabel6.setText("Fecha de nacimiento");

        jLabel7.setText("Contraseña");

        jLabel8.setText("Confirmar Contraseña");

        jLabel9.setText("Pais");

        jLabel10.setText("Numero");

        cb_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honduras", "Estados Unidos", "Mexico", "Canada", "Brasil", "Argentina" }));

        jButton3.setText("Crear");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearCuentaLayout = new javax.swing.GroupLayout(jd_CrearCuenta.getContentPane());
        jd_CrearCuenta.getContentPane().setLayout(jd_CrearCuentaLayout);
        jd_CrearCuentaLayout.setHorizontalGroup(
            jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearCuentaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombre)
                        .addComponent(tf_apellido)
                        .addComponent(tf_mail)
                        .addComponent(dc_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pf_password)
                        .addComponent(pf_confirmr)
                        .addComponent(tf_numero)
                        .addComponent(cb_pais, 0, 118, Short.MAX_VALUE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jd_CrearCuentaLayout.setVerticalGroup(
            jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_CrearCuentaLayout.createSequentialGroup()
                        .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pf_confirmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        cb_buzon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enviados", "Leidos", "No leidos", "Importantes", "Eliminados", "Borrador", "Spam", "Importantes", "No deseados", " ", " " }));
        cb_buzon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_buzonItemStateChanged(evt);
            }
        });

        jt_mensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receptor", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_mensajes);

        javax.swing.GroupLayout jd_mensajesLayout = new javax.swing.GroupLayout(jd_mensajes.getContentPane());
        jd_mensajes.getContentPane().setLayout(jd_mensajesLayout);
        jd_mensajesLayout.setHorizontalGroup(
            jd_mensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mensajesLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(cb_buzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_mensajesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jd_mensajesLayout.setVerticalGroup(
            jd_mensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mensajesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cb_buzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema de registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        try {
            String nombre = tf_nombre.getText();
            String apelllido = tf_apellido.getText();
            String pais = cb_pais.getSelectedItem().toString();
            String correo = tf_mail.getText();
            String numero = tf_numero.getText();
            String contraseña = "";
            Date fecha = dc_fecha.getDate();
            if (!usuarios.contains(correo)) {
                if ((pf_password.getText().equals(pf_confirmr.getText())) && (!pf_password.equals(""))) {
                    contraseña = pf_password.getText();
                    usuarios.add(correo);
                    crearfolder(correo);
                    Usuario p = new Usuario(nombre, apelllido, contraseña, fecha, pais, numero, correo);
                    lista.add(p);
                    tf_nombre.setText("");
                    tf_apellido.setText("");
                    tf_mail.setText("");
                    tf_numero.setText("");
                    pf_confirmr.setText("");
                    pf_password.setText("");
                    dc_fecha.setDate(new Date());
                    jd_CrearCuenta.dispose();

                } else {
                    tf_nombre.setText("");
                    tf_apellido.setText("");
                    tf_mail.setText("");
                    tf_numero.setText("");
                    pf_confirmr.setText("");
                    pf_password.setText("");
                    dc_fecha.setDate(new Date());
                    JOptionPane.showMessageDialog(this, "Cambie su contraseña");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cambie su correo");
                tf_nombre.setText("");
                tf_apellido.setText("");
                tf_mail.setText("");
                tf_numero.setText("");
                pf_confirmr.setText("");
                pf_password.setText("");
                dc_fecha.setDate(new Date());
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(this, "No se pudo crear la cuenta");
        }


    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jd_CrearCuenta.setModal(true);
        jd_CrearCuenta.pack();
        jd_CrearCuenta.setLocationRelativeTo(this);
        jd_CrearCuenta.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);
        jd_login.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String correo = tf_logincorreo.getText();
        String contra = pf_logincontra.getText();
        for (Usuario us : lista) {
            if (us.getCorreo().equals(correo) && us.getContraseña().equals(contra)) {
                JOptionPane.showMessageDialog(this, "Ingreso con exito");
                tf_logincorreo.setText("");
                pf_logincontra.setText("");
                jd_login.dispose();
                user = us;
            }
        }
        JOptionPane.showMessageDialog(this, "Correo o contraseña invalidos");
        tf_logincorreo.setText("");
        pf_logincontra.setText("");


    }//GEN-LAST:event_jButton4MouseClicked

    private void cb_buzonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_buzonItemStateChanged
        if (evt.getStateChange() == 2) {
            DefaultTableModel model = (DefaultTableModel) jt_mensajes.getModel();
            if (cb_buzon.getSelectedItem().equals("")) {
                
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_buzonItemStateChanged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_buzon;
    private javax.swing.JComboBox<String> cb_pais;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_CrearCuenta;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_mensajes;
    private javax.swing.JTable jt_mensajes;
    private javax.swing.JPasswordField pf_confirmr;
    private javax.swing.JPasswordField pf_logincontra;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_logincorreo;
    private javax.swing.JTextField tf_mail;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_numero;
    // End of variables declaration//GEN-END:variables
    ArrayList<String> usuarios = new ArrayList();
    ArrayList<Usuario> lista = new ArrayList();
    Usuario user;

    public void crearfolder(String nombre) throws IOException {
        File carpeta = new File("./usuario/" + nombre);
        carpeta.mkdir();
        FileWriter fw;
        BufferedWriter bw;

        fw = new FileWriter("./usuario/" + nombre + "/leido.txt");
        bw = new BufferedWriter(fw);
        //leido.mkdir();
        fw = new FileWriter("./usuario/" + nombre + "/noleido.txt");
        bw = new BufferedWriter(fw);

        fw = new FileWriter("./usuario/" + nombre + "/spam.txt");
        bw = new BufferedWriter(fw);

        fw = new FileWriter("./usuario/" + nombre + "/eliminado.txt");
        bw = new BufferedWriter(fw);

        fw = new FileWriter("./usuario/" + nombre + "/borrador.txt");
        bw = new BufferedWriter(fw);

        fw = new FileWriter("./usuario/" + nombre + "/importantes.txt");
        bw = new BufferedWriter(fw);

        fw = new FileWriter("./usuario/" + nombre + "/enviado.txt");
        bw = new BufferedWriter(fw);

        fw = new FileWriter("./usuario/" + nombre + "/nodeseado.txt");
        bw = new BufferedWriter(fw);

    }
}
