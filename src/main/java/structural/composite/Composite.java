package structural.composite;

import java.util.ArrayList;
import java.util.List;

/** "Composite" */
class Composite implements Graphic {
    // Collection of child graphics.
    private List<Graphic> graphics;
    
    public Composite(Graphic... graphics){
        this.graphics = new ArrayList<Graphic>();
        for(Graphic graphic : graphics){
            this.graphics.add((graphic));
        }        
    }

    // Prints the graphic.
    @Override
    public void print() {
        for (Graphic graphic : graphics) {
            graphic.print();
        }        
    }

    // Adds the graphic to the composition.
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    // Removes the graphic from the composition.
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }
}
