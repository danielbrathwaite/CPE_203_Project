import processing.core.PImage;

import java.util.List;

public class Obstacle extends ActiveEntity{

    public Obstacle(String id, Point position, List<PImage> images, double actionPeriod, double animationPeriod){
        super(id, position, images, actionPeriod, animationPeriod);
    }

    @Override
    public void executeActivity(WorldModel world, ImageStore imageStore, EventScheduler scheduler) {
        throw new UnsupportedOperationException("Invalid function for type Obstacle : executeActivity");
    }

    @Override
    public void scheduleActions(EventScheduler scheduler, WorldModel world, ImageStore imageStore) {
        scheduler.scheduleEvent(this, createAnimationAction(0), this.getAnimationPeriod());
    }
}
