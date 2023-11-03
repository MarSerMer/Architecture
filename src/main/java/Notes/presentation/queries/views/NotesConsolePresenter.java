package Notes.presentation.queries.views;

import Notes.application.interfaces.NotesPresenter;
import Notes.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes){
            System.out.println(note);
        }
    }
}
