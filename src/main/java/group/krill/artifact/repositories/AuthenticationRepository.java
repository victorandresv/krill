package group.krill.artifact.repositories;

import group.krill.artifact.models.AuthenticationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AuthenticationRepository extends CrudRepository<AuthenticationModel, Long> {
    public abstract AuthenticationModel findByUserAndPass(String user, String pass);
}
