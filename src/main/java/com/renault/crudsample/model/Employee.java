package com.renault.crudsample.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name="employee" ,schema="test_db")
public class Employee
{  
//Defining book id as primary key  
@Id  
@Column  
private String emp_id;  
@Column  
private String emp_name;  
@Column  
private String emp_mail_id;  
@Column  
private int mobile_number;

public String getEmp_id() {
	return emp_id;
}
public void setEmp_id(String emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getEmp_mail_id() {
	return emp_mail_id;
}
public void setEmp_mail_id(String emp_mail_id) {
	this.emp_mail_id = emp_mail_id;
}
public int getMobile_number() {
	return mobile_number;
}
public void setMobile_number(int mobile_number) {
	this.mobile_number = mobile_number;
}  
  
} 
