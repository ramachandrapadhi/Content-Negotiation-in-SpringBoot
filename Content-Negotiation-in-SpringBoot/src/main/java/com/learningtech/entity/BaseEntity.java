package com.learningtech.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class )
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column( name="created_by", nullable = false )
	private String createdBy;
	
	@Column(name="created_at", nullable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private Timestamp createdAt;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name="updated_at", columnDefinition = " DATETIME ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp updatedAt;

}
