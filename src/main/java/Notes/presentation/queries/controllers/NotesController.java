package Notes.presentation.queries.controllers;

import Notes.application.interfaces.NoteEditor;
import Notes.domain.Note;
import Notes.presentation.queries.controllers.Controller;

public class NotesController extends Controller {



    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    //TODO: \notes\all
    public void routeGetAll(){
        noteEditor.printAll();
    }

    public void addNote(Note newNote){
        if (noteEditor.add(newNote)){
            System.out.println("Новая запись добавлена");
        }
        else {
            System.out.println("Что-то пошло не так, запись не была добавлена");
        }
    }

    public void deleteNote(Note noteToDelete){
        if (noteEditor.remove(noteToDelete)){
            System.out.println("deleteNote from ConcreteNoteEditor finished its work");
        }

    }
}
