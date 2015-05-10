/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
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
@javax.persistence.Table(name = "reservation")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r"),
    @NamedQuery(name = "Reservation.findById", query = "SELECT r FROM Reservation r WHERE r.id = :id"),
    @NamedQuery(name = "Reservation.findByDate", query = "SELECT r FROM Reservation r WHERE r.date = :date"),
    @NamedQuery(name = "Reservation.findByHeureDebut", query = "SELECT r FROM Reservation r WHERE r.heureDebut = :heureDebut"),
    @NamedQuery(name = "Reservation.findByHeureFin", query = "SELECT r FROM Reservation r WHERE r.heureFin = :heureFin"),
    @NamedQuery(name = "Reservation.findByNombrePlace", query = "SELECT r FROM Reservation r WHERE r.nombrePlace = :nombrePlace"),
    @NamedQuery(name = "Reservation.findByDescription", query = "SELECT r FROM Reservation r WHERE r.description = :description")})
public class Reservation implements Serializable {
    @Id 
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Column(name = "heure_debut")
    @Temporal(TemporalType.TIME)
    private Date heureDebut;
    
    @Column(name = "heure_fin")
    @Temporal(TemporalType.TIME)
    private Date heureFin;
    
    @Column(name = "nombre_place")
    private int nombrePlace;
    
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    
    @JoinColumn(name = "table_restaurant", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TableRestaurant tableRestaurant;
    
    @JoinColumn(name = "client", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Client client;

    public Reservation() {
    }

    public Reservation(Integer id) {
        this.id = id;
    }

    public Reservation(Integer id, Date date, Date heureDebut, Date heureFin, int nombrePlace, String description) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.nombrePlace = nombrePlace;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @XmlTransient
    public TableRestaurant getTableRestaurant() {
        return tableRestaurant;
    }

    public void setTableRestaurant(TableRestaurant table) {
        this.tableRestaurant = table;
    }

    @XmlTransient
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Reservation[ id=" + id + " ]";
    }
    
}
