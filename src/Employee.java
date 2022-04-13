
public class Employee {
	public final static double BASE_HOUR_RATE = 15.0;
	public final static double OVERTIME_HOUR_RATE = 16.5;
	public final static double BASE_HOUR_THRESHOLD = 40.0;
	
	private String name;
	private double hours;
	private double totalPay;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours < 0 ? 0 : hours;
		this.setTotalPay();
	}
	public double getTotalPay() {
		return totalPay;
	}
	public void setTotalPay() {
		if (this.hours < 0) return;
		
		this.totalPay = this.hours * BASE_HOUR_RATE;
		if (this.hours > BASE_HOUR_THRESHOLD) {
			this.totalPay += (this.hours - BASE_HOUR_THRESHOLD) * (OVERTIME_HOUR_RATE - BASE_HOUR_RATE);
		}
	}
		
	public Employee() {
		this.setName("");
		this.setHours(0);
	}
	public Employee(String name, double hours) {
		this.setName(name);
		this.setHours(hours);
	}
}
