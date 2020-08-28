package mavanjpa;
import javax.persistence.*;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Carlos");
		Persona p = new Persona();
		p.setId(21);
		p.setName("Carlos");
		p.setLastname("Guerra");
		p.setEmail("asdfasjdjad");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mavanjpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println(p.toString());
	}

}
