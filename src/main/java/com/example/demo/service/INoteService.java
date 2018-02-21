package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Notes;

/**
 * @author JThakur
 *
 */
public interface INoteService {
	public int saveNote(Notes note);

	public int updateNote(Notes note);

	public int deleteNote(int note);

	public Notes fetchNote(int noteId);

	public List<Notes> fetchAllNotes();
}
