package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author JThakur
 * @see this class as model class
 */
@Entity(name = "NOTES")
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NOTEID")
	int noteId;
	@Column(name = "TITLE")
	String title;
	@Column(name = "DISCRIPTION")
	String discription;

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
