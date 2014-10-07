package behavioral.template_method;


public class MyExtractor extends Extractor<String> {

    @Override
    public String extractOne(Character character) {
        return character.toString();
    }
}
