package com.br.fsc.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "titulo", length = 50, unique = true)
	private String title;
	
	@Column(name = "descricao", length = 250, unique = false)
	private String description;
	
	@NotBlank
	@Column(name = "paginas", length = 50, unique = false)
	private Integer pages;
	

	@Column(name = "valor", length = 10, unique = false)
	private Double value;


	public Book() {
	}


	public Book(Long id, @NotBlank String title, String description, @NotBlank Integer pages, Double value) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.pages = pages;
		this.value = value;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getPages() {
		return pages;
	}


	public void setPages(Integer pages) {
		this.pages = pages;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, id, pages, title, value);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(pages, other.pages) && Objects.equals(title, other.title)
				&& Objects.equals(value, other.value);
	}
	
	

}
