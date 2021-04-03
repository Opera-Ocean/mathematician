package classes;

/**
 *
 * @author HALLELUJAH
 */
public class HCF extends javax.swing.JFrame {
        int num, by2, by3, by5;
        
    public HCF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        line1 = new javax.swing.JLabel();
        line6 = new javax.swing.JLabel();
        line9 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        line10 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        line5 = new javax.swing.JLabel();
        line4 = new javax.swing.JLabel();
        line8 = new javax.swing.JLabel();
        input2 = new javax.swing.JTextField();
        line7 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        get = new javax.swing.JLabel();
        tuo = new javax.swing.JLabel();
        tuo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        line1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line1MouseClicked(evt);
            }
        });

        line6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line6MouseClicked(evt);
            }
        });

        line9.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line9MouseClicked(evt);
            }
        });

        line2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line2MouseClicked(evt);
            }
        });

        line10.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        line3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line3MouseClicked(evt);
            }
        });

        input1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        input1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input1MouseClicked(evt);
            }
        });

        line5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        line4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line4MouseClicked(evt);
            }
        });

        line8.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line8MouseClicked(evt);
            }
        });

        input2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        input2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input2MouseClicked(evt);
            }
        });

        line7.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        line7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        line7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                line7MouseClicked(evt);
            }
        });

        check.setText("check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        final String latexStr = "\u00D7";
        tuo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tuo.setText(latexStr);

        final String latexeStr = "\u00F7";
        tuo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tuo1.setText(latexeStr);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(line5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(line10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(line9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(line6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(line8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(line7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(get, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tuo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tuo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(get, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(line6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(line7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(line4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(line5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(line8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(line9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(line10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(tuo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tuo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void toDivideBy(){
        by2 = num/2;
        by3 = num/3;
        by5 = num/5;
    }
    
    private void input1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input1MouseClicked
        num = Integer.parseInt(input1.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line1.setText(ans);  
        }
                       
        else if (num % 3 == 0){
            
                String ans = Integer.toString(by3);
                line1.setText(ans);
            
        }
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line1.setText(ans);
            
        }
        
        else{
            line1.setText(input1.getText());
        }

    }//GEN-LAST:event_input1MouseClicked

    private void line1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line1MouseClicked
        num = Integer.parseInt(line1.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line2.setText(ans); 
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line2.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String ans = Integer.toString(by3);
                line2.setText(ans);
            
        }

        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line2.setText(ans);
            
        }
        
        else{
            line2.setText(line1.getText());
        }

    }//GEN-LAST:event_line1MouseClicked

    private void line2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line2MouseClicked
        num = Integer.parseInt(line2.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line3.setText(ans);   
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line3.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String ans = Integer.toString(by3);
                line3.setText(ans);
            
        }

        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line3.setText(ans);
            
        }
        
        else{
            line3.setText(line2.getText());
        }

    }//GEN-LAST:event_line2MouseClicked

    private void line4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line4MouseClicked
        num = Integer.parseInt(line4.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line5.setText(ans);   
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line5.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String ans = Integer.toString(by3);
                line5.setText(ans);
            
        }
        
        
        
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line5.setText(ans);
            
        }
        
        else{
            line5.setText(line4.getText());
        }
                          
    }//GEN-LAST:event_line4MouseClicked

    private void line3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line3MouseClicked
        num = Integer.parseInt(line3.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line4.setText(ans);
  
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line4.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String ans = Integer.toString(by3);
                line4.setText(ans);
            
        }
        
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line4.setText(ans);
            
        }
        
        else{
            line4.setText(line3.getText());
        }
                        
    }//GEN-LAST:event_line3MouseClicked

    private void line6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line6MouseClicked
        num = Integer.parseInt(line6.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line7.setText(ans);
  
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line7.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String ans = Integer.toString(by3);
                line7.setText(ans);
        }

        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line7.setText(ans);
            
        }
        
        else{
            line7.setText(line6.getText());
        }
    }//GEN-LAST:event_line6MouseClicked

    private void input2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MouseClicked
        num = Integer.parseInt(input2.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line6.setText(ans);  
        }
        
        else if (num % 3 == 0){
            
                String anss = Integer.toString(by3);
                line6.setText(anss);
            
        }
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line6.setText(ans);
            
        }
        
        else{
            line6.setText(input2.getText());
        }
    }//GEN-LAST:event_input2MouseClicked

    private void line7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line7MouseClicked
        num = Integer.parseInt(line7.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line8.setText(ans);  
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line8.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String anss = Integer.toString(by3);
                line8.setText(anss);
            
        }
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line8.setText(ans);
            
        }
        
        else{
            line8.setText(line7.getText());
        }
    }//GEN-LAST:event_line7MouseClicked

    private void line8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line8MouseClicked
        num = Integer.parseInt(line8.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line9.setText(ans);  
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line9.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String anss = Integer.toString(by3);
                line9.setText(anss);
            
        }
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line9.setText(ans);
            
        }
        
        else{
            line9.setText(line8.getText());
        }
    }//GEN-LAST:event_line8MouseClicked

    private void line9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_line9MouseClicked
        num = Integer.parseInt(line9.getText());
        
        toDivideBy();
        
        if (num % 2 == 0){
            
            String ans = Integer.toString(by2);
            line10.setText(ans);  
        }
        
        else if (num == 1){
            
                String ans = Integer.toString(0);
                line10.setText(ans);
       }
        
        else if (num % 3 == 0){
            
                String anss = Integer.toString(by3);
                line10.setText(anss);
            
        }
        else if (num % 5 == 0){
            
            String ans = String.valueOf(by5);
            line10.setText(ans);
            
        }
        
        else{
            line10.setText(line9.getText());
        }
    }//GEN-LAST:event_line9MouseClicked

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        String cc = "1129";
        String txt2 = String.valueOf(Character.toChars(Integer.parseInt(cc, 21)));
        get.setText(txt2);
        
        System.out.println("\u007D");
    }//GEN-LAST:event_checkActionPerformed

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
            java.util.logging.Logger.getLogger(HCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HCF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JLabel get;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line10;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel line4;
    private javax.swing.JLabel line5;
    private javax.swing.JLabel line6;
    private javax.swing.JLabel line7;
    private javax.swing.JLabel line8;
    private javax.swing.JLabel line9;
    private javax.swing.JLabel tuo;
    private javax.swing.JLabel tuo1;
    // End of variables declaration//GEN-END:variables
}
