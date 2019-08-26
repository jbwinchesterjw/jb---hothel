package br.com.jb.hotel.dao;

import java.util.List;

import br.com.jb.hotel.domain.Quartos;

public interface IQuartosDao {
	
	void save(Quartos quartos);
	
	void update(Quartos quartos);
	
	void delete(Long id);
	
	Quartos findById(Long id);
	
	List<Quartos> findAll();
}
