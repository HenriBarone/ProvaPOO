package com.prova.poo.teste;

import java.util.Optional;
import java.util.Scanner;

import com.prova.poo.dao.Dao;
import com.prova.poo.dao.ExamesDao;
import com.prova.poo.entidades.Exames;

public class TesteMain {

	private static Dao<Exames> examesDao;

	public static void main(String[] args) {

		examesDao = new ExamesDao();

		while (true) {
			System.out.println("______________________________");
			System.out.println("| OP  | Entidade |   A��o    | ");
			System.out.println("|  1  |  Exame	 | Cadastrar | ");
			System.out.println("|  2  |  Exame	 | Alterar   | ");
			System.out.println("|  3  |  Exame	 | Remover   | ");
			System.out.println("|  4  |  Exame	 | Listar    | ");
			System.out.println("|  5  |       Finalizar      | ");
			System.out.println("_____________________________");

			System.out.println("- Escolha uma das op��o acima -");
			System.out.println("_____________________________");

			int op = 0;
			Scanner opUser = new Scanner(System.in);

			try {
				op = opUser.nextInt();
			} catch (Exception e) {
				System.out.println("Favor escolher umas das op��o que esta listada no menu '1 ,2 ,3 ,4 ,5 '");
				System.exit(0);
			}

			switch (op) {

			case 1:
				System.out.println("Favor informar o 'Nome' do exame: ");
				String nome = opUser.next();

				System.out.println("Favor informar o 'Metodo' do exame: ");
				String metodo = opUser.next();

				System.out.println("Favor informar o 'Resultados' do exame: ");
				String resultado = opUser.next();

				System.out.println("Favor informar o 'Paciente' do exame: ");
				String paciente = opUser.next();

				System.out.println("Favor informar o 'Doutor' do exame: ");
				String doutor = opUser.next();

				Exames exame = new Exames(nome, metodo, resultado, paciente, doutor);
				examesDao.Salvar(exame);

				break;

			case 2:
				System.out.println("Informe o codigo do exame que deseja alterar");
				long idAlt = opUser.nextLong();
				Optional<Exames> exameAlt = examesDao.buscar(idAlt);

				System.out.println("Favor informar o 'Nome' do exame que ser� alterado: ");
				String nomeAlt = opUser.next();

				System.out.println("Favor informar o 'Metodo' do exame que ser� alterado: ");
				String metodoAlt = opUser.next();

				System.out.println("Favor informar o 'Resultados' do exame que ser� alterado: ");
				String resultadoAlt = opUser.next();

				System.out.println("Favor informar o 'Paciente' do exame que ser� alterado: ");
				String pacienteAlt = opUser.next();

				System.out.println("Favor informar o 'Doutor' do exame que ser� alterado: ");
				String doutorAlt = opUser.next();

				examesDao.atualizar(exameAlt.get(),
						new String[] { nomeAlt, metodoAlt, resultadoAlt, pacienteAlt, doutorAlt });
				break;

			case 3:
				System.out.println("Informe o codigo do exame que deseja remover");
				long idDell = opUser.nextLong();
				Optional<Exames> exameDell = examesDao.buscar(idDell);

				examesDao.deletar(exameDell.get());
				break;

			case 4:
				examesDao.buscarTodos()
						.forEach(exameList -> System.out.println(
								exameList.getNome() + " | " + exameList.getMetodo() + " | " + exameList.getResultado()
										+ " | " + exameList.getPaciente() + " | " + exameList.getDoutor()));
				break;

			case 5:
				System.out.println("Sistema finalizado");
				System.exit(0);
				break;

			default:
				System.out.println("N�o foi possivel encontrar a op��o desejada");

			}

			System.out.println("Deseja continuar? [S] ou [N] ");
			String op2 = opUser.next();

			if (op2.equals("N") || op2.equals("n")) {
				System.out.println("Sistema Finalizado");
				System.exit(0);
			}

		}

	}
}
