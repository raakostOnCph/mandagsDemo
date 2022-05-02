package dat.startcode.control;

import dat.startcode.model.exceptions.DatabaseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

abstract class Command
{

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("login", new Login());
        commands.put("logout", new Logout());
        commands.put("about", new About());
        commands.put("kronhjort", new Kronhjort());
        commands.put("timmi", new Timmi());
        commands.put("march", new March());
        commands.put("otto", new Otto());
        commands.put("fiskbak", new Fiskbak());
        commands.put("brandt", new Brandt());
        commands.put("otto", new Ballok());
    }

    static Command from( HttpServletRequest request ) {

        if ( commands == null ) {
            initCommands();
        }

        String commandName = request.getParameter( "command" );

        return commands.getOrDefault(commandName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws DatabaseException;

}
