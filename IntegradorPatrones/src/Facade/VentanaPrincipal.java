 
package Facade;

import Iterator.ManejadorValores;
import Singleton.Account;
import Singleton.AtmUK;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    AtmUK atm;
    ArrayList<Account> cuentas;
    
    public VentanaPrincipal() {
        initComponents();
                 
        cargarDatos();
    }

    public void cargarDatos(){
        
        // Crear un único cajero Automático de dólares con 100 billetes de 20, 100 de 10, 
        // 10 monedas de 0.50, 10 de 0.25 y 1000 de 0.05
        atm = new AtmUK();
        ManejadorValores bill_20 = new ManejadorValores(100, 20.0);
        ManejadorValores bill_10 = new ManejadorValores(100, 10.0);    
        ManejadorValores mon_50 = new ManejadorValores(10, 0.5);
        ManejadorValores mon_25 = new ManejadorValores(10, 0.25);
        ManejadorValores mon_5 = new ManejadorValores(1000, 0.05);        
        atm.addManejador(bill_20);
        atm.addManejador(bill_10);        
        atm.addManejador(mon_50);
        atm.addManejador(mon_25);
        atm.addManejador(mon_5);
        
        // Crear 10 cuentas nuevas en dólares locale.US con un saldo inicial entre 100.00 y 1000.00 USD cada una.
        Account cuenta0 = new Account(0, 1000.00);
        Account cuenta1 = new Account(1, 200.00);
        Account cuenta2 = new Account(2, 1000.00);
        Account cuenta3 = new Account(3, 1000.00);
        Account cuenta4 = new Account(4, 200.00);
        Account cuenta5 = new Account(5, 300.00);
        Account cuenta6 = new Account(6, 300.00);
        Account cuenta7 = new Account(7, 1000.00);
        Account cuenta8 = new Account(8, 400.00);
        Account cuenta9 = new Account(9, 1000.00);
        
        cuentas = new ArrayList<>();
        cuentas.add(cuenta0);
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        cuentas.add(cuenta5);
        cuentas.add(cuenta6);
        cuentas.add(cuenta7);
        cuentas.add(cuenta8);
        cuentas.add(cuenta9);
        
        atm.cargarDinero();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaldos = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnDepositos = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSaldos.setText("Consultar saldo");
        btnSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldosActionPerformed(evt);
            }
        });

        btnRetiro.setText("Retiros");
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnDepositos.setText("Depositos");
        btnDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositosActionPerformed(evt);
            }
        });

        btnBalance.setText("Balance ATM");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        jLabel1.setText("Cuenta ID: ");

        campoId.setMinimumSize(new java.awt.Dimension(200, 50));
        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSaldos, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(btnRetiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepositos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnSaldos)
                .addGap(18, 18, 18)
                .addComponent(btnRetiro)
                .addGap(18, 18, 18)
                .addComponent(btnDepositos)
                .addGap(18, 18, 18)
                .addComponent(btnBalance)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldosActionPerformed
        try{
            if (!this.campoId.getText().equals("") ) {
                for (Account cuenta: cuentas) {
                    if (cuenta.getId() == Integer.parseInt( this.campoId.getText() )) {
                        Saldos saldosVent = new Saldos();
                        saldosVent.mostrarSaldo(cuenta);
                        saldosVent.setVisible(true);
                        break;
                    }                    
                }
            } 
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese un id de cuenta.");                
        }        
    }//GEN-LAST:event_btnSaldosActionPerformed

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdActionPerformed

    private void btnDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositosActionPerformed
        try{
            if (!this.campoId.getText().equals("")) {
                for (Account cuenta: cuentas) {
                    if (cuenta.getId() == Integer.parseInt( this.campoId.getText() )) {
                        Depositos depositosVent = new Depositos();
                        depositosVent.agregarElementos(atm, cuenta);
                        depositosVent.setVisible(true);
                        break;
                    }               
                } 
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese un id de cuenta.");                
        }             
    }//GEN-LAST:event_btnDepositosActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        try{
            if (!this.campoId.getText().equals("")) {
                for (Account cuenta: cuentas) {
                    if (cuenta.getId() == Integer.parseInt( this.campoId.getText() )) {
                        Retiros depositosVent = new Retiros();
                        depositosVent.agregarElementos(atm, cuenta);
                        depositosVent.setVisible(true);
                        break;
                    }             
                }  
            }
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un id de cuenta.");                
            }          
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        BalanceATM balance = new BalanceATM();
        balance.agregarElementos(atm);
        balance.setVisible(true);
    }//GEN-LAST:event_btnBalanceActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnDepositos;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnSaldos;
    private javax.swing.JTextField campoId;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
