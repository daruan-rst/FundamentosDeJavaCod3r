package n_JavaPersistenceAPI.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import n_JavaPersistenceAPI.modelo.basico.Usuario;

public class AlterarUsuario3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        em.detach(usuario); // -> detach tira um objeto do estado transicional
        usuario.setNome("Leonardo Leitao");

//        em.merge(usuario); // se esta linha for descomentada, o usuário voltará para o contexto transacional para a execução do merge.

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
