package com.prudential.poc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_associate_details")
public class Associate {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long associateId;
    private String associateName;
    private String status;
    
	public Associate(Long associateId, String associateName, String status) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.status = status;
	}
	public Long getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", associateName=" + associateName + ", status=" + status
				+ "]";
	}
	
    
	
    
    
}
