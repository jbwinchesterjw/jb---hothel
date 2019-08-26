package br.com.jb.hotel.service;

import java.util.List;

import br.com.jb.hotel.domain.Quartos;

public interface IQuartosService {
	
	void salvar(Quartos quartos);
	
	void editar(Quartos quartos);
	
	void excluir(Long id);
	Quartos buscarPorId(Long id);
	
	List<Quartos> buscarTodos();
	
	
}
