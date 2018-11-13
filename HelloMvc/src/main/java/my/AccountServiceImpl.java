package my;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

public class AccountServiceImpl implements AccountService {

	AccountDao accountDao;
	
	
	public AccountServiceImpl(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}


	@Override
	public String newRecord(@Valid Employee e ,  BindingResult result) {
		// TODO Auto-generated method stub
		if(result.hasErrors()) {
			
			return "ERROR";
		}
		accountDao.save(e);
		return "SUCCESS";
	}


	@Override
	public Employee readTable(int id) {
		// TODO Auto-generated method stub
		Employee e=accountDao.read(id);
		if(e==null)
		{
			throw new ArithmeticException();
		}
		
		return e;
	}

}
