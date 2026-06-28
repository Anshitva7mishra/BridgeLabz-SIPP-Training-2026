class GameCharacter {
    protected String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " performs a basic attack.");
    }
}

class Warrior extends GameCharacter {
    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println("Warrior " + characterName + " swings a mighty sword!");
    }
}

class Mage extends GameCharacter {
    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println("Mage " + characterName + " casts a fireball spell!");
    }
}

class Archer extends GameCharacter {
    public Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println("Archer " + characterName + " shoots a flaming arrow!");
    }
}

public class adventureGame {
    public static void startBattle(GameCharacter[] characters) {
        System.out.println("--- Battle Started ---");
        int warriors = 0, mages = 0, archers = 0;

        for (GameCharacter c : characters) {
            c.performAttack();
            if (c instanceof Warrior) warriors++;
            else if (c instanceof Mage) mages++;
            else if (c instanceof Archer) archers++;
        }

        System.out.println("\n--- Battle Stats ---");
        System.out.println("Warriors: " + warriors);
        System.out.println("Mages: " + mages);
        System.out.println("Archers: " + archers);
    }

    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[4];
        characters[0] = new Warrior("Thorin");
        characters[1] = new Mage("Gandalf");
        characters[2] = new Archer("Legolas");
        characters[3] = new Warrior("Conan");

        startBattle(characters);
    }
}
