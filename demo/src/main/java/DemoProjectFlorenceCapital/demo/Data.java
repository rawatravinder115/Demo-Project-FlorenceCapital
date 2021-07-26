package DemoProjectFlorenceCapital.demo;

import DemoProjectFlorenceCapital.demo.Entity.snacks;
import DemoProjectFlorenceCapital.demo.Repository.SnacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Data {

    private SnacksRepository repository;

    @Bean
    public void addData() throws  Exception{

        try{
            repository.deleteAll();
            snacks s1 = new snacks("Namkeen", "40", "Kamlesh Bhandar", "http://www.kamlesh.com");
            snacks s2 = new snacks("Kurkure", "20", "Rishu", "http://www.rishu.com");
            snacks s3 = new snacks("diamond", "20", "shub", "http://www.shub.com");

            repository.save(s1);
            repository.save(s2);
            repository.save(s3);


        }catch(Exception e){
            e.printStackTrace();        }
    }
}
