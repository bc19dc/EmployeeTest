
public class EmployeeDemo {

	public static void main(String[] args) {
		String name;
		double hours;
		
		name = "Bryan";
		hours = 10;
		Employee emp1 = new Employee(name, hours);
		System.out.println(name + " works for " + hours + " hours and get " + emp1.getTotalPay());
		
		name = "Peter";
		hours = 45;
		Employee emp2 = new Employee(name, hours);
		System.out.println(name + " works for " + hours + " hours and get " + emp2.getTotalPay());
		
		Employee emp3 = new Employee();
		System.out.println("By default, employee name is '" + emp3.getName() + "' with " + emp3.getHours() + " work hours. So, total pay is actually " + emp3.getTotalPay() + " by default.");
	}

}
