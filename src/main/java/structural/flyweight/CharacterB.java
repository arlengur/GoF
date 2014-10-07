package structural.flyweight;

public class CharacterB extends EnglishCharacter {

    public CharacterB() {
        simbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + simbol + " Width = " + width + " Height = " + height);
    }

}