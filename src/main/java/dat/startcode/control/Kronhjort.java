package dat.startcode.control;

import dat.startcode.model.exceptions.DatabaseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Kronhjort extends Command
{


    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException
    {
        String tid = LocalTime.now().toString();
        request.setAttribute("tid", tid);


        return "Kronhjort";
    }
}
