/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelos.Predio;
import modelos.*;


public class Ventana_definir_cargas_uniforme extends javax.swing.JDialog {

    int kilosXcarga=30000;
    float rangoBloque;
    
    int capDescarga[];
    public ArrayList<Date> horas = new ArrayList();
    ArrayList<Predio> entradaGrasps = new ArrayList();
    ArrayList<PredioSeleccionado> listaSelec = new ArrayList();
    
    public Ventana_definir_cargas_uniforme(java.awt.Frame parent, boolean modal ,ArrayList<Predio> entradaGrasp,ArrayList<PredioSeleccionado> listaS,int[] capDes,ArrayList<Date> hr) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        entradaGrasps.clear();
        listaSelec.clear();
        horas.clear();
        
        
        capDescarga= new int[capDes.length];
        rangoBloque=  1440/capDes.length;
        
        for(int i=0;i<entradaGrasp.size();i++){
            entradaGrasps.add(entradaGrasp.get(i));
        }
        
        for(int i=0;i<listaS.size();i++){ // se pasan datos del arraylist al arraylist global
            listaSelec.add(listaS.get(i));
        }
        
        for(int i=0;i<hr.size();i++){
            horas.add(hr.get(i));
        }
        
        panelTitulo.setBackground(Color.WHITE);
        panel.setBackground(Color.GRAY);
        jkilosPlanta.setHorizontalAlignment(JTextField.CENTER);
        
        jcapacidadDescarga.setText("0");
        jcapacidadDescarga.setHorizontalAlignment(jcapacidadDescarga.CENTER);
        jcapacidadDescarga.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jkilosPlanta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcapacidadDescarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 612, 110, 40));

        jkilosPlanta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jkilosPlantaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jkilosPlantaKeyTyped(evt);
            }
        });

        jLabel2.setText("Capacidad de la planta:");

        jLabel3.setText("(kg/ hr)");

        jLabel4.setText("Capacidad por bloque:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jkilosPlanta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcapacidadDescarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkilosPlanta)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcapacidadDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 350, 280));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 140, 40));

        panelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Ingresar capacidad de la planta");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 350, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo-tomates.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        if(jkilosPlanta.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Ingresar capacidad de proceso de la planta", " Mensaje", JOptionPane.WARNING_MESSAGE);
        }else{
            
            if(jcapacidadDescarga.getText().equals("0")){
                JOptionPane.showMessageDialog(null, "Ingrese otro valor para la capacidad de proceso de la planta.\nEl valor de cada bloque seria igual a 0", " Mensaje", JOptionPane.WARNING_MESSAGE);
            }else{
                int capDes= Integer.parseInt(jcapacidadDescarga.getText());
                for(int i=0;i<capDescarga.length;i++){
                    capDescarga[i]=capDes;
                }
            
                ventana_ejecucion_grasp dialog = new ventana_ejecucion_grasp(new javax.swing.JFrame(), true,entradaGrasps,listaSelec,capDescarga,horas);// se llama ventana para ejecutar algoritmo
                dialog.setVisible(true);
            
                dispose();
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jkilosPlantaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jkilosPlantaKeyReleased
        if(jkilosPlanta.getText().equals("")!=true){
            int kilosPlanta= Integer.parseInt(jkilosPlanta.getText());
            float div = kilosPlanta/kilosXcarga;
            float variable = div*rangoBloque/60;
            int capDesc=(int) Math.ceil((float)variable);
            jcapacidadDescarga.setText(Integer.toString(capDesc));
        }
    }//GEN-LAST:event_jkilosPlantaKeyReleased

    private void jkilosPlantaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jkilosPlantaKeyTyped
        char car= evt.getKeyChar();
        if((car<'0' || car>'9') && (car!=',' || car!='.' )) evt.consume();
    }//GEN-LAST:event_jkilosPlantaKeyTyped
 
    /*public static String calcularRangoHora(float hraMin){
        int hra, min, seg;
        String horafinal;
        
        hra = (int) (hraMin/60);
        min = (int) (hraMin%60);
        seg = (int) ((hraMin%60)*60)%60;
        
        if (hra>23) {
            hra=hra-24;
        }
        
        horafinal=hra+":";
        
        if (min<10) {
            if(seg<10){
                horafinal+="0"+min+":0"+seg;
            }
            else{
                horafinal+="0"+min+":"+seg;
            }
        }
        else if(seg<10){
            horafinal+=min+":0"+seg;
        }
        else{
            horafinal+=min+":"+seg;
        }
        
        return horafinal;
    }*/
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jcapacidadDescarga;
    private javax.swing.JTextField jkilosPlanta;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}