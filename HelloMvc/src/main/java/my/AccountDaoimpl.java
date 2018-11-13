package my;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public class AccountDaoimpl implements AccountDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		em.persist(e);
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, id);
	}
	@Override
	public Employee update(int id) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, id);
	}

}
