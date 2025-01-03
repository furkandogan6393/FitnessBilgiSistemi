/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitnessproje;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TozLu
 */
public class AnaSayfa extends javax.swing.JFrame {

    /**
     * Creates new form AnaSayfa
     */
    public AnaSayfa() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        hesapla = new javax.swing.JButton();
        saglıktavsiyelerihandclick = new javax.swing.JLabel();
        proteindegerlerihandclick = new javax.swing.JLabel();
        kilovermekhandclick = new javax.swing.JLabel();
        kasyapmakhandclick = new javax.swing.JLabel();
        anasayfaHandClick = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();
        tavsiye = new javax.swing.JButton();
        kilover = new javax.swing.JButton();
        protein = new javax.swing.JButton();
        anasayfa = new javax.swing.JButton();
        kasyapmak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kilo(kg):");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 80, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Boy(m):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 80, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vücut Kitle Endeksi Puanın");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, 170, 20));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 360, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField6.setOpaque(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 360, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField5.setOpaque(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 360, -1));

        hesapla.setIcon(new javax.swing.ImageIcon("C:\\Users\\TozLu\\Documents\\NetBeansProjects\\fitnessproje\\src\\fitnessproje\\fxprojeresim\\hesapla.png")); // NOI18N
        hesapla.setText("jButton1");
        hesapla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesapla.setOpaque(false);
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });
        jPanel1.add(hesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 350, 50));

        saglıktavsiyelerihandclick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(saglıktavsiyelerihandclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 170));

        proteindegerlerihandclick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(proteindegerlerihandclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 260, 110));

        kilovermekhandclick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(kilovermekhandclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 70, 200, 110));

        kasyapmakhandclick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(kasyapmakhandclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 50, 290, 140));

        anasayfaHandClick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(anasayfaHandClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 140, 130));

        arkaplan.setIcon(new javax.swing.ImageIcon("C:\\Users\\TozLu\\Documents\\NetBeansProjects\\fitnessproje\\src\\fitnessproje\\fxprojeresim\\anasayfa.png")); // NOI18N
        jPanel1.add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        tavsiye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tavsiye.setOpaque(false);
        tavsiye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tavsiyeActionPerformed(evt);
            }
        });
        jPanel1.add(tavsiye, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 340, 150));

        kilover.setText("jButton4");
        kilover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kilover.setOpaque(false);
        kilover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiloverActionPerformed(evt);
            }
        });
        jPanel1.add(kilover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 50, 190, 140));

        protein.setText("jButton2");
        protein.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        protein.setOpaque(false);
        protein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinActionPerformed(evt);
            }
        });
        jPanel1.add(protein, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 250, 100));

        anasayfa.setText("jButton4");
        anasayfa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anasayfa.setOpaque(false);
        anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfaActionPerformed(evt);
            }
        });
        jPanel1.add(anasayfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 120, 110));

        kasyapmak.setText("jButton1");
        kasyapmak.setOpaque(false);
        kasyapmak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kasyapmakActionPerformed(evt);
            }
        });
        jPanel1.add(kasyapmak, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 40, 340, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tavsiyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tavsiyeActionPerformed
        
        tavsiye1 t= new tavsiye1();
        t.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_tavsiyeActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        //BOY
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        //KİLO
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        //KİTLE ENDEKSİ
    }//GEN-LAST:event_jTextField6ActionPerformed

    
    private void kiloverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiloverActionPerformed
        // TODO add your handling code here:
        kilovermek kilover = new kilovermek();
        kilover.setVisible(true);
        dispose();
    }//GEN-LAST:event_kiloverActionPerformed

    private void anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anasayfaActionPerformed

    private void kasyapmakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kasyapmakActionPerformed
        kas kk= new kas();
        kk.setVisible(true);
        dispose();
    }//GEN-LAST:event_kasyapmakActionPerformed

    private void hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaActionPerformed
    float boy;
    float kilo;

    try {
        boy = Float.parseFloat(jTextField4.getText());
        if (boy > 2.50 || boy <= 0) {
            JOptionPane.showMessageDialog(this, "Lütfen metre cinsinden boyunuzu giriniz.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Boy için sayısal bir değer giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        kilo = Float.parseFloat(jTextField5.getText());
        if (kilo <= 0) {
            JOptionPane.showMessageDialog(this, "Lütfen geçerli bir kilo giriniz.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Kilo için sayısal bir değer giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    float vki = kilo / (boy * boy);
    jTextField6.setText("VKİ: " + String.format("%.2f", vki));


    if (vki < 18.5) {
        JOptionPane.showMessageDialog(this, "VKİ: " + String.format("%.2f", vki) + " (Fazla zayıfsınız, beslenme menülerimize yönelebilirsiniz.)", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
    } else if (vki >= 18.5 && vki <= 24.9) {
        JOptionPane.showMessageDialog(this, "VKİ: " + String.format("%.2f", vki) + " (Normal kilodasınız, kas programımız ile güzel bir vücuda sahip olabilirsiniz.)", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
    } else if (vki >= 25 && vki <= 29.9) {
        JOptionPane.showMessageDialog(this, "VKİ: " + String.format("%.2f", vki) + " (Fazla Kilolusunuz, uygun yağsız diyetlerimizi ve doğru spor hareketlerini menüzümden seçebilirsiniz.)", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
    } else if (vki >= 30 && vki <= 39.9) {
        JOptionPane.showMessageDialog(this, "VKİ: " + String.format("%.2f", vki) + " (Obez seviyesindesiniz, lütfen akdeniz diyeti gibi hafif diyetlere geçiş yapınız ve sonrasında su diyetini kullanarak hızlı kilo verme işlemine geçiniz, bu süreçte kas programımızdan destek alınız.)", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "VKİ: " + String.format("%.2f", vki) + " (ALLAH KURTARSIN KARDEŞ, ALLAH KURTARSIN.)", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_hesaplaActionPerformed

    private void proteinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinActionPerformed
        protein p= new protein();
        p.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_proteinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anasayfa;
    private javax.swing.JLabel anasayfaHandClick;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton hesapla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton kasyapmak;
    private javax.swing.JLabel kasyapmakhandclick;
    private javax.swing.JButton kilover;
    private javax.swing.JLabel kilovermekhandclick;
    private javax.swing.JButton protein;
    private javax.swing.JLabel proteindegerlerihandclick;
    private javax.swing.JLabel saglıktavsiyelerihandclick;
    private javax.swing.JButton tavsiye;
    // End of variables declaration//GEN-END:variables
}
