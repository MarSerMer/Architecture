package Notes;

import Notes.application.ConcreteNoteEditor;
import Notes.application.interfaces.NoteEditor;
import Notes.application.interfaces.NotesDatabaseContext;
import Notes.database.NotesDatabase;
import Notes.domain.Note;
import Notes.infrastructure.persistance.Database;
import Notes.infrastructure.persistance.DatabaseContext;
import Notes.presentation.queries.controllers.NotesController;
import Notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    /**
     * CQRS
     * @param args
     */
    public static void main(String[] args) {
        Database database = new NotesDatabase();
        NotesDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();
        NoteEditor noteEditor = new ConcreteNoteEditor(notesConsolePresenter, context);

        NotesController notesController = new NotesController(noteEditor);

        notesController.routeGetAll();

        Note testNote = new Note(5, "Test title", "Test details");
        notesController.addNote(testNote);

        notesController.routeGetAll();

        notesController.deleteNote(testNote);

        notesController.routeGetAll();
    }

}
