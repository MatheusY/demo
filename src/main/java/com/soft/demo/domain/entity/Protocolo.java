package com.soft.demo.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_PROTOCOLO")
public class Protocolo extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FUNCIONARIO", referencedColumnName = "ID")
	private Funcionario funcionario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID")
	private Endereco endereco;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TELEFONE", referencedColumnName = "ID")
	private Telefone telefone;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_FUNCIONARIO_ACAO", referencedColumnName = "ID")
	private AcaoFuncionario funcionarioAcao;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ENDERECO_ACAO", referencedColumnName = "ID")
	private AcaoEndereco enderecoAcao;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TELEFONE_ACAO", referencedColumnName = "ID")
	private AcaoTelefone telefoneAcao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ACAO", referencedColumnName = "ID")
	private Acao acao;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADO", referencedColumnName = "ID")
	private Estado estado;

	@OneToOne
	@JoinColumn(name = "ID_PAI", referencedColumnName = "ID")
	private Protocolo dependencia;
}
