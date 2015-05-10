/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name="utilisateur")
@DiscriminatorValue("Personnel")
//@XmlRootElement
//@XmlSeeAlso({Commande.class})

@NamedQueries({
    
    @NamedQuery(name = "Personnel.findAll", query = "SELECT u FROM Personnel u"),
    @NamedQuery(name = "Personnel.findById", query = "SELECT u FROM Personnel u WHERE u.id = :id"),
    @NamedQuery(name = "Personnel.findByUsername", query = "SELECT u FROM Personnel u WHERE u.username = :username"),
    @NamedQuery(name = "Personnel.findByPassword", query = "SELECT u FROM Personnel u WHERE u.password = :password"),
    @NamedQuery(name = "Personnel.findByAdresse", query = "SELECT u FROM Personnel u WHERE u.adresse = :adresse"),
    @NamedQuery(name = "Personnel.findByDateNaissance", query = "SELECT u FROM Personnel u WHERE u.DateNaissance = :DateNaissance"),
    @NamedQuery(name = "Personnel.findByDescription", query = "SELECT u FROM Personnel u WHERE u.description = :description"),
    @NamedQuery(name = "Personnel.findByEmail", query = "SELECT u FROM Personnel u WHERE u.email = :email"),
    @NamedQuery(name = "Personnel.findByEnabled", query = "SELECT u FROM Personnel u WHERE u.enabled = :enabled"),
    @NamedQuery(name = "Personnel.findByNom", query = "SELECT u FROM Personnel u WHERE u.nom = :nom"),
    @NamedQuery(name = "Personnel.findByPhoto", query = "SELECT u FROM Personnel u WHERE u.photo = :photo"),
    @NamedQuery(name = "Personnel.findByPrenom", query = "SELECT u FROM Personnel u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Personnel.findByTel", query = "SELECT u FROM Personnel u WHERE u.tel = :tel"),
    @NamedQuery(name = "Personnel.findByProfile", query = "SELECT u FROM Personnel u WHERE u.profile = :profile"),
    @NamedQuery(name = "Personnel.findByIsAdmin", query = "SELECT u FROM Personnel u WHERE u.isAdmin = :isAdmin"),
    @NamedQuery(name = "Personnel.findByDateEmbauche", query = "SELECT u FROM Personnel u WHERE u.dateEmbauche = :dateEmbauche"),
    @NamedQuery(name = "Personnel.findBySalaireHeure", query = "SELECT u FROM Personnel u WHERE u.salaireHeure = :salaireHeure"),
    @NamedQuery(name = "Personnel.findByCnss", query = "SELECT u FROM Personnel u WHERE u.cnss = :cnss"),
    @NamedQuery(name = "Personnel.findByCin", query = "SELECT u FROM Personnel u WHERE u.cin = :cin")})


public class Personnel extends  Utilisateur implements Serializable {
    
    @Column(name = "is_admin")
    private int isAdmin;
    
    @Column(name = "date_embauche")
    @Temporal(TemporalType.DATE)
    private Date dateEmbauche;
    
    @Column(name = "salaire_heure")
    private double salaireHeure;
    
    @Size(min = 1, max = 30)
    @Column(name = "CNSS")
    private String cnss;
    
    @Size(min = 1, max = 10)
    @Column(name = "CIN")
    private String cin;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serveur")
    private List<Commande> commandeList;

    public Personnel() {
        
    }

    public Personnel(Integer id) {
        super(id);
    }

    public Personnel(int isAdmin, Date dateEmbauche, double salaireHeure, String cnss, String cin) {
        this.isAdmin = isAdmin;
        this.dateEmbauche = dateEmbauche;
        this.salaireHeure = salaireHeure;
        this.cnss = cnss;
        this.cin = cin;
    }
    
    public Personnel(int isAdmin, Date dateEmbauche, double salaireHeure, String cnss, String cin, Integer id, String login, String password, String adresse, Date date_naissance, String description, String email, int etat, String nom, String photo, String prenom, String tel, String profile) {
        super(id, login, password, adresse, date_naissance, description, email, etat, nom, photo, prenom, tel, profile);
        this.isAdmin = isAdmin;
        this.dateEmbauche = dateEmbauche;
        this.salaireHeure = salaireHeure;
        this.cnss = cnss;
        this.cin = cin;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getSalaireHeure() {
        return salaireHeure;
    }

    public void setSalaireHeure(double salaireHeure) {
        this.salaireHeure = salaireHeure;
    }

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @JsonBackReference
    //@XmlTransient
    public List<Commande> getCommandeList() {
        return commandeList;
    }

    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
    }

}
