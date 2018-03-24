package com.liveconnector.core.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by korlend on 14.12.2017.
 */
@Controller
@RequestMapping("/users")
public class UsersServlet {

    @RequestMapping("/getAll")
    public List<String> getAllUsers() {
        List<String> bla = new ArrayList<>();
        bla.add("dimka");
        bla.add("korlend");
        return bla;
    }
}
