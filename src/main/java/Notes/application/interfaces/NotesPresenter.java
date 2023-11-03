package Notes.application.interfaces;

import Notes.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

}
