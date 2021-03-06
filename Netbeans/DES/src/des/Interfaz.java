/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author roberto
 */
public class Interfaz extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    CifrarRSA rsa = new CifrarRSA(32);

    public Interfaz() {
        initComponents();
        rsa.generarPrimos();
        rsa.generarClaves();
    }

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception e) {

        }
        return documento;
    }

    public String GuardarArchivo(File Archivo, String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception e) {

        }
        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnabrir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        DES1 = new javax.swing.JButton();
        DES2 = new javax.swing.JButton();
        clave = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcifrado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        abrirdoc2 = new javax.swing.JButton();
        guardardoc2 = new javax.swing.JButton();
        selecdoc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        claveE = new javax.swing.JTextField();
        claveN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11t = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnabrir.setText("Abrir Doc");
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar Doc");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        DES1.setText("Cifrar");
        DES1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DES1ActionPerformed(evt);
            }
        });

        DES2.setText("Descifrar");
        DES2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DES2ActionPerformed(evt);
            }
        });

        txtcifrado.setColumns(20);
        txtcifrado.setRows(5);
        jScrollPane2.setViewportView(txtcifrado);

        jLabel6.setText("Elige el archivo TXT que contiene al mensaje");

        jLabel5.setText("Mensaje:");

        jLabel7.setText("Tamaño de la clave:");

        jLabel8.setText("Texto cifrado");

        abrirdoc2.setText("Abrir Doc");
        abrirdoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirdoc2ActionPerformed(evt);
            }
        });

        guardardoc2.setText("Guardar doc");
        guardardoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardardoc2ActionPerformed(evt);
            }
        });

        selecdoc.setText("Seleccionar archivo");
        selecdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecdocActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cifrado RSA");

        jButton1.setText("Generar Claves");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        claveE.setText("0");
        claveE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveEActionPerformed(evt);
            }
        });

        claveN.setText("0");

        jLabel10.setText("E");

        jLabel11t.setText("N");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(clave, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DES2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(DES1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(claveE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel11t, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(claveN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnabrir)
                                    .addComponent(btnguardar)
                                    .addComponent(abrirdoc2)
                                    .addComponent(guardardoc2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(selecdoc))))
                            .addComponent(jButton1)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnabrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnguardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecdoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DES1)
                    .addComponent(claveE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11t))
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abrirdoc2)
                        .addGap(15, 15, 15)
                        .addComponent(guardardoc2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DES2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    txtarea.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_btnabrirActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String Documento = txtarea.getText();
                String mensaje = GuardarArchivo(archivo, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivi No Compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed


    private void DES1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DES1ActionPerformed
        String mensaje = txtarea.getText();
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(clave.getText());
        if(!mensaje.equals("") && m.matches()) {
            jLabel8.setText("Texto Cifrado");
        String clavee =  rsa.dameE().toString();
        String claven =  rsa.dameN().toString();
        BigInteger[] Cifrado;
        if (mensaje == "" || mensaje == null || mensaje == " " || mensaje.length()==0 ) {
            JOptionPane.showMessageDialog(null, "Suba un documento");
        } else {
            try {
                
                Cifrado = rsa.encriptar(mensaje);
                String Cipher = "";
                for (int i = 0; i < Cifrado.length; i++) {
                    Cipher = (Cipher)+(Cifrado[i].toString())+"\n";
                }
                Cipher.trim();
                txtcifrado.setText(Cipher);
                rsa.generarClavesBoton(SOMEBITS);
                /*char leer[] = txtcifrado.getText().replaceAll("\n", "").toCharArray();
                System.out.println(leer);*/
                txtcifrado.setText(Cipher);
                claveE.setText(clavee);
                claveN.setText(claven);
            } catch (Exception e) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, e);
            }
            
         }
           }
        else{
            if(mensaje.equals("")) {
            txtarea.requestFocusInWindow();
            JOptionPane.showMessageDialog(null, "Porfavor escriba su mensaje y no deje el campo vacio.");
            }
            if(!m.matches()) {
            clave.requestFocusInWindow();
            JOptionPane.showMessageDialog(null, "Porfavor escriba numeros enteros en el tamaño de la clave.");
            }
        }
           
    }//GEN-LAST:event_DES1ActionPerformed
    
    private void DES2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DES2ActionPerformed
        jLabel8.setText("Texto Descifrado");
        String message = txtcifrado.getText();
        String[] lista = message.split("\\r?\\n");
        BigInteger[] mensaje = new BigInteger[lista.length];
        for (int i = 0; i < lista.length; i++) {
            mensaje[i] = new BigInteger(lista[i]);
        }
        /*Aqui va el objeto sacado del serializable de mensaje*/
        String Descifrado = "";
       
        rsa.importarE(new BigInteger(claveE.getText()));//importarE=BigInteger(claveE.getText())
        rsa.importarN(new BigInteger(claveN.getText()));//importarN=BigInteger(claveN.getText());
        //String clavee=rsa.importarE(BigInteger.ONE);
        //String claven=rsa.importarN(BigInteger.ONE);
        if( mensaje == null || mensaje.length==0 ){
            JOptionPane.showMessageDialog(null, "Suba un documento");
        }
        else{
            try {
                
                Descifrado = rsa.desencriptar(mensaje);
                rsa.importarE(BigInteger.ONE/*Aqui va el objeto sacado del serializable de llave publica (e)*/);
                rsa.importarN(BigInteger.ONE/*Aqui va el objeto sacado del serializable de llave publica (n)*/);
            } catch (Exception e) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, e);
            }
           txtcifrado.setText(Descifrado); 
        }
    }//GEN-LAST:event_DES2ActionPerformed

    private void selecdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecdocActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    clave.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_selecdocActionPerformed

    private void abrirdoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirdoc2ActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    txtcifrado.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_abrirdoc2ActionPerformed

    private void guardardoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardardoc2ActionPerformed
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String Documento = txtcifrado.getText();
                String mensaje = GuardarArchivo(archivo, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivi No Compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }
    }//GEN-LAST:event_guardardoc2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            int tamaño=0;
           // String regex = "[0-9]+";
           // Pattern p = Pattern.compile(regex);
           // Matcher m = p.matcher(clave.getText());
            //if (m.matches()) {
                tamaño = Integer.parseInt(clave.getText());
                if (tamaño>999 || tamaño<1) {
                    JOptionPane.showMessageDialog(this, "El tamaño de la clave no puede estar en blanco, ser menor a uno o ser muy grande.");
                    clave.requestFocusInWindow();
                }
                else{
                    rsa.generarClavesBoton(tamaño);
                }
            }
           // else{
           // JOptionPane.showMessageDialog(this, "Introduce un numero entero en el tamaño clave");
            //clave.requestFocusInWindow();
            
            //}
            
            
        //}
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Introduce un numero entero en el tamaño clave");
            clave.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void claveEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveEActionPerformed
    

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DES1;
    private javax.swing.JButton DES2;
    private javax.swing.JButton abrirdoc2;
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField claveE;
    private javax.swing.JTextField claveN;
    private javax.swing.JButton guardardoc2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11t;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton selecdoc;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextArea txtcifrado;
    // End of variables declaration//GEN-END:variables
}
