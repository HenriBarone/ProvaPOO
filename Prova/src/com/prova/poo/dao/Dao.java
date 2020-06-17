package com.prova.poo.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
	
	Optional<T> buscar(long id);

	List<T> buscarTodos();

	void Salvar(T t);

	void atualizar(T t, String[] params);

	void deletar(T t);

}
