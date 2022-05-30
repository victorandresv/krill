package group.krill.artifact.services;

import group.krill.artifact.models.AuthenticationModel;
import group.krill.artifact.models.ClientModel;
import group.krill.artifact.repositories.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AuthenticationService {
    @Autowired
    AuthenticationRepository authenticationRepository;

    public AuthenticationModel Create(AuthenticationModel data){
        return  authenticationRepository.save(data);
    }

    public ArrayList<AuthenticationModel> GetAll(){
        return (ArrayList<AuthenticationModel>) authenticationRepository.findAll();
    }

    public Optional<AuthenticationModel> GetById(Long id){
        return authenticationRepository.findById(id);
    }

    public AuthenticationModel Signin(String user, String pass){
        return authenticationRepository.findByUserAndPass(user, pass);
    }
}
