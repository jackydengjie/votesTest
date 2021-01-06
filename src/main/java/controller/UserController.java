package controller;

import dao.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/user")
public class UserController {
    private  static Logger log= LoggerFactory.getLogger(UserController.class);
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("uid"));
        System.out.println("userId:"+userId);
        User user=null;
        if(userId==1){
            user = new User();
            user.setUname("kill");
            user.setPwd("123");
        }
        log.debug(user.toString());
        /*model.addAllAttributes("user", user);*/

        return "index";

    }
}
