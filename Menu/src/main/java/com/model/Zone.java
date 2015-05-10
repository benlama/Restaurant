/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "zone")
// @XmlSeeAlso({Publicite.class,Cordonner.class})
// @JsonAutoDetect
// @XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zone.findAll", query = "SELECT z FROM Zone z"),
    @NamedQuery(name = "Zone.findById", query = "SELECT z FROM Zone z WHERE z.id = :id"),
    @NamedQuery(name = "Zone.findByDescription", query = "SELECT z FROM Zone z WHERE z.description = :description"),
    @NamedQuery(name = "Zone.findByLibelle", query = "SELECT z FROM Zone z WHERE z.libelle = :libelle")})
public class Zone implements Serializable {
    
    @Id 
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    
    @Size(max = 255)
    @Column(name = "libelle")
    private String libelle;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="zone_publicite",
      joinColumns={@JoinColumn(name="IdZone", referencedColumnName="ID")},
      inverseJoinColumns={@JoinColumn(name="IdPublicite", referencedColumnName="ID")})
    // @JsonIgnore
    private List<Publicite> publicites;
    
    // @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "zone")
    private List<Cordonner> cordonnerList;

    public Zone() {
    }

    public Zone(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // @XmlTransient
    @JsonManagedReference
    public List<Publicite> getPublicites() {
        return publicites;
    }

    public void setPublicites(List<Publicite> publicites) {
        this.publicites = publicites;
    }

    // @XmlTransient
    @JsonManagedReference
    public List<Cordonner> getCordonnerList() {
        return cordonnerList;
    }

    public void setCordonnerList(List<Cordonner> cordonnerList) {
        this.cordonnerList = cordonnerList;
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
        if (!(object instanceof Zone)) {
            return false;
        }
        Zone other = (Zone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Zone[ id=" + id + " ]";
    }
    
}
