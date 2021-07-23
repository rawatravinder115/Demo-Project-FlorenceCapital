package DemoProjectFlorenceCapital.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.reflect.GenericArrayType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Document(name=)
public class snacks {

    @Id
    private int id ;
    private  String snacks;
    private String shop;
    @Field("imageurl")
    private String image;

}
