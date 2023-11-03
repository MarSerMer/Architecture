package Notes.infrastructure.persistance;

import Notes.application.interfaces.NotesDatabaseContext;
import Notes.database.NotesDatabase;
import Notes.database.NotesRecord;
import Notes.domain.Note;
import Notes.infrastructure.persistance.entityconfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {

    public Collection<Note> getAll(){
        Collection<Note> notes = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notes.add(new Note(
                    record.getId(),
                    record.getTitle(),
                    record.getDetails()
            ));
        }
        return notes;
    }

    public void addNote(Note newNote){
        ((NotesDatabase)database).getNotesTable().getRecords().add(new NotesRecord(newNote.getTitle(),newNote.getDetails()));
        System.out.println("Запись добавлена - рапортует метод addNote из DatabaseContext");
    }

    public void deleteNote(Note noteToDelete){
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            if (record.getTitle().equals(noteToDelete.getTitle()) &&
                    record.getDetails().equals(noteToDelete.getDetails())){
                ((NotesDatabase)database).getNotesTable().getRecords().remove(record);
                System.out.println("Запись удалена - рапортует метод deleteNote из DatabaseContext");
                break;
            }
        }

    }

    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
