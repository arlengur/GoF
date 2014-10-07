package structural.flyweight;

public class CharacterC extends EnglishCharacter {

    public CharacterC() {
        simbol = 'C';
        width = 40;
        height = 50;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + simbol + " Width = " + width + " Height = " + height);
    }

}
