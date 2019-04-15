package com.group51.beltline;

import com.group51.beltline.models.User;
import com.group51.beltline.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping
public class RESTController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/users") // Map ONLY GET Requests
    public @ResponseBody
    Collection<User> getUsers(){
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        return userRepository.getAllUsers();
    }

    @GetMapping(path = "/users/{username}") // Map ONLY GET Requests
    public @ResponseBody
    User getOneUser(@PathVariable(value="username") String username){
        return userRepository.getOneUser(username);
    }







}
