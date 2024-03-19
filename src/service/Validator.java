package service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
	
	public static List<String> validar(Object entidade) throws IllegalArgumentException, IllegalAccessException{
		List<String> invalidos = new ArrayList<String>();
		Class<?> classe = entidade.getClass();
		Field[] atributos = classe.getDeclaredFields();
		for(Field atributo : atributos) {
			atributo.setAccessible(true);
			Object valor = atributo.get(entidade);
			if(valor == null) {
				if(atributo.isAnnotationPresent(Validation.class)) {
					Validation validacao = atributo.getAnnotation(Validation.class);
					invalidos.add(validacao.descricao());
				}
			}
		}
		return invalidos;
	}

}
