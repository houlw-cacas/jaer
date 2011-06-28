/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CLCameraControlPanel.java
 *
 * Created on May 26, 2011, 1:08:46 PM
 */
package cl.eye;

import java.awt.BorderLayout;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 * Controls camera and event generation parameters.
 * 
 * @author tobi
 */
public class CLCameraControlPanel extends javax.swing.JPanel {

    private final static Logger log = Logger.getLogger("CLCamera");
    private PSEyeCLModelRetina chip;
    private CLRetinaHardwareInterface hardware;
    private CLRawFramePanel rawCameraPanel;

    /** Creates new form CLCameraControlPanel */
    public CLCameraControlPanel(PSEyeCLModelRetina chip) {
        this.chip = chip;
        hardware = (CLRetinaHardwareInterface) chip.getHardwareInterface();
        initComponents();
    }

    private boolean checkHardware() {
        try {
            hardware = (CLRetinaHardwareInterface) chip.getHardwareInterface();
            return true;
        } catch (Exception e) {
            log.warning(e.toString());
            return false;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        rawInputPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        showRawInputCB = new javax.swing.JCheckBox();
        expSp = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        gainSp = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        aeCB = new javax.swing.JCheckBox();
        agCB = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        thrSp = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        itsCB = new javax.swing.JCheckBox();

        rawInputPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PS Eye control"));

        showRawInputCB.setText("Show raw input");
        showRawInputCB.setToolTipText("Activates raw input panel to show camera output");
        showRawInputCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRawInputCBActionPerformed(evt);
            }
        });

        expSp.setToolTipText("CL eye exposure value (0-511)");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${chip.exposure}"), expSp, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("Exposure");

        gainSp.setToolTipText("CL eye gain (0-79(");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${chip.gain}"), gainSp, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel1.setText("Gain");

        aeCB.setText("Auto exposure");
        aeCB.setToolTipText("Enables automatic exposure control");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${chip.autoExposureEnabled}"), aeCB, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        aeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aeCBActionPerformed(evt);
            }
        });

        agCB.setText("Auto gain");
        agCB.setToolTipText("Enables AGC");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${chip.autoGainEnabled}"), agCB, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        agCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gainSp, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(expSp, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agCB)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(showRawInputCB)
                        .addComponent(aeCB)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gainSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agCB)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(aeCB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showRawInputCB)
                .addGap(35, 35, 35))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Retina model control"));

        thrSp.setToolTipText("Sets threshold for temporal change events in ADC counts");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${chip.eventThreshold}"), thrSp, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel4.setText("Temporal change threshold");

        itsCB.setText("Interpolate time stamp");
        itsCB.setToolTipText("Enables ITS");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${chip.linearInterpolateTimeStamp}"), itsCB, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        itsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itsCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thrSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itsCB))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(thrSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itsCB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rawInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rawInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void itsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itsCBActionPerformed
        if (!checkHardware()) {
            return;
        }
        chip.setLinearInterpolateTimeStamp(itsCB.isSelected());
    }//GEN-LAST:event_itsCBActionPerformed

    private void agCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agCBActionPerformed
        if (!checkHardware()) {
            return;
        }
        if (agCB.isSelected() && hardware != null) {
            gainSp.setValue(hardware.getGain());
        }
}//GEN-LAST:event_agCBActionPerformed

    private void aeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aeCBActionPerformed
        if (!checkHardware()) {
            return;
        }
        if (aeCB.isSelected() && hardware != null) {
            expSp.setValue(hardware.getExposure());
        }
}//GEN-LAST:event_aeCBActionPerformed

    private void showRawInputCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRawInputCBActionPerformed
        if (rawCameraPanel == null) {
            rawCameraPanel = new CLRawFramePanel(chip);
            rawInputPanel.add(rawCameraPanel, BorderLayout.CENTER);
        }
        if (!checkHardware()) {
            return;
        }
        if (showRawInputCB.isSelected()) {
            ((CLRetinaHardwareInterface)chip.getHardwareInterface()).addAEListener(rawCameraPanel);
        } else {
            ((CLRetinaHardwareInterface)chip.getHardwareInterface()).removeAEListener(rawCameraPanel);
        }
}//GEN-LAST:event_showRawInputCBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aeCB;
    private javax.swing.JCheckBox agCB;
    private javax.swing.JSpinner expSp;
    private javax.swing.JSpinner gainSp;
    private javax.swing.JCheckBox itsCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel rawInputPanel;
    private javax.swing.JCheckBox showRawInputCB;
    private javax.swing.JSpinner thrSp;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the chip
     */
    public PSEyeCLModelRetina getChip() {
        return chip;
    }

    /**
     * @param chip the chip to set
     */
    public void setChip(PSEyeCLModelRetina chip) {
        this.chip = chip;
    }
}
