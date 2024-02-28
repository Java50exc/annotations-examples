package telran.persons;

import telran.reflect.SchemaProperties;

public class SchemaPropertiesAppl {
	
	public static void main(String[] args) {
		
		System.out.println(personTest(new PersonNormal()) ? "passed" : "failed");
		System.out.println(personTest(new PersonNoId()) ? "passed" : "failed");
		System.out.println(personTest(new PersonTwoId()) ? "passed" : "failed");
		
	}
	
	public static boolean personTest(Person person) {
		System.out.println(person.getClass().getName() + " test");
		try {
			SchemaProperties.displayFieldProperties(person);
		} catch (Throwable e) {
			System.out.println(e);
			return false;
		} finally {
			System.out.println("_____________________________");
		}
		return true;
	}

}
