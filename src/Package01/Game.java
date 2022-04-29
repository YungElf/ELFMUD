package Package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

        String nextposition1, nextposition2, nextposition3, nextposition4;

    public static void main(String[] args) {

        new Game();
    }

    public Game(){

        ui.createUI(cHandler);
        story.defaultSetup();
        vm.showTitleScreen();
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            switch(yourChoice){
                case  "start": vm.TitletoTown(); break;
                case "c1": story.selectposition(nextposition1); break;
                case "c2": story.selectposition(nextposition2);break;
                case "c3": story.selectposition(nextposition3);break;
                case "c4": story.selectposition(nextposition4);break;
            }
        }
    }
}