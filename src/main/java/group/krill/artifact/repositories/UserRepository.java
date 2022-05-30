package group.krill.artifact.repositories;

import group.krill.artifact.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, String> {
    //public abstract ArrayList<ClientModel> findByFirstName(String FirstName);
}
