

public class Activity extends Action{

    public Activity(ActiveEntity entity, WorldModel world, ImageStore imageStore, int repeatCount){
        super(entity, world, imageStore, repeatCount);
    }

    public void executeAction(EventScheduler scheduler){
        this.getEntity().executeActivity(this.getWorld(), this.getImageStore(), scheduler);
    }
}
