package group.krill.artifact.services;

import group.krill.artifact.models.ClientModel;
import group.krill.artifact.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ArrayList<ClientModel> GetAll(){
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }

    public ClientModel Create(ClientModel data){
        return  clientRepository.save(data);
    }

    public Optional<ClientModel> GetById(String id){
        return clientRepository.findById(id);
    }

}
