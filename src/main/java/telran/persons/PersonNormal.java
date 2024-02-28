package telran.persons;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonNormal  implements Person {
	@Id
	int a = 5;
	@Index
	int b = 6;
	@Index
	int c = 7;

}
