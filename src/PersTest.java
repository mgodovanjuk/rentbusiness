import com.rentbusiness.entity.Address;
import com.rentbusiness.entity.User;
import com.rentbusiness.entity.UserDescription;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Mykhailo_Hodovaniuk on 12/2/13.
 */
public class PersTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PostgreSQLPU");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        //manager.persist(new User("1","1",new UserDescription("1","1","1",new Address("1","1","1","1"),"1", user)));
        transaction.commit();
        manager.close();
        factory.close();
    }
}
