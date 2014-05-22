/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVues;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pkgEntite.Etablissement;
import pkgEntite.HibernateUtil;
import pkgFestival.jfrMenu;

/**
 *
 * @author etudsio
 */
public class jpAjoutEtab extends javax.swing.JPanel 
{

    private static Session session = HibernateUtil.getSessionFactory().openSession();
    /**
     * Creates new form jpAjoutEtab
     */
    
    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        jpAjoutEtab.session = session;
    }
    
    public jpAjoutEtab() {
        initComponents();
        chargerCivilite();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        grp_type = new javax.swing.ButtonGroup();
        jlTitre = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        txtID = new java.awt.TextField();
        jlNom = new javax.swing.JLabel();
        jlAdresse = new javax.swing.JLabel();
        jlCP = new javax.swing.JLabel();
        jlVille = new javax.swing.JLabel();
        jlTel = new javax.swing.JLabel();
        jlMail = new javax.swing.JLabel();
        jlType = new javax.swing.JLabel();
        txtNom = new java.awt.TextField();
        txtAdresse = new java.awt.TextField();
        txtCP = new java.awt.TextField();
        txtVille = new java.awt.TextField();
        txtTel = new java.awt.TextField();
        txtMail = new java.awt.TextField();
        btnType = new javax.swing.JRadioButton();
        btnType2 = new javax.swing.JRadioButton();
        jlResponsable = new javax.swing.JLabel();
        jlCiviliteResp = new javax.swing.JLabel();
        lstCiviliteResp = new javax.swing.JComboBox();
        jlNomResp = new javax.swing.JLabel();
        jlPrenomResp = new javax.swing.JLabel();
        txtNomResp = new java.awt.TextField();
        txtPrenomResp = new java.awt.TextField();
        btnValider = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jlTitre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTitre.setText("Nouvel Etablissement");

        jlID.setText("ID  :");

        jlNom.setText("Nom :");

        jlAdresse.setText("Adresse :");

        jlCP.setText("Code Postal :");

        jlVille.setText("Ville :");

        jlTel.setText("Téléphone :");

        jlMail.setText("Mail :");

        jlType.setText("Type :");

        grp_type.add(btnType);
        btnType.setText("Etablissement Scolaire");

        grp_type.add(btnType2);
        btnType2.setText("Autre");

        jlResponsable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlResponsable.setText("Responsable");

        jlCiviliteResp.setText("Civilité :");

        lstCiviliteResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstCiviliteRespActionPerformed(evt);
            }
        });

        jlNomResp.setText("Nom :");

        jlPrenomResp.setText("Prénom :");

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        btnAnnuler.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNom)
                                .addGap(46, 46, 46)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAdresse)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlCP, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlVille))
                                    .addComponent(jlTel)
                                    .addComponent(jlMail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnType)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnType2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtVille, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(2, 2, 2))
                                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlType)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCiviliteResp)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(btnValider)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnAnnuler))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lstCiviliteResp, 0, 108, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlNomResp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomResp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlPrenomResp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlResponsable)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlID)
                                .addGap(53, 53, 53)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jlTitre)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlTitre)
                .addGap(45, 45, 45)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVille))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnType)
                    .addComponent(jlType)
                    .addComponent(btnType2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlResponsable)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCiviliteResp)
                            .addComponent(lstCiviliteResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlPrenomResp)
                    .addComponent(txtPrenomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomResp)
                    .addComponent(txtNomResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValider)
                    .addComponent(btnAnnuler))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
        String sCivilite;
        boolean type;
        
        //contrôle de saisie
        if (txtNom.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Nom'", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        if (txtAdresse.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Rue'", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        if (txtCP.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Code Postal'", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        if (txtVille.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Ville'", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        if (txtTel.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Téléphone'", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        if (txtNomResp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Nom' dans la partie Responsable", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        if (txtPrenomResp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Vous devez remplir le champ 'Prénom' dans la partie Responsable", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        
        try{
            //récupération de la valeur du bouton
            if(btnType.isSelected()){
                type = true;
            }
            else{
                type = false;
            }

            //récupération de la valeur de la liste déroulante
            sCivilite = (String) lstCiviliteResp.getSelectedItem();

            //ajout d'un établissement
            Etablissement unNewEtablissement = new Etablissement();
            unNewEtablissement.setEtaId(txtID.getText());
            unNewEtablissement.setEtaNom(txtNom.getText());
            unNewEtablissement.setEtaRue(txtAdresse.getText());
            unNewEtablissement.setEtaCp(txtCP.getText());
            unNewEtablissement.setEtaVille(txtVille.getText());
            unNewEtablissement.setEtaTel(txtTel.getText());
            unNewEtablissement.setEtaMail(txtMail.getText());
            unNewEtablissement.setEtaType(type);
            unNewEtablissement.setEtaCivilresp(sCivilite);
            unNewEtablissement.setEtaNomresp(txtNomResp.getText());
            unNewEtablissement.setEtaPrenomresp(txtPrenomResp.getText());

            //ajout dans la base de données
            Transaction tx = jfrMenu.getSession().beginTransaction();
            jfrMenu.getSession().save(unNewEtablissement);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Ajout bien effectué !", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ajout impossible", "Information", JOptionPane.ERROR_MESSAGE);
        }
        
        //affichage du formulaire après l'ajout
        txtID.setText("");
        txtNom.setText("");
        txtAdresse.setText("");
        txtCP.setText("");
        txtVille.setText("");
        txtTel.setText("");
        txtMail.setText("");
        txtNomResp.setText("");
        txtPrenomResp.setText("");
    }//GEN-LAST:event_btnValiderActionPerformed

    private void lstCiviliteRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstCiviliteRespActionPerformed
        // TODO add your handling code here:
              
    }//GEN-LAST:event_lstCiviliteRespActionPerformed
    private void chargerCivilite()
    {
        lstCiviliteResp.addItem("Monsieur");
        lstCiviliteResp.addItem("Madame");
     } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JRadioButton btnType;
    private javax.swing.JRadioButton btnType2;
    private javax.swing.JButton btnValider;
    private javax.swing.ButtonGroup grp_type;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlAdresse;
    private javax.swing.JLabel jlCP;
    private javax.swing.JLabel jlCiviliteResp;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlMail;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlNomResp;
    private javax.swing.JLabel jlPrenomResp;
    private javax.swing.JLabel jlResponsable;
    private javax.swing.JLabel jlTel;
    private javax.swing.JLabel jlTitre;
    private javax.swing.JLabel jlType;
    private javax.swing.JLabel jlVille;
    private javax.swing.JComboBox lstCiviliteResp;
    private java.awt.TextField txtAdresse;
    private java.awt.TextField txtCP;
    private java.awt.TextField txtID;
    private java.awt.TextField txtMail;
    private java.awt.TextField txtNom;
    private java.awt.TextField txtNomResp;
    private java.awt.TextField txtPrenomResp;
    private java.awt.TextField txtTel;
    private java.awt.TextField txtVille;
    // End of variables declaration//GEN-END:variables
}
