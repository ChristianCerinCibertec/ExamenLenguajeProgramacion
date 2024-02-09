package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="subject")
 
@NamedQuery(name="subject.findAll",query="SELECT r FROM Subject r")


public class Subject {

	@Id
	@Column(name="idsubject")
	private int idsubject;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="credits")
	private String credits;
	
	
	public Subject() {
		
	}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
	
	
	
}
