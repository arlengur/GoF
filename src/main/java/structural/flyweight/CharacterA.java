package structural.flyweight;

public class CharacterA extends EnglishCharacter {

    public CharacterA() {
        simbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + simbol + " Width = " + width + " Height = " + height);
    }

}
