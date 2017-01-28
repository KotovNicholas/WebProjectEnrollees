package ua.training.controller.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 28.01.2017.
 */
public interface Command {
    String execute(HttpServletRequest request,
                   HttpServletResponse response)
            throws ServletException, IOException;
}
