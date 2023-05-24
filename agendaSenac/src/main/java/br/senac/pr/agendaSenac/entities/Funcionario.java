/**
 * 
 */
package br.senac.pr.agendaSenac.entities;

import java.io.Serializable;
import java.math.BigDecimal;



import br.senac.pr.agendaSenac.enums.SetorEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe do objeto Funcionario, deve ter os getters e setters...
 * @author Juliano Roque Vieira
 * @version 0.0.1
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 150, nullable = false, unique = true)
	private String email;
	
	@Column(length = 50, nullable = true)
	private String cargo;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal salario;
	
	@Enumerated(EnumType.STRING)
	private SetorEnum setor;

}
