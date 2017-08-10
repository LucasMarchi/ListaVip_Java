package br.com.alura.listavip.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavip.models.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
