package codingchallenge.marsrover.commands;

import codingchallenge.marsrover.MarsRover;

/**
 * Created by Govind on 29/06/2018
 */
public class RotateLeftCommand implements CommandInterface {
    @Override
    public void execute(MarsRover rover) {
        rover.rotateLeft();
    }
}
