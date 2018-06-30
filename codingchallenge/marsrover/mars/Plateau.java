package codingchallenge.marsrover.mars;

/**
 * Created by Govind on 29/06/2018
 */
public class Plateau {
    private Coordinates topRightCoordinates = new Coordinates(0, 0);
    private Coordinates bottomLeftCoordinates = new Coordinates(0, 0);

    public Plateau(int topRightXCoordinate, int topRightYCoordinate) {
       this.topRightCoordinates = this.topRightCoordinates.newCoordinatesFor(topRightXCoordinate, topRightYCoordinate);
    }

    public boolean hasWithinBounds(final Coordinates coordinates) {
        return this.bottomLeftCoordinates.hasOutsideBounds(coordinates) && this.topRightCoordinates.hasWithinBounds(coordinates);
    }
}
