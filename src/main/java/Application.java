import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Application {

	@Value("${rest.name}")
	private String name;

	@Value("${rest.suffix}")
	private String suffixFromCLI;

	@RequestMapping("/")
	public String home() {
		return "Hello from " + name + "! " + suffixFromCLI;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
