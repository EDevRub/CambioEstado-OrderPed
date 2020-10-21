package gui;

import com.placeholder.PlaceHolder;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Eduardo Rubio
 */
public class App extends javax.swing.JFrame {

    WSPedidos_Service pws;
    WSPedidos pws_interfaz;
    Date fechaRegistroPed;
    Date fechaPedListo;

    public App() {
        initComponents();
        pws = new WSPedidos_Service();
        pws_interfaz = pws.getWSPedidosPort();

        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fmCambioEstado = new javax.swing.JFrame();
        txt_NumPed = new javax.swing.JTextField();
        btn_Listo = new javax.swing.JButton();
        btn_Entregado = new javax.swing.JButton();
        lbl_CerrarSesion = new javax.swing.JLabel();
        lbl_Imagen = new javax.swing.JLabel();
        lbl_Titulo = new javax.swing.JLabel();
        txt_RutIngresar = new javax.swing.JTextField();
        btn_Ingresar = new javax.swing.JButton();
        lbl_Salir = new javax.swing.JLabel();
        lbl_imgFondo = new javax.swing.JLabel();

        fmCambioEstado.setUndecorated(true);
        fmCambioEstado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_NumPed.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        txt_NumPed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NumPed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_NumPedMouseReleased(evt);
            }
        });
        fmCambioEstado.getContentPane().add(txt_NumPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 120));

        btn_Listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_Tick_Mark_1398911.png"))); // NOI18N
        btn_Listo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListoActionPerformed(evt);
            }
        });
        fmCambioEstado.getContentPane().add(btn_Listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 380));

        btn_Entregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_10_Delivery_1871427 (1).png"))); // NOI18N
        btn_Entregado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Entregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntregadoActionPerformed(evt);
            }
        });
        fmCambioEstado.getContentPane().add(btn_Entregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 400, 380));

        lbl_CerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_17_330399.png"))); // NOI18N
        lbl_CerrarSesion.setText("Cerrar Sesion");
        lbl_CerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_CerrarSesionMouseReleased(evt);
            }
        });
        fmCambioEstado.getContentPane().add(lbl_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 80));

        lbl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoPedidos.jpg"))); // NOI18N
        fmCambioEstado.getContentPane().add(lbl_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 670));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Titulo.setText("Inicio Sesion");
        getContentPane().add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        txt_RutIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_RutIngresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_RutIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_RutIngresarKeyReleased(evt);
            }
        });
        getContentPane().add(txt_RutIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 40));

        btn_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_Rounded-31_2024644.png"))); // NOI18N
        btn_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 80, 70));

        lbl_Salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Salir.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_17_330399.png"))); // NOI18N
        lbl_Salir.setText("Salir");
        lbl_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_SalirMouseReleased(evt);
            }
        });
        getContentPane().add(lbl_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 110, 60));

        lbl_imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu-blanco-restaurante-comida-rapida_7939-1187.jpg"))); // NOI18N
        getContentPane().add(lbl_imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1050, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_SalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_lbl_SalirMouseReleased

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        String rut;
        rut = txt_RutIngresar.getText();
        boolean existe = pws_interfaz.ingresar(rut);
        int cargo = pws_interfaz.idCargoPersona(rut);

        if (existe == true && cargo == 1) {
            this.setVisible(false);
            fmCambioEstado.setVisible(true);
        } else if (existe == true && cargo == 2) {
            this.setVisible(false);
            fmCambioEstado.setVisible(true);
        } else {
            mensajeError("Usuario no identificado");
        }

        txt_RutIngresar.setText(null);
        txt_RutIngresar.requestFocus();
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void lbl_CerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarSesionMouseReleased
        fmCambioEstado.setVisible(false);
        txt_NumPed.setText(null);
        this.setVisible(true);
    }//GEN-LAST:event_lbl_CerrarSesionMouseReleased

    private void txt_NumPedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_NumPedMouseReleased
        txt_NumPed.setText("");
    }//GEN-LAST:event_txt_NumPedMouseReleased

    private void btn_ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListoActionPerformed
        try {
            int numPed;
            String rutCliente, nomCliente, estadoPedido;
            numPed = Integer.valueOf(txt_NumPed.getText());

            rutCliente = pws_interfaz.rutClienteID(numPed);
            nomCliente = pws_interfaz.nomClienteID(numPed);
            estadoPedido = pws_interfaz.getEstadoPedidoCliente(rutCliente);
            if (estadoPedido.equals("")) {
                mensajeError("Numero de pedido incorrecto");
            } else if (estadoPedido.equalsIgnoreCase("Listo") || estadoPedido.equalsIgnoreCase("Entregado")) {
                mensajeError("Pedido se encuentra: " + estadoPedido);
            } else {
                pws_interfaz.cambiarEstadoPedidoAListo(numPed);
                mensajeCorrecto("Pedido Listo Exitosamente");

                String fechaRegistroPed1 = pws_interfaz.getHoraRegistro(numPed);
                System.out.println(fechaRegistroPed1);
                fechaRegistroPed = ParseFecha(fechaRegistroPed1);
                System.out.println(fechaRegistroPed);
                long tiempoInicial = fechaRegistroPed.getTime();
                System.out.println(tiempoInicial);
                fechaPedListo = new Date();
                System.out.println(fechaPedListo);
                long tiempoFinal = fechaPedListo.getTime();
                System.out.println(tiempoFinal);
                long resta = tiempoFinal - tiempoInicial;
                long restaHor = ((resta / (1000 * 60 * 60)) % 24);
                long restaMin = resta / (1000 * 60);
                long restaMin2 = restaMin % 60;
                long restaSeg = resta / (1000);
                long restaSeg2 = restaSeg % 60;
                String hora = (restaHor <= 9 ? "0" + restaHor : Long.toString(restaHor));
                String minuto = (restaMin2 <= 9 ? "0" + restaMin2 : Long.toString(restaMin2));
                String segundos = (restaSeg2 <= 9 ? "0" + restaSeg2 : Long.toString(restaSeg2));
                String tiempoEspera = hora + ":" + minuto + ":" + segundos;
                System.out.println(tiempoEspera);

                pws_interfaz.registrarHistorialPedidos(numPed, rutCliente, nomCliente, Integer.parseInt(hora), Integer.parseInt(minuto), Integer.parseInt(segundos));

            }
            txt_NumPed.setText("");
            txt_NumPed.requestFocus();
        } catch (Exception e) {
            mensajeError("Numero de pedido incorrecto");
            txt_NumPed.setText("");
            txt_NumPed.requestFocus();
        }
    }//GEN-LAST:event_btn_ListoActionPerformed

    private void btn_EntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntregadoActionPerformed
        try {
            int numPed;
            String estadoPedido, rutCliente;
            numPed = Integer.valueOf(txt_NumPed.getText());
            rutCliente = pws_interfaz.rutClienteID(numPed);
            estadoPedido = pws_interfaz.getEstadoPedidoCliente(rutCliente);
            if (estadoPedido.equals("")) {
                mensajeError("Numero de pedido incorrecto");
            } else if (estadoPedido.equalsIgnoreCase("Entregado")) {
                mensajeError("Pedido se encuentra: " + estadoPedido);
            } else {
                pws_interfaz.actualizarPedidoAEntregado(numPed);
                mensajeCorrecto("Pedido Entregado Exitosamente");
            }
            txt_NumPed.setText("");
            txt_NumPed.requestFocus();
        } catch (Exception e) {
            mensajeError("Numero de pedido incorrecto");
            txt_NumPed.setText("");
            txt_NumPed.requestFocus();
        }
    }//GEN-LAST:event_btn_EntregadoActionPerformed

    private void txt_RutIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RutIngresarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String rut;
            rut = txt_RutIngresar.getText();
            boolean existe = pws_interfaz.ingresar(rut);
            int cargo = pws_interfaz.idCargoPersona(rut);

            if (existe == true && cargo == 1) {
                this.setVisible(false);
                fmCambioEstado.setVisible(true);
            } else if (existe == true && cargo == 2) {
                this.setVisible(false);
                fmCambioEstado.setVisible(true);
            } else {
                mensajeError("Usuario no identificado");
            }

            txt_RutIngresar.setText(null);
            txt_RutIngresar.requestFocus();
        }
    }//GEN-LAST:event_txt_RutIngresarKeyReleased

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entregado;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Listo;
    private javax.swing.JFrame fmCambioEstado;
    private javax.swing.JLabel lbl_CerrarSesion;
    private javax.swing.JLabel lbl_Imagen;
    private javax.swing.JLabel lbl_Salir;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_imgFondo;
    private javax.swing.JTextField txt_NumPed;
    private javax.swing.JTextField txt_RutIngresar;
    // End of variables declaration//GEN-END:variables

    public void init() {
        this.setBounds(0, 0, 623, 409);
        this.setLocationRelativeTo(null);

        fmCambioEstado.setBounds(0, 0, 856, 617);
        fmCambioEstado.setLocationRelativeTo(null);

        botones_transparentes();

        lbl_Titulo.requestFocus();

        PlaceHolder holder = new PlaceHolder(txt_RutIngresar, "Rut Ej:12345678-9");

    }

    public Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public void botones_transparentes() {
        btn_Listo.setOpaque(false);
        btn_Listo.setContentAreaFilled(false);

        btn_Entregado.setOpaque(false);
        btn_Entregado.setContentAreaFilled(false);

        btn_Ingresar.setOpaque(false);
        btn_Ingresar.setContentAreaFilled(false);
    }

    public void mensajeError(String mensaje) {
        Icon error = new ImageIcon(getClass().getResource("../imagenes/iconoError.png"));
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE, error);
    }

    public void mensajeCorrecto(String mensaje) {
        Icon correcto = new ImageIcon(getClass().getResource("../imagenes/iconoCorrecto.png"));
        JOptionPane.showMessageDialog(this, mensaje, "Exito", JOptionPane.PLAIN_MESSAGE, correcto);
    }
}
