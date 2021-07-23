package DemoProjectFlorenceCapital.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/products")
    public  Product(){
        
    }
}
