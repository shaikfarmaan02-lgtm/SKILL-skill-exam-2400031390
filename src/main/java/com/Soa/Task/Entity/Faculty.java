package com.Soa.Task.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Faculty")
public class Faculty {
	@Id
	@Column(name="id")
  private long facultyid;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="type",nullable=false)
	private String type;
	@Column(name="status",nullable=false)
	private String status;
	@Column(name="location",nullable=false)
	private String location;
	@UpdateTimestamp
	private LocalDateTime updatedat;
	@CreationTimestamp
	private LocalDateTime createdat;
	public long getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(long facultyid) {
		this.facultyid = facultyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDateTime getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}
	public LocalDateTime getCreatedat() {
		return createdat;
	}
	public void setCreatedat(LocalDateTime localDateTime) {
		this.createdat = localDateTime;
	}
	@Override
	public String toString() {
		return "Faculty [facultyid=" + facultyid + ", name=" + name + ", type=" + type + ", status=" + status
				+ ", location=" + location + ", updatedat=" + updatedat + ", createdat=" + createdat + "]";
	}
	
  
}
