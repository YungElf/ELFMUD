package Package01;

import Package02.Weapon_Knife;

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
            case "talkGuard": talkGuard();break;
            case "attackGuard": attackGuard();break;
            case "crossRoad": crossRoad();break;


        }
    }
        }
    public void townGate() {
        ui.mainTextArea.setText("You are standing in the town gate.\nA guard is standing in front of you. \n\nWhat do you do?");
        ui.choice1.setText("Talk to the guard");
        ui.choice2.setText("Attack the guard");
        ui.choice3.setText("Leave the town");
        ui.choice4.set_visible(false);

        game.nextposition1 = "talkGuard";
        game.nextposition2 = "attackGuard";
        game.nextposition3 = "crossRoad";
        game.nextposition4 = "";

    }
    public void talkGuard(){

    }
    public void attackGuard(){

    }
    public void crossRoad(){

    }
}