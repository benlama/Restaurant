/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "cordonner")

// @XmlRootElement
// @JsonAutoDetect
@NamedQueries({
    @NamedQuery(name = "Cordonner.findAll", query = "SELECT c FROM Cordonner c"),
    @NamedQuery(name = "Cordonner.findById", query = "SELECT c FROM Cordonner c WHERE c.id = :id"),
    @NamedQuery(name = "Cordonner.findByLatitude", query = "SELECT c FROM Cordonner c WHERE c.latitude = :latitude"),
    @NamedQuery(name = "Cordonner.findByLongitude", query = "SELECT c FROM Cordonner c WHERE c.longitude = :longitude")})
public class Cordonner implements Serializable {
    @Id 
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitude")
    private long latitude;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private long longitude;
    
    // @JsonIgnore
    @JoinColumn(name = "zone", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Zone zone;

    public Cordonner() {
    }

    public Cordonner(Integer id) {
        this.id = id;
    }

    public Cordonner(Integer id, long latitude, long longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    //  @XmlTransient
    @JsonBackReference
    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
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
        if (!(object instanceof Cordonner)) {
            return false;
        }
        Cordonner other = (Cordonner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Cordonner[ id=" + id + " ]";
    }
    
}
