package Package01;

public class VisibilityManager {

    UI ui;
    public VisibilityManager(UI userInterface){

        ui = userInterface;
    }

    public void showTitleScreen(){

        // Shows The Title Screen
        ui.titlenamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        // Hide all the game screen stuff
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }
    public void TitletoTown(){
        // Hide The Title Screen
        ui.titlenamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        // Show all the game screen stuff
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

    }
}
