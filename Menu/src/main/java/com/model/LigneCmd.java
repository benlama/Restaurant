/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "ligne_cmd")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "LigneCmd.findAll", query = "SELECT l FROM LigneCmd l"),
    @NamedQuery(name = "LigneCmd.findById", query = "SELECT l FROM LigneCmd l WHERE l.id = :id"),
    @NamedQuery(name = "LigneCmd.findByQuantite", query = "SELECT l FROM LigneCmd l WHERE l.quantite = :quantite")})
public class LigneCmd implements Serializable {
    
    @Id 
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    
    @Column(name = "quantite")
    private int quantite;
    
    @JoinColumn(name = "plat", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Plat plat;
    
    @JoinColumn(name = "commande", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Commande commande;

    public LigneCmd() {
    }

    public LigneCmd(Integer id) {
        this.id = id;
    }

    public LigneCmd(Integer id, int quantite) {
        this.id = id;
        this.quantite = quantite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @XmlTransient
    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }

    @XmlTransient
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
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
        if (!(object instanceof LigneCmd)) {
            return false;
        }
        LigneCmd other = (LigneCmd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.LigneCmd[ id=" + id + " ]";
    }
    
}
