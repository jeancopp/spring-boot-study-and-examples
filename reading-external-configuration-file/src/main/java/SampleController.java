import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	public String value;
	
    @RequestMapping("/")
    public @ResponseBody String readValue() {
        return "Value: " + value;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
    
    @Value("${test:NOT_FOUND}")
    public void setTesteValue(String value){
    	System.out.println("Value:'" + value +"'");
    	this.value = value;
    }
}