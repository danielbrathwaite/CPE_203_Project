/**
 * An action that can be taken by an entity
 */
public abstract class Action {
    private ActiveEntity entity;
    private WorldModel world;
    private ImageStore imageStore;
    private int repeatCount;

    public Action(ActiveEntity entity, WorldModel world, ImageStore imageStore, int repeatCount) {
        this.entity = entity;
        this.world = world;
        this.imageStore = imageStore;
        this.repeatCount = repeatCount;
    }

    public abstract void executeAction(EventScheduler scheduler);

    public int getRepeatCount(){
        return this.repeatCount;
    }

    public ActiveEntity getEntity() {
        return entity;
    }

    public WorldModel getWorld(){
        return this.world;
    }

    public ImageStore getImageStore(){
        return this.imageStore;
    }
}
