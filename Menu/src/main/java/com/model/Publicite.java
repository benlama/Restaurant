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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "publicite")
// @JsonAutoDetect
// @XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Publicite.findAll", query = "SELECT p FROM Publicite p"),
    @NamedQuery(name = "Publicite.findById", query = "SELECT p FROM Publicite p WHERE p.id = :id"),
    @NamedQuery(name = "Publicite.findByBanniere", query = "SELECT p FROM Publicite p WHERE p.banniere = :banniere"),
    @NamedQuery(name = "Publicite.findByDate", query = "SELECT p FROM Publicite p WHERE p.date = :date"),
    @NamedQuery(name = "Publicite.findByDescription", query = "SELECT p FROM Publicite p WHERE p.description = :description"),
    @NamedQuery(name = "Publicite.findByTitre", query = "SELECT p FROM Publicite p WHERE p.titre = :titre")})

public class Publicite implements Serializable {
    
    @Id 
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Size(max = 255)
    @Column(name = "banniere")
    private String banniere;
    
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    
    @Size(max = 255)
    @Column(name = "titre")
    private String titre;
    
    @Column(name = "etat")
    private int etat;
    
    // @JsonIgnore
    @JsonBackReference
    @ManyToMany(mappedBy = "publicites")
    private List<Zone> zones;

    public Publicite() {
    }

    public Publicite(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanniere() {
        return banniere;
    }

    public void setBanniere(String banniere) {
        this.banniere = banniere;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @XmlTransient
    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
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
        if (!(object instanceof Publicite)) {
            return false;
        }
        Publicite other = (Publicite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Publicite{" + "id=" + id + ", banniere=" + banniere + ", date=" + date + ", description=" + description + ", titre=" + titre + ", etat=" + etat + '}';
    }

    
}
