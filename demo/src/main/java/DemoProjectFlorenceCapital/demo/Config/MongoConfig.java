//package DemoProjectFlorenceCapital.demo.Config;
//
//import com.mongodb.client.MongoClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@Configuration
//public class MongoConfig {
//
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
//}
//
//
//
