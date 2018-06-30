package codingchallenge.marsrover;

import codingchallenge.marsrover.commands.CommandInterface;
import codingchallenge.marsrover.inputparser.InputCommandParser;
import codingchallenge.marsrover.mars.Coordinates;
import codingchallenge.marsrover.mars.Direction;
import codingchallenge.marsrover.mars.Plateau;

import java.util.List;

/**
 * Created by Govind on 29/06/2018
 */
public class MarsRover {
    private Coordinates currentCoordinates;
    private Direction currentDirection;
    private Plateau plateau;

    public MarsRover(Coordinates currentCoordinates, Direction currentDirection, Plateau plateau) {
        this.currentCoordinates = currentCoordinates;
        this.currentDirection = currentDirection;
        this.plateau = plateau;
    }

    public void run(String commandString){
        List<CommandInterface> roverCommands = new InputCommandParser(commandString).toCommands();
        for(CommandInterface command : roverCommands)
            command.execute(this);

    }

    public String currentLocation(){
        return currentCoordinates.toString() + " " + currentDirection.toString();
    }

    public void rotateLeft(){
        this.currentDirection = this.currentDirection.left();
    }
    public void rotateRight(){
        this.currentDirection = this.currentDirection.right();
    }

    public void move(){
        Coordinates positionAfterMove = currentCoordinates.newCoordinatesForStepSize(currentDirection.stepSizeForXAxis(),
                currentDirection.stepSizeForYAxis());
        if(plateau.hasWithinBounds(positionAfterMove))
            currentCoordinates = currentCoordinates.newCoordinatesFor(currentDirection.stepSizeForXAxis(),
                    currentDirection.stepSizeForYAxis());
    }
}


