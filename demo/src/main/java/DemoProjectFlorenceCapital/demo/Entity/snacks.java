package DemoProjectFlorenceCapital.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collation="snacks")
public class snacks {

    @Id
    private String id ;
    private  String snacks;
    private String shop;
    @Field("imageurl")
    private String image;

    @Override
    public String toString() {
        return "snacks{" +
                "id='" + id + '\'' +
                ", snacks='" + snacks + '\'' +
                ", shop='" + shop + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
