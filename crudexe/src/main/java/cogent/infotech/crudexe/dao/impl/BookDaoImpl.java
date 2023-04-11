package cogent.infotech.crudexe.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import cogent.infotech.crudexe.dao.BookDao;
import cogent.infotech.crudexe.dto.Book;
import cogent.infotech.crudexe.mapper.BookMapper;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int create(Book book) {
		// TODO Auto-generated method stub
		String sql="insert into book values(?,?,?)";
		int result = jdbcTemplate.update(sql,book.getId(),book.getName(),book.getPrice());
		return result;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		String sql= "update book set  name=?, price=? where id=?";
		int result=jdbcTemplate.update(sql, book.getName(),book.getPrice(),book.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from book where id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public List<Book> readid(int id) {
		// TODO Auto-generated method stub
		String sql="select * from book where id=?";
		BookMapper rowmapper= new BookMapper();
		List<Book> book= jdbcTemplate.query(sql, rowmapper,id);
		return book;
	}

	@Override
	public List<Book> read() {
		// TODO Auto-generated method stub
		String sql ="select * from book";
		BookMapper rowmapper = new BookMapper();
		List<Book> result=jdbcTemplate.query(sql, rowmapper);
		return result;
	}

	 
}
