package website.yuchen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import website.yuchen.model.UserBean;
import website.yuchen.service.UserService;

import java.util.List;

@Controller
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping
    public String display(Model model)
    {
        List<UserBean> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "index";
    }

    @RequestMapping("addPage")
    public String add() {
        return "addPage";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(UserBean user) {
        userService.insert(user);
        return "redirect:index";
    }

    @RequestMapping("deletePage")
    public String delete() {
        return "deletePage";
    }
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String delete(Integer id) {
        userService.deleteById(id);
        return "redirect:index";
    }
}