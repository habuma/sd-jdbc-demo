package habuma;

import java.time.Instant;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
public class Book {

	@Id
	private Long id;
	private final String isbn;
	private final String title;
	private final String author;
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	private Instant createdDate;
	
	@LastModifiedBy
	private String updatedBy;
	
	@LastModifiedDate
	private Instant updatedDate;
}
