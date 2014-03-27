package pkgEntite;
// Generated 27 mars 2014 17:38:41 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Etablissement generated by hbm2java
 */
public class Etablissement  implements java.io.Serializable {


     private String etaId;
     private String etaNom;
     private String etaRue;
     private String etaCp;
     private String etaVille;
     private String etaTel;
     private String etaMail;
     private boolean etaType;
     private String etaCivilresp;
     private String etaNomresp;
     private String etaPrenomresp;
     private Set offres = new HashSet(0);

    public Etablissement() {
    }

	
    public Etablissement(String etaId, String etaNom, String etaRue, String etaCp, String etaVille, String etaTel, boolean etaType, String etaCivilresp, String etaNomresp) {
        this.etaId = etaId;
        this.etaNom = etaNom;
        this.etaRue = etaRue;
        this.etaCp = etaCp;
        this.etaVille = etaVille;
        this.etaTel = etaTel;
        this.etaType = etaType;
        this.etaCivilresp = etaCivilresp;
        this.etaNomresp = etaNomresp;
    }
    public Etablissement(String etaId, String etaNom, String etaRue, String etaCp, String etaVille, String etaTel, String etaMail, boolean etaType, String etaCivilresp, String etaNomresp, String etaPrenomresp, Set offres) {
       this.etaId = etaId;
       this.etaNom = etaNom;
       this.etaRue = etaRue;
       this.etaCp = etaCp;
       this.etaVille = etaVille;
       this.etaTel = etaTel;
       this.etaMail = etaMail;
       this.etaType = etaType;
       this.etaCivilresp = etaCivilresp;
       this.etaNomresp = etaNomresp;
       this.etaPrenomresp = etaPrenomresp;
       this.offres = offres;
    }
   
    public String getEtaId() {
        return this.etaId;
    }
    
    public void setEtaId(String etaId) {
        this.etaId = etaId;
    }
    public String getEtaNom() {
        return this.etaNom;
    }
    
    public void setEtaNom(String etaNom) {
        this.etaNom = etaNom;
    }
    public String getEtaRue() {
        return this.etaRue;
    }
    
    public void setEtaRue(String etaRue) {
        this.etaRue = etaRue;
    }
    public String getEtaCp() {
        return this.etaCp;
    }
    
    public void setEtaCp(String etaCp) {
        this.etaCp = etaCp;
    }
    public String getEtaVille() {
        return this.etaVille;
    }
    
    public void setEtaVille(String etaVille) {
        this.etaVille = etaVille;
    }
    public String getEtaTel() {
        return this.etaTel;
    }
    
    public void setEtaTel(String etaTel) {
        this.etaTel = etaTel;
    }
    public String getEtaMail() {
        return this.etaMail;
    }
    
    public void setEtaMail(String etaMail) {
        this.etaMail = etaMail;
    }
    public boolean isEtaType() {
        return this.etaType;
    }
    
    public void setEtaType(boolean etaType) {
        this.etaType = etaType;
    }
    public String getEtaCivilresp() {
        return this.etaCivilresp;
    }
    
    public void setEtaCivilresp(String etaCivilresp) {
        this.etaCivilresp = etaCivilresp;
    }
    public String getEtaNomresp() {
        return this.etaNomresp;
    }
    
    public void setEtaNomresp(String etaNomresp) {
        this.etaNomresp = etaNomresp;
    }
    public String getEtaPrenomresp() {
        return this.etaPrenomresp;
    }
    
    public void setEtaPrenomresp(String etaPrenomresp) {
        this.etaPrenomresp = etaPrenomresp;
    }
    public Set getOffres() {
        return this.offres;
    }
    
    public void setOffres(Set offres) {
        this.offres = offres;
    }




}


