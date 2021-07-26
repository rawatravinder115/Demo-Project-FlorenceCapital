package DemoProjectFlorenceCapital.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="snacks")
public class snacks {

    @Id
    private String id ;
    private  String snacks;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String price;
    private String shop;
    @Field("imageurl")
    private String image;

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public snacks() {
    }

    public snacks(String snacks, String price, String shop, String image) {
        this.snacks = snacks;
        this.price = price;
        this.shop = shop;
        this.image = image;
    }

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
