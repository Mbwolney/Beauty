package com.example.beauty.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Nome não pode ser vazio")
	private String nome;
	@ManyToMany
	@JoinTable(name = "Funcionario_servico", joinColumns = @JoinColumn(name = "Funcionario_id"), inverseJoinColumns = @JoinColumn(name = "Servico_id"))
	private List<Servico> servico;
}
