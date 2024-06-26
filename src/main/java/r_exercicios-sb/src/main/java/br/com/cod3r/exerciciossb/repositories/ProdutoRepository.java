package br.com.cod3r.exerciciossb.repositories;

import br.com.cod3r.exerciciossb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
