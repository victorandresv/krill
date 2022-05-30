package group.krill.artifact.repositories;

import group.krill.artifact.models.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, String> {
    //public abstract ArrayList<ClientModel> findByFirstName(String FirstName);
}
