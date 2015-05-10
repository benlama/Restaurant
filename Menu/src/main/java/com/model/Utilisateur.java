/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Utilisateur")
@DiscriminatorColumn(name="TYPE",discriminatorType = DiscriminatorType.STRING)

//@XmlRootElement
//@XmlSeeAlso({Role.class})
//@JsonAutoDetect
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findById", query = "SELECT u FROM Utilisateur u WHERE u.id = :id"),
    @NamedQuery(name = "Utilisateur.findByUsername", query = "SELECT u FROM Utilisateur u WHERE u.username = :username"),
    @NamedQuery(name = "Utilisateur.findByPassword", query = "SELECT u FROM Utilisateur u WHERE u.password = :password"),
    @NamedQuery(name = "Utilisateur.findByAdresse", query = "SELECT u FROM Utilisateur u WHERE u.adresse = :adresse"),
    @NamedQuery(name = "Utilisateur.findByDateNaissance", query = "SELECT u FROM Utilisateur u WHERE u.DateNaissance = :DateNaissance"),
    @NamedQuery(name = "Utilisateur.findByDescription", query = "SELECT u FROM Utilisateur u WHERE u.description = :description"),
    @NamedQuery(name = "Utilisateur.findByEmail", query = "SELECT u FROM Utilisateur u WHERE u.email = :email"),
    @NamedQuery(name = "Utilisateur.findByEnabled", query = "SELECT u FROM Utilisateur u WHERE u.enabled = :enabled"),
    @NamedQuery(name = "Utilisateur.findByNom", query = "SELECT u FROM Utilisateur u WHERE u.nom = :nom"),
    @NamedQuery(name = "Utilisateur.findByPhoto", query = "SELECT u FROM Utilisateur u WHERE u.photo = :photo"),
    @NamedQuery(name = "Utilisateur.findByPrenom", query = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Utilisateur.findByTel", query = "SELECT u FROM Utilisateur u WHERE u.tel = :tel"),
    @NamedQuery(name = "Utilisateur.findByProfile", query = "SELECT u FROM Utilisateur u WHERE u.profile = :profile")})

public class Utilisateur implements Serializable {
    @Id 
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Size(max = 255)
    @Column(name = "username")
    private String username;
    
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    
    @Size(max = 255)
    @Column(name = "adresse")
    private String adresse;
    
    @Column(name = "date_naissance")
    @Temporal(TemporalType.DATE)
    private Date DateNaissance;
    
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    
    @Column(name = "enabled")
    private int enabled;
    
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    
    @Size(max = 255)
    @Column(name = "photo")
    private String photo;
    
    @Size(max = 255)
    @Column(name = "prenom")
    private String prenom;
    
    @Size(max = 255)
    @Column(name = "tel")
    private String tel;
    
    @Size(max = 255)
    @Column(name = "profile")
    private String profile;
    
    // @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="utilisateur_role",
      joinColumns={@JoinColumn(name="IdUtilisateur", referencedColumnName="ID")},
      inverseJoinColumns={@JoinColumn(name="IdRole", referencedColumnName="ID")})
    private List<Role> roles;

    public Utilisateur() {
    }

    public Utilisateur(Integer id) {
        this.id = id;
    }

    public Utilisateur(Integer id, String Username, String password, String adresse, Date date_naissance, String description, String email, int etat, String nom, String photo, String prenom, String tel, String profile) {
        this.id = id;
        this.username = Username;
        this.password = password;
        this.adresse = adresse;
        this.DateNaissance = date_naissance;
        this.description = description;
        this.email = email;
        this.enabled = enabled;
        this.nom = nom;
        this.photo = photo;
        this.prenom = prenom;
        this.tel = tel;
        this.profile = profile;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEtat() {
        return enabled;
    }

    public void setEtat(int etat) {
        this.enabled = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    @JsonManagedReference
    //@XmlTransient
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Utilisateur[ id=" + id + " ]";
    }
    
}
