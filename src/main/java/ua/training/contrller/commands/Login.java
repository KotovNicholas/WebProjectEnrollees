package ua.training.controller.commands;

import ua.training.model.entities.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/**
 * Created by user on 28.01.2017.
 */
public class Login implements Command {
    public static final String PARAM_LOGIN = "login";

    public static final String PARAM_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String pageToGo = "page/mainpage.jsp";
        String email = request.getParameter(PARAM_LOGIN);
        String password = request.getParameter(PARAM_PASSWORD);

        if (email != null && password != null) {
            Optional<User> user;
//            user = UserService.login(email, password);
//
//            if (User.isPresent()) {
//                request.getSession().setAttribute("user", user.get());
//                pageToGo = "page/userpage.jsp";
//            }
        }
        return pageToGo;
    }
}
