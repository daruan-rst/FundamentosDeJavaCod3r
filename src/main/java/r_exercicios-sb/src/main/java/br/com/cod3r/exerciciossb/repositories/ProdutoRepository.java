package br.com.cod3r.exerciciossb.repositories;

import br.com.cod3r.exerciciossb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
}
