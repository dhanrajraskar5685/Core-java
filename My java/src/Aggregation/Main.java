package Aggregation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept dept = new Dept();
		dept.setDid(100);
		dept.setDname("comp");
		dept.setDlocation("pune");

		Employee employee = new Employee();
		employee.setEid(10001);
		employee.setEname("Dhanraj");
		employee.setEsalary("85000");
		employee.setDept(dept);

		System.out.println(employee.getEid() + " " + employee.getEname() + " " + employee.getEsalary());
		System.out.println(employee.getDept().getDid());
		System.out.println(employee.getDept().getDname());
		System.out.println(employee.getDept().getDlocation());
	}

}
