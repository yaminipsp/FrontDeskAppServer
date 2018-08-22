/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorg.FrontDeskApp.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
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
@Table(name = "RECEIPT_DETAILS", catalog = "SASVTDB", schema = "PUBLIC")
//@XmlRootElement
//@XmlAccessorType(value = XmlAccessType.FIELD)
public class ReceiptDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Basic(optional = false)
    @Column(name = "RECEIPT_ID", updatable=false, nullable = false)
    private Integer receiptId;
    //@Basic(optional = false)
    //@Column(name = "DEVOTEE_ID", nullable = false)
    //private int devoteeId;
    
   // @JsonBackReference
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "DEVOTEE_ID", nullable = false)
    //@XmlTransient
    private DevoteeDetails dd;
    
    
    @Basic(optional = false)
    @Column(name = "SERVICE_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date serviceDate;
    private Integer donation;
    @Column(name = "PAYMENT_TYPE", length = 15)
    private String paymentType;
    @Column(name = "PAYMENT_DET", length = 15)
    private String paymentDet;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String service;
    @Column(length = 10)
    private String iscash;
    @Column(name = "CHECK_DET", length = 50)
    private String checkDet;
    @Column(name = "CARD_DET", length = 50)
    private String cardDet;
    @Basic(optional = false)
    @Column(name = "DATE_CREATED", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @Column(name = "DATE_MODIFIED", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
	//private DevoteeDetails devDet;

    public ReceiptDetails() {
    }

    public ReceiptDetails(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public ReceiptDetails(Date serviceDate, String service, Date dateCreated, Date dateModified) {
        //this.receiptId = receiptId;
        //this.devoteeId = devoteeId;
        this.serviceDate = serviceDate;
        this.service = service;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }
/*
    public int getDevoteeId() {
        return devoteeId;
    }

    public void setDevoteeId(int devoteeId) {
        this.devoteeId = devoteeId;
    }
  
    public void setDevDet(DevoteeDetails dd) {
    	this.devDet=dd;
    }
    
    public DevoteeDetails getDevDet() {
    	return dd;
    }
*/
    public Date getServiceDate() {
        return serviceDate;
    }
    
//    public 

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Integer getDonation() {
        return donation;
    }

    public void setDonation(Integer donation) {
        this.donation = donation;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentDet() {
        return paymentDet;
    }

    public void setPaymentDet(String paymentDet) {
        this.paymentDet = paymentDet;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getIscash() {
        return iscash;
    }

    public void setIscash(String iscash) {
        this.iscash = iscash;
    }

    public String getCheckDet() {
        return checkDet;
    }

    public void setCheckDet(String checkDet) {
        this.checkDet = checkDet;
    }

    public String getCardDet() {
        return cardDet;
    }

    public void setCardDet(String cardDet) {
        this.cardDet = cardDet;
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
    
    public void setDd(DevoteeDetails dd) {
		this.dd = dd;
	}
    
  //  @XmlTransient
    public DevoteeDetails getDd() {
		return dd;
	}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (receiptId != null ? receiptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReceiptDetails)) {
            return false;
        }
        ReceiptDetails other = (ReceiptDetails) object;
        if ((this.receiptId == null && other.receiptId != null) || (this.receiptId != null && !this.receiptId.equals(other.receiptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ReceiptDetails[ receiptId=" + receiptId + " ]";
    }
    
}
