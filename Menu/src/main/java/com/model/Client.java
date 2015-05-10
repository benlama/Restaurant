/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name="utilisateur")
@DiscriminatorValue("Client")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT u FROM Client u"),
    @NamedQuery(name = "Client.findById", query = "SELECT u FROM Client u WHERE u.id = :id"),
    @NamedQuery(name = "Client.findByUsername", query = "SELECT u FROM Client u WHERE u.username = :username"),
    @NamedQuery(name = "Client.findByPassword", query = "SELECT u FROM Client u WHERE u.password = :password"),
    @NamedQuery(name = "Client.findByAdresse", query = "SELECT u FROM Client u WHERE u.adresse = :adresse"),
    @NamedQuery(name = "Client.findByDateNaissance", query = "SELECT u FROM Client u WHERE u.DateNaissance = :DateNaissance"),
    @NamedQuery(name = "Client.findByDescription", query = "SELECT u FROM Client u WHERE u.description = :description"),
    @NamedQuery(name = "Client.findByEmail", query = "SELECT u FROM Client u WHERE u.email = :email"),
    @NamedQuery(name = "Client.findByEnabled", query = "SELECT u FROM Client u WHERE u.enabled = :enabled"),
    @NamedQuery(name = "Client.findByNom", query = "SELECT u FROM Client u WHERE u.nom = :nom"),
    @NamedQuery(name = "Client.findByPhoto", query = "SELECT u FROM Client u WHERE u.photo = :photo"),
    @NamedQuery(name = "Client.findByPrenom", query = "SELECT u FROM Client u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Client.findByTel", query = "SELECT u FROM Client u WHERE u.tel = :tel"),
    @NamedQuery(name = "Client.findByProfile", query = "SELECT u FROM Client u WHERE u.profile = :profile"),
    @NamedQuery(name = "Client.findByIdRs", query = "SELECT c FROM Client c WHERE c.idRs = :idRs"),
    @NamedQuery(name = "Client.findByAccessTokenRs", query = "SELECT c FROM Client c WHERE c.accessTokenRs = :accessTokenRs"),
    @NamedQuery(name = "Client.findByPointFidelite", query = "SELECT c FROM Client c WHERE c.pointFidelite = :pointFidelite"),
    @NamedQuery(name = "Client.findByLinkRs", query = "SELECT c FROM Client c WHERE c.linkRs = :linkRs"),
    @NamedQuery(name = "Client.findByGenderRs", query = "SELECT c FROM Client c WHERE c.genderRs = :genderRs"),
    @NamedQuery(name = "Client.findByTypeRs", query = "SELECT c FROM Client c WHERE c.typeRs = :typeRs")})

public class Client extends Utilisateur implements Serializable {
    
    @Size(max = 255)
    @Column(name = "id_rs")
    private String idRs;
    
    @Column(name = "point_fidelite")
    private int pointFidelite;
    
    @Size(max = 255)
    @Column(name = "access_token_rs")
    private String accessTokenRs;
    
    @Size(min = 1, max = 255)
    @Column(name = "link_rs")
    private String linkRs;
    
    @Column(name = "gender_rs")
    private int genderRs;
    
    @Size(min = 1, max = 200)
    @Column(name = "type_rs")
    private String typeRs;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Reservation> reservationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<FeedBack> feedBackList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Commande> commandeList;

    public Client() {
    }

    public Client(Integer id) {
        super(id);
    }

    public Client(Integer id, String login, String password, String adresse, Date date_naissance, String description, String email, int etat, String nom, String photo, String prenom, String tel, String profile) {
        super(id, login, password, adresse, date_naissance, description, email, etat, nom, photo, prenom, tel, profile);
    }

    public Client(String idRs, int pointFidelite, String accessTokenRs, String linkRs, int genderRs, String typeRs) {
        this.idRs = idRs;
        this.pointFidelite = pointFidelite;
        this.accessTokenRs = accessTokenRs;
        this.linkRs = linkRs;
        this.genderRs = genderRs;
        this.typeRs = typeRs;
    }

    public String getIdRs() {
        return idRs;
    }

    public void setIdRs(String idRs) {
        this.idRs = idRs;
    }

    public int getPointFidelite() {
        return pointFidelite;
    }

    public void setPointFidelite(int pointFidelite) {
        this.pointFidelite = pointFidelite;
    }

    public String getAccessTokenRs() {
        return accessTokenRs;
    }

    public void setAccessTokenRs(String accessTokenRs) {
        this.accessTokenRs = accessTokenRs;
    }
    
    public String getLinkRs() {
        return linkRs;
    }

    public void setLinkRs(String linkRs) {
        this.linkRs = linkRs;
    }

    public int getGenderRs() {
        return genderRs;
    }

    public void setGenderRs(int genderRs) {
        this.genderRs = genderRs;
    }

    public String getTypeRs() {
        return typeRs;
    }

    public void setTypeRs(String typeRs) {
        this.typeRs = typeRs;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @XmlTransient
    public List<FeedBack> getFeedBackList() {
        return feedBackList;
    }

    public void setFeedBackList(List<FeedBack> feedBackList) {
        this.feedBackList = feedBackList;
    }

    @XmlTransient
    public List<Commande> getCommandeList() {
        return commandeList;
    }

    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
    }

    
}
