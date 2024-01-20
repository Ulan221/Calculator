import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller implements ActionListener {

  private final Model model;
  public Controller(Viewer viewer) {
    model = new Model(viewer);
  }

  public void actionPerformed(ActionEvent event) {
    String command = event.getActionCommand();
    model.doAction(command);
  }
}
