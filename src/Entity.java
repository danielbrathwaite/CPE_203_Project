import java.util.*;

import processing.core.PImage;

/**
 * An entity that exists in the world. See EntityKind for the
 * different kinds of entities that exist.
 */
public abstract class Entity {

    private String id;
    private Point position;
    private List<PImage> images;
    private int imageIndex;


    public Entity(String id, Point position, List<PImage> images) {
        this.id = id;
        this.position = position;
        this.images = images;
        this.imageIndex = 0;
    }

    /**
     * Helper method for testing. Preserve this functionality while refactoring.
     */
    public String log(){
        return this.id.isEmpty() ? null :
                String.format("%s %d %d %d", this.id, this.position.x, this.position.y, this.imageIndex);
    }



    public void nextImage() {
        this.imageIndex = this.imageIndex + 1;
    }

    public List<PImage> getImages(){return this.images;}

    public PImage getCurrentImage() {
        return this.images.get(this.imageIndex % this.images.size());
    }

    public String getId(){
        return this.id;
    }

    public Point getPosition(){
        return this.position;
    }

    public void setPosition(Point p){
        this.position = p;
    }
}
