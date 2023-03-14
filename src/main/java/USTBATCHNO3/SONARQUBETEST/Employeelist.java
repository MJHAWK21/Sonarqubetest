package USTBATCHNO3.SONARQUBETEST;

public class Employeelist {
	private String empname;
	private int empage;
	private int no_of_years;
	private double salary;
	public Employeelist(String empname, int empage, int no_of_years, double salary) {
		super();
		this.empname = empname;
		this.empage = empage;
		this.no_of_years = no_of_years;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public int getNo_of_years() {
		return no_of_years;
	}
	public void setNo_of_years(int no_of_years) {
		this.no_of_years = no_of_years;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeelist [empname=" + empname + ", empage=" + empage + ", no_of_years=" + no_of_years + ", salary="
				+ salary + "]";
	}

    }
	



