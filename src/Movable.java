public interface Movable {

    public boolean moveTo(WorldModel world, Entity target, EventScheduler scheduler);

    public Point nextPosition(WorldModel world, Point destPos);
}
