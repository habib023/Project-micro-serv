package com.example.demo;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Produit;

@RepositoryRestResource
public interface Iproduitreposotory extends JpaRepository<Produit,Long> {

	@RepositoryRestResource
	public interface ProduitRepository extends JpaRepository<Produit, Long>{
		@Query("select p from Produit p where p.designation like:x")
		public Page<Produit>produitParMC(@Param("x")String mc, Pageable p);
		
		public List<Produit>	findByDesignation(String des);
		
		public Page<Produit> findByDesignation(String des, Pageable p);

	}

}
