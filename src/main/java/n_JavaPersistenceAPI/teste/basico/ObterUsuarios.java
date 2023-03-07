package n_JavaPersistenceAPI.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import n_JavaPersistenceAPI.modelo.basico.Usuario;

import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

//        String jpql = "SELECT u FROM Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//        query.setMaxResults(5);
//
//        List<Usuario> usuarios = query.getResultList();

        List<Usuario> usuarios = em
                                .createQuery( "SELECT u FROM Usuario u", Usuario.class)
                                .setMaxResults(5)
                                .getResultList();

        for (Usuario usuario: usuarios) {
            System.out.println("ID: " + usuario.getId()
                    + "Email: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}
