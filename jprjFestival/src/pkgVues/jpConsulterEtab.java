/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVues;

import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Transaction;
import pkgEntite.Etablissement;
import pkgFestival.jfrMenu;

/**
 *
 * @author etudsio
 */
public class jpConsulterEtab extends javax.swing.JPanel {
    /**
     * Creates new form jpConsulterEtab
     */
    public jpConsulterEtab() {
        initComponents();
        chargerTable();
    }

    public void chargerTable() {
        //On charge la liste des établissements dans un tableau
        int nbligne;
        int i;
        nbligne = TabEtab.getRowCount();
        if(nbligne > 0)
        {
            for(i=0; i < nbligne; i++){
                ((DefaultTableModel)TabEtab.getModel()).removeRow(0);
            }
            String sReq = "From Etablissement";

            Query q = jfrMenu.getSession().createQuery(sReq);
            Iterator etab = q.iterate();

            while(etab.hasNext())
            {
                Etablissement unEtablissement = (Etablissement) etab.next();
                ((DefaultTableModel) TabEtab.getModel()).addRow(new Object[] {unEtablissement.getEtaId(), unEtablissement.getEtaNom()});
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_type = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabEtab = new javax.swing.JTable();
        jlID = new javax.swing.JLabel();
        txtID = new java.awt.TextField();
        txtNom = new java.awt.TextField();
        txtAdresse = new java.awt.TextField();
        jlNom = new javax.swing.JLabel();
        jlAdresse = new javax.swing.JLabel();
        jlCP = new javax.swing.JLabel();
        jlVille = new javax.swing.JLabel();
        jlTel = new javax.swing.JLabel();
        jlMail = new javax.swing.JLabel();
        jlType = new javax.swing.JLabel();
        txtCp = new java.awt.TextField();
        txtVille = new java.awt.TextField();
        txtTel = new java.awt.TextField();
        txtMail = new java.awt.TextField();
        btnType = new javax.swing.JRadioButton();
        btnType2 = new javax.swing.JRadioButton();
        jlResp = new javax.swing.JLabel();
        jlCiviliteResp = new javax.swing.JLabel();
        jlNomResp = new javax.swing.JLabel();
        txtNomResp = new java.awt.TextField();
        jlPrenomResp = new javax.swing.JLabel();
        txtPrenomResp = new java.awt.TextField();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        txtCivilResp = new java.awt.TextField();

        TabEtab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Code", "Etablissement"
            }
        ));
        TabEtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabEtabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabEtab);

        jlID.setText("ID :");

        jlNom.setText("Nom :");

        jlAdresse.setText("Adresse :");

        jlCP.setText("Code Postal :");

        jlVille.setText("Ville :");

        jlTel.setText("Téléphone :");

        jlMail.setText("Mail :");

        jlType.setText("Type :");

        grp_type.add(btnType);
        btnType.setText("Etablissement Scolaire");
        btnType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTypeActionPerformed(evt);
            }
        });

        grp_type.add(btnType2);
        btnType2.setText("Autre");

        jlResp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlResp.setText("Responsable");

        jlCiviliteResp.setText("Civilité :");

        jlNomResp.setText("Nom :");

        jlPrenomResp.setText("Prénom :");

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAdresse)
                                    .addComponent(jlNom)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlCP)
                                            .addComponent(jlVille)
                                            .addComponent(jlTel)
                                            .addComponent(jlMail)
                                            .addComponent(jlType)
                                            .addComponent(jlResp))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(jlNomResp)
                                                .addGap(2, 2, 2)
                                                .addComponent(txtNomResp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jlPrenomResp)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtVille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnType)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnType2))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(315, 315, 315))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlCiviliteResp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCivilResp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlID)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btnModifier)
                        .addGap(49, 49, 49)
                        .addComponent(btnSupprimer)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAdresse))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jlCP)
                        .addGap(12, 12, 12)
                        .addComponent(jlVille)
                        .addGap(12, 12, 12)
                        .addComponent(jlTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlType))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnType)
                            .addComponent(btnType2))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlResp)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlCiviliteResp)
                                .addComponent(jlNomResp))
                            .addComponent(txtCivilResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlPrenomResp)
                        .addComponent(txtNomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TabEtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabEtabMouseClicked
        // TODO add your handling code here:  
        String sQuery;
        
        int Id = TabEtab.getSelectedRow();
        //System.out.println(Id);
        Object sId = TabEtab.getValueAt(Id, 0);
        String EtabId = (String) sId;
        if (EtabId != null)
        {
            sQuery = "From Etablissement Where ETA_ID = :etabId";
            jfrMenu.getSession().beginTransaction();
            Query q = jfrMenu.getSession().createQuery(sQuery);
            
            q.setString("etabId", EtabId);
            
            Etablissement unEtablissement = (Etablissement) q.uniqueResult();
            
            String id = (String) unEtablissement.getEtaId();
            System.out.println(id);
            String nom = (String) unEtablissement.getEtaNom();
            System.out.println(nom);
            String rue = (String) unEtablissement.getEtaRue();
            System.out.println(rue);
            String cp = (String) unEtablissement.getEtaCp();
            System.out.println(cp);
            String ville = (String) unEtablissement.getEtaVille();
            System.out.println(ville);
            String tel = (String) unEtablissement.getEtaTel();
            System.out.println(tel);
            String mail = (String) unEtablissement.getEtaMail();
            System.out.println(mail);
            String civilResp = (String) unEtablissement.getEtaCivilresp();
            System.out.println(civilResp);
            String nomResp = (String) unEtablissement.getEtaNomresp();
            System.out.println(nomResp);
            String prenomResp = (String) unEtablissement.getEtaPrenomresp();
            System.out.println(prenomResp);
                
            txtID.setText(id);
            txtNom.setText(nom);
            txtAdresse.setText(rue);
            txtCp.setText(cp);
            txtVille.setText(ville);
            txtTel.setText(tel);
            txtMail.setText(mail);
            txtCivilResp.setText(civilResp);
            txtNomResp.setText(nomResp);
            txtPrenomResp.setText(prenomResp);
        }
    }//GEN-LAST:event_TabEtabMouseClicked

    private void btnTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTypeActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        String id = (String) txtID.getText();
        String nom = (String) txtNom.getText();
        String rue = (String) txtAdresse.getText();
        String cp = (String) txtCp.getText();
        String ville = (String) txtVille.getText();
        String tel = (String) txtTel.getText();
        String mail = (String) txtMail.getText();
        String civilResp = (String) txtCivilResp.getText();
        String nomResp = (String) txtNomResp.getText();
        String prenomResp = (String) txtPrenomResp.getText();
        
        String sReq = "From Etablissement Where ETA_ID =?";
        Query q = jfrMenu.getSession().createQuery(sReq);
        q.setParameter(0, id);
        Etablissement unEtablissement = (Etablissement) q.uniqueResult();
        unEtablissement.setEtaNom(nom);
        unEtablissement.setEtaRue(rue);
        unEtablissement.setEtaCp(cp);
        unEtablissement.setEtaVille(ville);
        unEtablissement.setEtaTel(tel);
        unEtablissement.setEtaMail(mail);
//        unEtablissement.setEtaType(type);
        unEtablissement.setEtaCivilresp(civilResp);
        unEtablissement.setEtaNomresp(nomResp);
        unEtablissement.setEtaPrenomresp(prenomResp);
        
        Transaction tx = jfrMenu.getSession().beginTransaction();
        tx.commit();
        jfrMenu.getSession().update(unEtablissement);
        
        chargerTable();
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
        String id = (String) txtID.getText();
        String sReq = "From Etablissement Where ETA_ID =?";
        
        Query q = jfrMenu.getSession().createQuery(sReq);
        q.setParameter(0, id);
        
        Etablissement unEtablissement = (Etablissement) q.uniqueResult();
        
        Transaction tx = jfrMenu.getSession().beginTransaction();

        jfrMenu.getSession().delete(unEtablissement);

        chargerTable();
        
        txtID.setText("");
        txtNom.setText("");
        txtAdresse.setText("");
        txtCp.setText("");
        txtVille.setText("");
        txtTel.setText("");
        txtMail.setText("");
        txtCivilResp.setText("");
        txtNomResp.setText("");
        txtPrenomResp.setText("");
        
        tx.commit();
    }//GEN-LAST:event_btnSupprimerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabEtab;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JRadioButton btnType;
    private javax.swing.JRadioButton btnType2;
    private javax.swing.ButtonGroup grp_type;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAdresse;
    private javax.swing.JLabel jlCP;
    private javax.swing.JLabel jlCiviliteResp;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlMail;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlNomResp;
    private javax.swing.JLabel jlPrenomResp;
    private javax.swing.JLabel jlResp;
    private javax.swing.JLabel jlTel;
    private javax.swing.JLabel jlType;
    private javax.swing.JLabel jlVille;
    private java.awt.TextField txtAdresse;
    private java.awt.TextField txtCivilResp;
    private java.awt.TextField txtCp;
    private java.awt.TextField txtID;
    private java.awt.TextField txtMail;
    private java.awt.TextField txtNom;
    private java.awt.TextField txtNomResp;
    private java.awt.TextField txtPrenomResp;
    private java.awt.TextField txtTel;
    private java.awt.TextField txtVille;
    // End of variables declaration//GEN-END:variables
}
