package structural.composite;

/** Client */
public class Test {

    public static void main(String[] args) {
        // Initialize four ellipses
        Ellipse ellipse = new Ellipse();
        Rectangle rectangle = new Rectangle();

        // Initialize three composite graphics
        Composite graphic = new Composite(new Rectangle(),new Composite(new Ellipse()),new Composite());
        Composite graphic1 = new Composite();

        // Composes the graphics
        graphic.add(ellipse);
        graphic1.add(rectangle);
        graphic.add(graphic1);

        // Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
    }
}