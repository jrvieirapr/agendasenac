package br.senac.pr.agendaSenac.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.pr.agendaSenac.entities.Funcionario;
import br.senac.pr.agendaSenac.enums.SetorEnum;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	List<Funcionario> findBySetor(SetorEnum setor);

	List<Funcionario> findByName(String name);
}
