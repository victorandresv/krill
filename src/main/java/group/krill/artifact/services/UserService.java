package group.krill.artifact.services;

import group.krill.artifact.models.UserModel;
import group.krill.artifact.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public ArrayList<UserModel> GetAll(){
        return (ArrayList<UserModel>) repository.findAll();
    }

    public UserModel Create(UserModel data){
        return  repository.save(data);
    }

    public Optional<UserModel> GetById(String id){
        return repository.findById(id);
    }

}
