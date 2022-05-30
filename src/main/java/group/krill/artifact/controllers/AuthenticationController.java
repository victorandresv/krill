package group.krill.artifact.controllers;

import group.krill.artifact.libraries.TokenService;
import group.krill.artifact.models.AuthenticationModel;
import group.krill.artifact.models.TokenModel;
import group.krill.artifact.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {
    @Autowired
    AuthenticationService authenticationService;

    @GetMapping()
    public ArrayList<AuthenticationModel> GetAll(){
        return authenticationService.GetAll();
    }

    @PostMapping()
    public AuthenticationModel Save(@RequestBody AuthenticationModel data) {
        return authenticationService.Create(data);
    }

    @GetMapping(path = "/{id}")
    public Optional<AuthenticationModel> GetById(@PathVariable("id") Long id){
        return authenticationService.GetById(id);
    }

    @PostMapping(path = "/signin")
    public TokenModel Signin(@RequestBody AuthenticationModel data){
        AuthenticationModel authenticationModel = authenticationService.Signin(data.getUser(), data.getPass());
        try {
            if(authenticationModel.getId() > 0){
                TokenService tokenService = new TokenService();
                String token = tokenService.CreateToken(authenticationModel.getId());
                return new TokenModel(token, true, null);
            } else {
                return new TokenModel("", false, "Signin incorrect");
            }
        } catch (Exception error) {
            return new TokenModel("", false, error.getMessage());
        }
    }
}
