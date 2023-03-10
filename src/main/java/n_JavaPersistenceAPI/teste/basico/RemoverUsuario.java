package n_JavaPersistenceAPI.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import n_JavaPersistenceAPI.modelo.basico.Usuario;

public class RemoverUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();


        Usuario usuario = em.find(Usuario.class, 8L);

        if (usuario != null){
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }
        
        em.close();
        emf.close();
    }
}
