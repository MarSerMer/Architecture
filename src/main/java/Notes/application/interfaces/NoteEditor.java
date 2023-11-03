package Notes.application.interfaces;

import Notes.domain.Note;

public interface NoteEditor extends Editor<Note, Integer>{

    void printAll();

}
