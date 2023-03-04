package n_JavaPersistenceAPI.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import n_JavaPersistenceAPI.modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}


