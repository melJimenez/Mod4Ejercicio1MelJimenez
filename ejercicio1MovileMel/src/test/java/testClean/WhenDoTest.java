package testClean;

import activity.whenDo.CreateTaskForm;
import activity.whenDo.MainScreen;
import activity.whenDo.UpdateAndDeleteTaskForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class WhenDoTest {
    MainScreen mainScreen = new MainScreen();
    CreateTaskForm createNoteForm = new CreateTaskForm();
    UpdateAndDeleteTaskForm updateAndDeleteTaskForm= new UpdateAndDeleteTaskForm();
    @Test
    public void verifyCRUDTask(){
        String title="Vet";
        String note="Go for vaccines for Pets";
        //create
        mainScreen.addTaskButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();
        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),"ERROR, the note was not created");
        //update
        mainScreen.setNoteLabel(title);
        mainScreen.noteLabel.click();
        title="Vet Angeles";
        note="Go for vaccines for my Pets";
        updateAndDeleteTaskForm.titleTxtBox.setText(title);
        updateAndDeleteTaskForm.noteTxtBox.setText(note);
        updateAndDeleteTaskForm.saveButton.click();
        Assertions.assertTrue(mainScreen.isNoteDisplayed(title), "ERROR, the note was not updated");
        //delete
        mainScreen.setNoteLabel(title);
        mainScreen.noteLabel.click();
        updateAndDeleteTaskForm.deleteButton.click();
        updateAndDeleteTaskForm.deleteConfirmationButton.click();
        Assertions.assertFalse(mainScreen.isNoteDisplayed(title),"ERROR, the note was not deleted");
    }
    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }
}
