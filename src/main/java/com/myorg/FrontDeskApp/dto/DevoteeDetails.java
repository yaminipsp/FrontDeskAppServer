/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorg.FrontDeskApp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 *
 * @author prasa
 */
@Entity
@Table(name = "DEVOTEE_DETAILS", catalog = "SASVTDB", schema = "PUBLIC")
//@XmlRootElement
//@XmlAccessorType(value = XmlAccessType.FIELD)
public class DevoteeDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    //@SequenceGenerator()
    //@SequenceGenerator(name = "mySeqGen", sequenceName = "SYSTEM_SEQUENCE_D8A6F781_047D_486A_A582_F036B05C654D", initialValue = 1, allocationSize = 200)
    //@GeneratedValue
    //@Basic(optional = false)
    @Column(name = "DEVOTEE_ID", updatable=false, nullable = false)
    private Integer devoteeId;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME", nullable = false, length = 30)
    private String firstName;
    @Column(name = "LAST_NAME", length = 30)
    private String lastName;
    @Column(length = 20)
    private String phone;
    @Column(length = 100)
    private String email;
    @Column(length = 100)
    private String address;
    @Column(length = 20)
    private String city;
    @Column(name = "STATE_DET", length = 20)
    private String stateDet;
    @Column(name = "COUNTRY_DET", length = 20)
    private String countryDet;
    @Column(length = 20)
    private String zip;
    @Basic(optional = false)
    @Column(name = "DATE_CREATED", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @Column(name = "DATE_MODIFIED", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public DevoteeDetails() {
    }

    public DevoteeDetails(Integer devoteeId) {
        this.devoteeId = devoteeId;
    }

    public DevoteeDetails(Integer devoteeId, String firstName, Date dateCreated, Date dateModified) {
        this.devoteeId = devoteeId;
        this.firstName = firstName;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Integer getDevoteeId() {
        return devoteeId;
    }

    public void setDevoteeId(Integer devoteeId) {
        this.devoteeId = devoteeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateDet() {
        return stateDet;
    }

    public void setStateDet(String stateDet) {
        this.stateDet = stateDet;
    }

    public String getCountryDet() {
        return countryDet;
    }

    public void setCountryDet(String countryDet) {
        this.countryDet = countryDet;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
    
   // @JsonManagedReference
    @JsonBackReference
    @OneToMany(mappedBy = "dd")   
    private List<ReceiptDetails> rd;
    
    public void setRd(List<ReceiptDetails> rd) {
		this.rd = rd;
	}
    
//    @XmlTransient
    public List<ReceiptDetails> getRd() {
		return rd;
	}
/*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devoteeId != null ? devoteeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevoteeDetails)) {
            return false;
        }
        DevoteeDetails other = (DevoteeDetails) object;
        if ((this.devoteeId == null && other.devoteeId != null) || (this.devoteeId != null && !this.devoteeId.equals(other.devoteeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.DevoteeDetails[ devoteeId=" + devoteeId + " ]";
    }
  */  
}
