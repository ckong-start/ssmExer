package exer1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void updateBook() {
		System.out.println("bookDao执行了");
		jdbcTemplate.update("update book set `name` = '图书表被修改了~~'");
	}
}
