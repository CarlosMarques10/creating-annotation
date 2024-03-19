import java.util.List;

import model.Person;

public class Test {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		
		Person person = Person.personFactory("James", "james@gmail.com", null,"Engenheiro de Software");
		
		List<String> v = service.Validator.validar(person);
		
		for(String valid : v) {
			System.out.println(valid);
		}
		
		
	}

}
