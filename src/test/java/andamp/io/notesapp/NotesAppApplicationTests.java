package andamp.io.notesapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NotesAppApplicationTests {

	@Autowired
	private NoteRepository noteRepository;

	@Test
	void contextLoads() {
		Note note = new Note();
		note.setText("test");
		noteRepository.insert(note);
	}

}
