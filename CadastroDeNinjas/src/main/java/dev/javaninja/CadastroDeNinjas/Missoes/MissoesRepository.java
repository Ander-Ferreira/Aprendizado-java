package dev.javaninja.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// O JpaRepository fornece métodos prontos para operações no banco de dados,
// como salvar, buscar, atualizar e deletar registros.
//
// Ele também permite que o Spring Data JPA gere queries automaticamente
// com base nos métodos criados na interface.
//
// MissoesModel representa a entidade da tabela,
// e Long representa o tipo da chave primária (ID).

//ORM é uma tradução do nosso Model para o banco de dados, já que o banco de dados fala outra linguagem,
//ele basicamente gera o esquema de tabelas no banco de dados.

//
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}