package group.krill.artifact.controllers;

import group.krill.artifact.models.ClientModel;
import group.krill.artifact.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping()
    public ArrayList<ClientModel> GetAll(){
        return clientService.GetAll();
    }

    @PostMapping()
    public ClientModel Save(@RequestBody ClientModel data) {
        System.out.println(data);
        return clientService.Create(data);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientModel> GetById(@PathVariable("id") String id){
        return clientService.GetById(id);
    }
}
