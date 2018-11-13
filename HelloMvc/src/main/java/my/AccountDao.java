package my;

import org.springframework.transaction.annotation.Transactional;

public interface AccountDao {
	@Transactional
	public void save(Employee e);
	@Transactional
	public Employee read(int id);
	@Transactional
	Employee update(int id);
}
