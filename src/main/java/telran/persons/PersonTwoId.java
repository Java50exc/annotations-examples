package telran.persons;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonTwoId  implements Person {
	@Id
	int a = 5;
	@Id
	int b = 6;
	@Index
	int c = 7;

}
