package model;

import service.Validation;

public class Person {
	
	@Validation(descricao = "Name cannot be null")
	private String name;
	
	@Validation(descricao = "Email cannot be null")
	private String email;
	
	@Validation(descricao = "Telefone cannot be null")
	private String telefone;
	
	@Validation(descricao = "Profession cannot be null")
	private String profession;
	
	public Person() {}

	public Person(String name, String email, String telefone, String profession) {
		super();
		this.name = name;
		this.email = email;
		this.telefone = telefone;
		this.profession = profession;
	}
	
	
	public static Person personFactory(String name, String email, String telefone, String profession) {
        return new Person(name,email,telefone,profession); 
    }
	
	

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getTelefone() {
		return telefone;
	}


	public String getProfession() {
		return profession;
	}

	
	
	
	

}
