package behavioral.template_method;

public class Test {
    public static void main(String[] args) {
        MyExtractor myExtractor = new MyExtractor();
        myExtractor.extractOne(new Character('A'));
        myExtractor.extractAll("Hello");
    }
}
