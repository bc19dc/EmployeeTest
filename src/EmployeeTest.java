import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetAndGetName() {
		Employee emp = new Employee();
		String name = "Bryan";
		
		emp.setName(name);
		assertEquals(name, emp.getName());
	}

	@Test
	void testSetAndGetHours() {
		Employee emp = new Employee();
		double hours1 = 10;

		emp.setHours(hours1);
		assertEquals(hours1, emp.getHours());
		
		double hours2 = -3;
		emp.setHours(hours2);
		assertNotEquals(hours2, emp.getHours());
	}

	@Test
	void testEmployee() {
		Employee emp = new Employee();
		assertEquals("", emp.getName());
		assertEquals(0, emp.getHours());
	}

	@Test
	void testGetTotalPayAndEmployeeStringDouble() {
		String name = "Bryan";
		double hours1 = 42.3;
		Employee emp = new Employee(name, hours1);
		assertEquals(name, emp.getName());
		assertEquals(hours1, emp.getHours());
		
		double wage1 = 40 * 15 + 2.3 * 16.5;
		assertEquals(wage1, emp.getTotalPay());
		
		double hours2 = 32.5;
		emp.setHours(hours2);
		double wage2 = 32.5 * 15;
		assertEquals(wage2, emp.getTotalPay());
	}

}
