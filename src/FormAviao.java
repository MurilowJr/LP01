import javax.swing.JOptionPane;

public class FormAviao extends javax.swing.JFrame {

    public FormAviao() {
        initComponents();
    }

                        
    private void initComponents() {

        mainAviao = new javax.swing.JLabel();
        modeloAviao = new javax.swing.JLabel();
        txtModeloAviao = new javax.swing.JTextField();
        corAviao = new javax.swing.JLabel();
        txtCorAviao = new javax.swing.JTextField();
        motorAviao = new javax.swing.JLabel();
        materialAviao = new javax.swing.JLabel();
        velocidadeAviao = new javax.swing.JLabel();
        txtMaterial = new javax.swing.JTextField();
        txtVelocidade = new javax.swing.JFormattedTextField();
        txtMotor = new javax.swing.JFormattedTextField();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainAviao.setFont(new java.awt.Font("Blockletter", 0, 24)); // NOI18N
        mainAviao.setText("Avião");

        modeloAviao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modeloAviao.setText("Modelo:");

        txtModeloAviao.setText("Insira o modelo do Avião");

        corAviao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        corAviao.setText("Cor:");

        txtCorAviao.setText("Insira a cor");

        motorAviao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        motorAviao.setText("Motor:");

        materialAviao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        materialAviao.setText("Material:");

        velocidadeAviao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        velocidadeAviao.setText("Velocidade:");

        txtMaterial.setText("Insira o material (carbono, fibra de vidro)");
        txtMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialActionPerformed(evt);
            }
        });

        txtVelocidade.setText("Velocidade máxima");

        txtMotor.setText("Aceleração máxima");

        confirmBtn.setText("Confirmar");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainAviao)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(corAviao)
                            .addComponent(modeloAviao)
                            .addComponent(motorAviao)
                            .addComponent(materialAviao)
                            .addComponent(velocidadeAviao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModeloAviao)
                            .addComponent(txtCorAviao, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(txtMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(txtVelocidade)
                            .addComponent(txtMotor))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainAviao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloAviao)
                    .addComponent(txtModeloAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAviao)
                    .addComponent(txtCorAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorAviao)
                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materialAviao)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocidadeAviao)
                    .addComponent(txtVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>                        

    private void txtMaterialActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Aviao c1 = new Aviao();
            c1.setModelo(txtModeloAviao.getText());
            System.out.println(c1.getModelo());
            txtModeloAviao.setText("");

            c1.setCor(txtCorAviao.getText());
            System.out.println(c1.getCor());
            txtCorAviao.setText("");

            c1.setMotor(txtMotor.getText());
            System.out.println(c1.getMotor());
            txtMotor.setText("");
            
            c1.setMaterial(txtMaterial.getText());
            System.out.println(c1.getMaterial());
            txtMaterial.setText("");
            
            c1.setVelocidade(txtVelocidade.getText());
            System.out.println(c1.getVelocidade());
            txtVelocidade.setText("");

            JOptionPane.showMessageDialog(null , c1.salvar());
        
    }                                          

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAviao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel corAviao;
    private javax.swing.JLabel mainAviao;
    private javax.swing.JLabel materialAviao;
    private javax.swing.JLabel modeloAviao;
    private javax.swing.JLabel motorAviao;
    private javax.swing.JTextField txtCorAviao;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtModeloAviao;
    private javax.swing.JFormattedTextField txtMotor;
    private javax.swing.JFormattedTextField txtVelocidade;
    private javax.swing.JLabel velocidadeAviao;
    // End of variables declaration                   
}

