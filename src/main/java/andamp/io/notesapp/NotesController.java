package andamp.io.notesapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class NotesController {

    private final NoteRepository noteRepository;

    public NotesController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public void insertNote(@RequestBody Note note) {
        noteRepository.insert(note);
    }
}