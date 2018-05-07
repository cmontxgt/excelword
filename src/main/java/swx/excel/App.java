package swx.excel;

import com.spring4all.mongodb.EnableMongoPlus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Smconf程序启动入口<br>
 * simple manage conf 
 * @author yinjihuan
 */
@EnableMongoPlus
@SpringBootApplication
@ServletComponentScan
public class App extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
}
