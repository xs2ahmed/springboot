package ahmed.com.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IAmController {

    @GetMapping("/hello")
    public String hello()
    {
       System.out.println("Hello there...hello I got hit but not in the debugger");
       return "Hello World";
    }
}
