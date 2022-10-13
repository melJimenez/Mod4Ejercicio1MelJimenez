package activity.whenDo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class UpdateAndDeleteTaskForm {
    public TextBox titleTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button deleteConfirmationButton = new Button(By.id("android:id/button1"));
}
