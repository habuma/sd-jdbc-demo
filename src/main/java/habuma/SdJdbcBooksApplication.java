package habuma;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@SpringBootApplication
@EnableJdbcAuditing
public class SdJdbcBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdJdbcBooksApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner dataLoader(BookRepository repo) {
		return args -> {
			repo.save(new Book("1617294942", "Spring in Action, Fifth Edition", "Craig Walls"));
			repo.save(new Book("1617292540", "Spring Boot in Action", "Craig Walls"));
			repo.save(new Book("0312152906", "Knitting with Dog Hair", "Kendall Crolius"));
			repo.save(new Book("1594745250", "Crafting with Car Hair", "Kaori Tsutaya"));
		};
	}
}
