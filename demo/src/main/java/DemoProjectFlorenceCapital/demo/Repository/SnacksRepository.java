package DemoProjectFlorenceCapital.demo.Repository;

import DemoProjectFlorenceCapital.demo.Entity.snacks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnacksRepository extends MongoRepository<snacks,String> {
}
