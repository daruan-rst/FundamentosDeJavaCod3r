package n_JavaPersistenceAPI.teste.muitospramuitos;

import n_JavaPersistenceAPI.infra.DAO;
import n_JavaPersistenceAPI.modelo.muitospramuitos.Ator;
import n_JavaPersistenceAPI.modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilme {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);


        System.out.println(filmes.size());
        for (Filme filme : filmes){
            System.out.println(filme.getNome() + " => " + filme.getNota());

            for (Ator ator : filme.getAtores()){
                System.out.println(ator.getNome());
            }

        }
    }
}
