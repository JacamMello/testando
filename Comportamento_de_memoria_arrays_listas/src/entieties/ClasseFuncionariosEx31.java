package entieties;

public class ClasseFuncionariosEx31 {

	private Integer id;
	private String name;
	private Double salary;
	
	public ClasseFuncionariosEx31() {
	}
	
	public ClasseFuncionariosEx31(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void addSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, salary);
	}
}
