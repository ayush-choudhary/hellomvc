package my;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

public interface AccountService {

	

	public String newRecord(@Valid Employee e, BindingResult result);
	
	public Employee readTable(int id);
}
