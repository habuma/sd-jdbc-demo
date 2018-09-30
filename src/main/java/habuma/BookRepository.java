package habuma;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

	@Query("select id, isbn, title, author from Book where author=:author")
	Iterable<Book> findByAuthor(String author);
	
}
