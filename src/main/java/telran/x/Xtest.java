package telran.x;

import telran.reflect.BeforeEach;
import telran.reflect.Test;

public class Xtest {
	@BeforeEach
	void be1() {
		System.out.println("BeforeEach1");
	}
	
	@BeforeEach
	void be2() {
		System.out.println("BeforeEach2");
	}

	int sum(int op1, int op2) {
		System.out.println("method sum");
		return op1 + op2;
	}

	int subtract(int op1, int op2) {
		System.out.println("method subtract");
		return op1 - op2;
	}

	@Test
	void f3() {
		System.out.println("test 3");
	}

	@Test
	void f4() {
		System.out.println("test 4");
	}

	@Test
	void f5() {
		System.out.println("test 5");
	}

}
