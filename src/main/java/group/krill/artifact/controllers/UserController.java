package group.krill.artifact.controllers;

import group.krill.artifact.models.UserModel;
import group.krill.artifact.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping()
    public ArrayList<UserModel> GetAll(){
        return service.GetAll();
    }

    @PostMapping()
    public UserModel Save(@RequestBody UserModel data) {
        System.out.println(data);
        return service.Create(data);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> GetById(@PathVariable("id") String id){
        return service.GetById(id);
    }
}
