package Notes.application.interfaces;

import Notes.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();

    void addNote(Note newNote);

    void deleteNote(Note noteToDelete);

}
