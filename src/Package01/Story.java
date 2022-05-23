package Package01;

import Package02.Weapon_Knife;

import java.util.Locale;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();

    public Story(Game g, UI userInterface, VisibilityManager vManager) {
        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup() {

        player.hp = 15;
        ui.hpNumberLabel.setText(" " + player.hp);

        player.currentWeapon = new Weapon_Knife();
        ui.weaponNameLabel.setText(" " + player.currentWeapon.name);
    }
        public void selectposition(String nextposition){
        switch(nextposition) {
            case "townGate": townGate(); break;
            case "talkGuard": talkGuard();break;
            case "attackGuard": attackGuard();break;
            case "crossRoad": crossRoad();break;


        }
    }

    public void townGate() {
        ui.mainTextArea.setText("You are standing in the town gate.\nA guard is standing in front of you. \n\nWhat do you do?");
        ui.choice1.setText("Talk to the guard");
        ui.choice2.setText("Attack the guard");
        ui.choice3.setText("Leave the town");
        ui.choice4.setText("");

        game.nextposition1 = "talkGuard";
        game.nextposition2 = "attackGuard";
        game.nextposition3 = "crossRoad";
        game.nextposition4 = "";

    }
    public void talkGuard(){
        ui.mainTextArea.setText("Guard: Hello stranger. I don't recall seeing you around these parts before....\n\n I'm sorry but we do not allow strangers to enter our town.");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextposition1 = "townGate";
        game.nextposition2 = "";
        game.nextposition3 = "";
        game.nextposition4 = "";

    }

    public void attackGuard(){

    }
    public void crossRoad(){

    }
}

