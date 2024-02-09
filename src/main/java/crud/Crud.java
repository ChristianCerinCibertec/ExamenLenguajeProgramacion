package crud;
import java.util.List;
import daos.SubjectDao;
import daos.SubjectDaoImpl;

import model.Subject;

public class Crud {
	public static void main(String[] args) {
		SubjectDao dao = new SubjectDaoImpl();
		Listar(dao);
		//Registrar(dao,"Ignacio Renteria","1526");
		//Encontrar(dao,2);
		//Editar(dao,2,"Maria Yolanda","5554");
		//Eliminar(dao,4);
	}
	public static void imprimir_linea(Subject s) {
		
		System.out.println(s.getIdsubject());
    	System.out.println(s.getSubject());
    	System.out.println(s.getCredits());
	}
	public static void Listar(SubjectDao sub) {
		 		
		List<Subject> subList = sub.findAll();
		for(Subject s:subList) {
			imprimir_linea(s);
	}
	}
	public static void Encontrar(SubjectDao dao, int id) {
		Subject sub = dao.find(id);
		imprimir_linea(sub);			
	}
	public static void Registrar(SubjectDao dao, String Subject,String Credits) {
		Subject sub = new Subject();
		sub.setSubject(Subject);
		sub.setCredits(Credits);
		dao.create(sub);
		Listar(dao);	
	}
	
	public static void Editar(SubjectDao dao,int idsubject,String subject, String credits) {
		Subject sub = new Subject();
		sub.setIdsubject(idsubject);
		sub.setSubject(subject);
		sub.setCredits(credits);	 	
    	dao.update(sub);
    	Listar(dao);
	}
	public static void Eliminar(SubjectDao dao, int id) {
		
		Subject sub = dao.find(id);
		dao.delete(sub);
		Listar(dao);		
	}						
}
