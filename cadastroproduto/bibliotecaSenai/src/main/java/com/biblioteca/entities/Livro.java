package com.biblioteca.entities;

public class Livro {

@Entity
@Table(name = "tb_livro")
private class livro {
		
@Id
@GeneratedValue(strategy = GeneretionType.IDENTITY)
private Long id;

@Column(name = "nome_livro")
private String nome_livro;

@Column(name = "nome_autor")
private String nome_autor;

@Column(name = "isbn")
private String isbn;

@Column(name = "ano")
private int ano;

@Column(name = "valor")
private double valor;

@Column(name = "estoque")
private int estoque;





}

}