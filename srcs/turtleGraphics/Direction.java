package turtleGraphics;

public enum Direction {

    NORTH,
    EAST,
    SOUTH,
    WEST;

    private Direction right;

    static {
        NORTH.right = EAST;
        EAST.right = SOUTH;
        SOUTH.right = WEST;
        WEST.right = NORTH;
    }

    public Direction turnRight() {
        return right;
    }






}
