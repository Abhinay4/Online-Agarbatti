package mb.abhi.agarbattibackend.dao;

import java.util.List;

import mb.abhi.agarbattibackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();

	Category get(int id); 		
}
 