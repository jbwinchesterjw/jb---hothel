package br.com.jb.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.jb.hotel.dao.IQuartosDao;
import br.com.jb.hotel.domain.Quartos;
@Service
@Transactional(readOnly = false)
public class QuartosServiceImpl implements IQuartosService {
	
	@Autowired
	private IQuartosDao dao;
	
	@Override
	public void salvar(Quartos quartos) {
		dao.save(quartos);
	}

	@Override
	public void editar(Quartos quartos) {
		dao.update(quartos);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Quartos buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Quartos> buscarTodos() {
		return dao.findAll();
	}

}
