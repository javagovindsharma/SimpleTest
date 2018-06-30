package codingchallenge.marsrover.inputparser;

import codingchallenge.marsrover.commands.CommandInterface;
import codingchallenge.marsrover.commands.MoveCommand;
import codingchallenge.marsrover.commands.RotateLeftCommand;
import codingchallenge.marsrover.commands.RotateRightCommand;

import java.util.*;

/**
 * Created by Govind on 29/06/2018
 */
public class InputCommandParser {
    public static final String BY_EACH_CHARACTER = "";
    public static final int START_INDEX = 1;

    private static Map<String, CommandInterface> stringToCommandMap = new HashMap<String, CommandInterface>() {{
        put("L", new RotateLeftCommand());
        put("R", new RotateRightCommand());
        put("M", new MoveCommand());
    }};

    private String commandString;

    public InputCommandParser(String commandString) {
        this.commandString = commandString;
    }

    public List<CommandInterface> toCommands() {
        if(isNullOrEmpty(commandString)) 
            return new ArrayList<CommandInterface>();
        return buildCommandsList(commandString);
    }

    private List<CommandInterface> buildCommandsList(String commandString) {
        List<CommandInterface> commands = new ArrayList<>();
        for(String commandCharacter : commandCharactersFrom(commandString)) {
            CommandInterface mappedCommand = lookupEquivalentCommand(commandCharacter.toUpperCase());
            commands.add(mappedCommand);
        }
        return commands;
    }

    private boolean isNullOrEmpty(String commandString) {
        return (null == commandString || commandString.trim().length() == 0);
    }

    private String[] commandCharactersFrom(final String commandString) {
        return Arrays.copyOfRange(commandString.split(BY_EACH_CHARACTER), START_INDEX, commandString.length() + 1);
    }

    private CommandInterface lookupEquivalentCommand(final String commandString) {
        return stringToCommandMap.get(commandString);
    }
}

