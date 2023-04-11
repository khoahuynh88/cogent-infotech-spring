package cogent.infotech.crudexe.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cogent.infotech.crudexe.dto.Book;

public class BookMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int rownumber) throws SQLException {  
        Book e=new Book();  
        e.setId(rs.getInt("id"));  
        e.setName(rs.getString("name"));  
        e.setPrice(rs.getInt("price"));  
        return e;  
    }  
}
