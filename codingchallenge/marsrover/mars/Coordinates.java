package codingchallenge.marsrover.mars;

/**
 * Created by Govind on 29/06/2018
 */
public class Coordinates {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Coordinates newCoordinatesFor(int xCoordinateStepValue, int yCoordinateStepValue){
        return new Coordinates(this.xCoordinate + xCoordinateStepValue, this.yCoordinate + yCoordinateStepValue);
    }


    @Override
    public String toString() {
        StringBuffer coordinateOutput = new StringBuffer();
        coordinateOutput.append(xCoordinate);
        coordinateOutput.append(" ");
        coordinateOutput.append(yCoordinate);
        return coordinateOutput.toString();
    }

    public boolean hasWithinBounds(Coordinates coordinates){
        return isXCoordinateWithinBounds(coordinates.xCoordinate)
                && isYCoordinateWithinBounds(coordinates.yCoordinate);
    }

    public boolean hasOutsideBounds(Coordinates coordinates){
        return isXCoordinateInOutsideBounds(coordinates.xCoordinate)
                && isYCoordinateInOutsideBounds(coordinates.yCoordinate);
    }

    private boolean isXCoordinateInOutsideBounds(final int xCoordinate) {
        return xCoordinate >= this.xCoordinate;
    }

    private boolean isYCoordinateInOutsideBounds(final int yCoordinate) {
        return yCoordinate >= this.yCoordinate;
    }

    private boolean isYCoordinateWithinBounds(final int yCoordinate) {
        return yCoordinate <= this.yCoordinate;
    }

    private boolean isXCoordinateWithinBounds(final int xCoordinate) {
        return xCoordinate <= this.xCoordinate;
    }

    public Coordinates newCoordinatesForStepSize(final int xCoordinateStepValue, final int yCoordinateStepValue) {
        return new Coordinates(xCoordinate+xCoordinateStepValue, yCoordinate+yCoordinateStepValue);
    }
}
