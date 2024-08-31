/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem;

import javax.swing.JOptionPane;

/**
 *
 * @author BIHAN
 */
public class Submarine extends javax.swing.JFrame implements Observable {

    /**
     * Creates new form Helicopter
     */
    private Observer observer;
    public Submarine(Observer observer) {
        this.observer = observer;
        initComponents();
        setVisible(true);
        setTitle("Submarine");
        
         btnShoot.setEnabled(false);
         btnMissileOperation.setEnabled(false);
         btnTomahawkMissile.setEnabled(false);
         btnTridentMissile.setEnabled(false);
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
        oxygenSlider = new javax.swing.JSlider();
        energySlider = new javax.swing.JSlider();
        txt = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        togglePosition = new javax.swing.JToggleButton();
        btnShoot = new javax.swing.JButton();
        lblPosition = new javax.swing.JLabel();
        btnMissileOperation = new javax.swing.JButton();
        btnTomahawkMissile = new javax.swing.JButton();
        lblSoldierCount = new javax.swing.JLabel();
        btnTridentMissile = new javax.swing.JButton();
        lblAmmoCount = new javax.swing.JLabel();
        spinnerSoldier = new javax.swing.JSpinner();
        spinnerAmmo = new javax.swing.JSpinner();
        lblAddAreaCleared = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        oxygenSlider.setBackground(new java.awt.Color(204, 204, 255));
        oxygenSlider.setMajorTickSpacing(20);
        oxygenSlider.setMinorTickSpacing(10);
        oxygenSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        oxygenSlider.setPaintLabels(true);
        oxygenSlider.setPaintTicks(true);
        oxygenSlider.setOpaque(true);
        oxygenSlider.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                oxygenSliderAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        energySlider.setBackground(new java.awt.Color(204, 204, 255));
        energySlider.setMajorTickSpacing(20);
        energySlider.setMinorTickSpacing(10);
        energySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        energySlider.setPaintLabels(true);
        energySlider.setPaintTicks(true);
        energySlider.setOpaque(true);
        energySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                energySliderStateChanged(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(0, 0, 255));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        togglePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePositionActionPerformed(evt);
            }
        });

        btnShoot.setBackground(new java.awt.Color(0, 0, 255));
        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        lblPosition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(255, 255, 255));
        lblPosition.setText("Position");

        btnMissileOperation.setBackground(new java.awt.Color(0, 0, 255));
        btnMissileOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMissileOperation.setForeground(new java.awt.Color(255, 255, 255));
        btnMissileOperation.setText("Missile Operation");
        btnMissileOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileOperationActionPerformed(evt);
            }
        });

        btnTomahawkMissile.setBackground(new java.awt.Color(0, 0, 255));
        btnTomahawkMissile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomahawkMissile.setForeground(new java.awt.Color(255, 255, 255));
        btnTomahawkMissile.setText("Tomahawk Missile");
        btnTomahawkMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkMissileActionPerformed(evt);
            }
        });

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoldierCount.setForeground(new java.awt.Color(255, 255, 255));
        lblSoldierCount.setText("Soldier Count");

        btnTridentMissile.setBackground(new java.awt.Color(0, 0, 255));
        btnTridentMissile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTridentMissile.setForeground(new java.awt.Color(255, 255, 255));
        btnTridentMissile.setText("Trident Missile");
        btnTridentMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentMissileActionPerformed(evt);
            }
        });

        lblAmmoCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmmoCount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmmoCount.setText("Ammo Count");

        spinnerSoldier.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSoldierStateChanged(evt);
            }
        });

        spinnerAmmo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerAmmoStateChanged(evt);
            }
        });

        lblAddAreaCleared.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAreaCleared.setForeground(new java.awt.Color(255, 255, 255));
        lblAddAreaCleared.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddAreaCleared.setText("Area Not Cleared");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Energy");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Oxigen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTomahawkMissile))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMissileOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTridentMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(togglePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lblAddAreaCleared, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(energySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oxygenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAddAreaCleared, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShoot)
                                    .addComponent(btnMissileOperation))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTomahawkMissile)
                                    .addComponent(btnTridentMissile)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinnerSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoldierCount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAmmoCount)
                                    .addComponent(spinnerAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(togglePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPosition))))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oxygenSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(energySlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTridentMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentMissileActionPerformed
        
    }//GEN-LAST:event_btnTridentMissileActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
          if (txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"You can not send null message........");
        }else{
            observer.setMessageToMainController(txt.getText(),"Submarine");
        }

    }//GEN-LAST:event_btnSendActionPerformed

    private void spinnerSoldierStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSoldierStateChanged
      this.soldierCount = (int)spinnerSoldier.getValue();
      observer.setSubmarineValues(soldierCount,ammoCount , oxygenCount, massage);
    }//GEN-LAST:event_spinnerSoldierStateChanged

    private void spinnerAmmoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerAmmoStateChanged
         this.ammoCount = (int)spinnerAmmo.getValue();
                observer.setSubmarineValues(soldierCount,ammoCount , oxygenCount, massage);
    }//GEN-LAST:event_spinnerAmmoStateChanged

    private void energySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_energySliderStateChanged
                this.oxygenCount = energySlider.getValue();
                observer.setSubmarineValues(soldierCount,ammoCount , oxygenCount, massage);
    }//GEN-LAST:event_energySliderStateChanged

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
       
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnMissileOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileOperationActionPerformed
        
    }//GEN-LAST:event_btnMissileOperationActionPerformed

    private void btnTomahawkMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkMissileActionPerformed
        
    }//GEN-LAST:event_btnTomahawkMissileActionPerformed

    private void togglePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePositionActionPerformed
       if (togglePosition.isSelected()) {
                this.position = "Helicopter is possition now";
                observer.setPosition(position,"Submarine");
                }else{
                    this.position = "Area Not Clear";
                    observer.setPosition(position,"Submarine");
            }
    }//GEN-LAST:event_togglePositionActionPerformed

    private void oxygenSliderAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_oxygenSliderAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_oxygenSliderAncestorAdded

     @Override
   public void update(String areaClear){
            lblAddAreaCleared.setText(areaClear);
   }
    
    @Override
    public void updateStrengthMassageSubmarine(String strengthMassage,String defenceName,String massage){
        txtArea.setText(txtArea.getText() +  defenceName +" : " + strengthMassage +" "+massage+"\n");
    }
    @Override
    public void updateStrengthMassageAll(String strengthMassage,String defenceName,String massage){
              txtArea.setText(txtArea.getText() +  defenceName +" : " + strengthMassage+" "+massage +"\n");
    }
    @Override
    public  void updateButton(int stengthStr){
        if (togglePosition.isSelected()) {
            if (stengthStr<20) {
                btnShoot.setEnabled(false);
                 btnMissileOperation.setEnabled(false);
                 btnTomahawkMissile.setEnabled(false);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>20  && stengthStr<40) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(false);
                 btnTomahawkMissile.setEnabled(false);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>=40  && stengthStr<60) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(true);
                 btnTomahawkMissile.setEnabled(false);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>60 && stengthStr<80) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(true);
                 btnTomahawkMissile.setEnabled(true);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>=80) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(true);
                 btnTomahawkMissile.setEnabled(true);
                 btnTridentMissile.setEnabled(true);
            }
        }
    }
     @Override
    public void updateStrengthIntSubmarine(int stengthStr){
        if (togglePosition.isSelected()) {
            if (stengthStr<20) {
                btnShoot.setEnabled(false);
                 btnMissileOperation.setEnabled(false);
                 btnTomahawkMissile.setEnabled(false);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>20  && stengthStr<40) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(false);
                 btnTomahawkMissile.setEnabled(false);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>=40  && stengthStr<60) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(true);
                 btnTomahawkMissile.setEnabled(false);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>60 && stengthStr<80) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(true);
                 btnTomahawkMissile.setEnabled(true);
                 btnTridentMissile.setEnabled(false);
            }else if (stengthStr>=80) {
                 btnShoot.setEnabled(true);
                 btnMissileOperation.setEnabled(true);
                 btnTomahawkMissile.setEnabled(true);
                 btnTridentMissile.setEnabled(true);
            }
        }
    }
     
    private String position;
    private int soldierCount;
    private int ammoCount;
    private int oxygenCount;
    
    private String massage;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissileOperation;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnTomahawkMissile;
    private javax.swing.JButton btnTridentMissile;
    private javax.swing.JSlider energySlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddAreaCleared;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider oxygenSlider;
    private javax.swing.JSpinner spinnerAmmo;
    private javax.swing.JSpinner spinnerSoldier;
    private javax.swing.JToggleButton togglePosition;
    private javax.swing.JTextField txt;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateHelicopterMainController(int soldierCount,int ammoCount,int fuelCount,String massage){}
    @Override
    public void updateTankMainController(int soldierCount,int ammoCount,int fuelCount,String massage){}
    @Override
    public void updateSubmarineMainController(int soldierCount,int ammoCount,int fuelCount,String massage){}
    @Override
    public void updateStrengthMassageHelicopter(String strengthMassage,String defenceName,String message){}
    @Override
    public void updateStrengthMassageTank(String strengthMassage,String defenceName,String message){}
    @Override
    public void updateMassageInMain(String strengthMassage,String defenceName){}
     @Override
    public void updateStrengthIntTank(int strengthMassage){}
     @Override
    public void updateStrengthIntHelicopter(int strengthMassage){}
   @Override
    public void updatePosition(String position,String positionName){}
    
}
