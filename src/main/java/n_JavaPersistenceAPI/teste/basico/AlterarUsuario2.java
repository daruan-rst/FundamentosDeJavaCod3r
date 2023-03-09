package n_JavaPersistenceAPI.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import n_JavaPersistenceAPI.modelo.basico.Usuario;

public class AlterarUsuario2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Leonardo Alterado");

//        em.merge(usuario);
        /**
         * As alterações no banco de dados ainda assim serão atualizadas.
         * Quando o find e as alterações no usuário na linha 17 foram
         * executado dentro do contexto transacional (já que
         * em.getTransaction().commit(); ainda não havia sido chamado)
         * e, como as alterações dentro do contexto são sempre sincronizadas com o banco,
         * ainda que em.merge(usuário); não tenha sido executado, as alterações ainda assim poderão
         * ser observadas no banco de dados.
         */

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
