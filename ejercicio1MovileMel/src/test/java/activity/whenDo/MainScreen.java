package activity.whenDo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public void setNoteLabel(String title) {
        this.noteLabel = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']")); ;
    }

    public Label noteLabel;
    public boolean isNoteDisplayed(String title){
        setNoteLabel(title);
        return noteLabel.isControlDisplayed();
    }

}
