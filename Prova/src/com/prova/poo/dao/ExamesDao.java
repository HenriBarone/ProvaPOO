package com.prova.poo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.prova.poo.entidades.Exames;

public class ExamesDao implements Dao<Exames> {

	public List<Exames> exames = new ArrayList();

	public ExamesDao() {
		exames.add((new Exames("Hemograma", "Exame de Sangue", "Normal", "Pedro", "João The Doctor")));
	}

	@Override
	public Optional<Exames> buscar(long id) {
		return Optional.ofNullable(exames.get((int) id));
	}

	@Override
	public List<Exames> buscarTodos() {
		return exames;
	}

	@Override
	public void Salvar(Exames t) {
		exames.add(t);

	}

	@Override
	public void atualizar(Exames t, String[] params) {
		t.setNome(Objects.requireNonNull(params[0], "Favor Preencher o 'Nome' do exame"));
		t.setMetodo(Objects.requireNonNull(params[1], "Favor Preencher o 'Metodo' do exame"));
		t.setResultado(Objects.requireNonNull(params[2], "Favor Preencher o 'Resultado' do exame"));
		t.setPaciente(Objects.requireNonNull(params[3], "Favor Preencher o 'Paciente' do exame"));
		t.setDoutor(Objects.requireNonNull(params[4], "Favor Preencher o 'Doutor' do exame"));

	}

	@Override
	public void deletar(Exames t) {
		exames.remove(t);

	};

}
