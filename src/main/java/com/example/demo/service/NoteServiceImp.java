package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Notes;
import com.example.demo.repository.INoteRepository;

/**
 * @author JThakur
 *
 */
@Service
public class NoteServiceImp implements INoteService {

	@Autowired
	INoteRepository noteRepo;

	@Override
	public int saveNote(Notes note) {
		Notes noteId = noteRepo.save(note);
		return noteId.getNoteId();
	}

	@Override
	public int updateNote(Notes note) {
		Notes noteId = noteRepo.save(note);
		return noteId.getNoteId();
	}

	@Override
	public int deleteNote(int note) {
		noteRepo.delete(note);
		return 1;
	}

	@Override
	public Notes fetchNote(int noteId) {
		Notes note = noteRepo.getOne(noteId);
		return note;
	}

	@Override
	public List<Notes> fetchAllNotes() {
		List<Notes> notes = noteRepo.findAll();
		return notes;
	}

}
