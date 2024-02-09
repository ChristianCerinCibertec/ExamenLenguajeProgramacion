package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Subject;

public class SubjectDaoImpl implements SubjectDao {
	
	EntityManagerFactory factory;
	EntityManager em;
	
public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("CasoPracticoLaboratorio01");
		em = factory.createEntityManager();	
	}
	@Override
	public void create(Subject subject) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();
	}
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.merge(subject);
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
		}
	}
	@Override
	public void delete(Subject subject) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(subject);
		em.getTransaction().commit();
	}
	@Override
	public Subject find(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Subject.class, id);
	}
	@Override
	public List<Subject> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery("subject.findAll");
		List<Subject> lista = query.getResultList();
		
		return lista;
	}

}
