package com.sena.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.ecommerce.model.Orden;
import com.sena.ecommerce.model.Usuario;

import java.util.List;


@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario(Usuario usuario);

}
