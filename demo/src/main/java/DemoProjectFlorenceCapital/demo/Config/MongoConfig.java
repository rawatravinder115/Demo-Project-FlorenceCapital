package DemoProjectFlorenceCapital.demo.Config;

import  com.mongodb.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

//    @Value("${spring.data.mongo.client.uri:mongodb://localhost:27017/Store}")
//    public String mongoURI;
//
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() throw UnknownHOstExpection{
//
////        MongoClient mongoClient = new MongoClient("127.0.0.1:27017");
////        return new SimpleMongoDbFactory(mongoClient, "Store" );
//
//        return new SimpleMongoDbFactory(new MongoClientURI(mongoURI));
//}
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoDbFactory());
//    }

//    @Autowired
//    private Environment env;
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() {
//        return new SimpleMongoDbFactory(new MongoClientURI(env.getProperty("spring.data.mongodb.uri")));
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
//
//        return mongoTemplate;
//
//    }
}



