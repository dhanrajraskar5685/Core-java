package Collection;

import java.util.Objects;

public class Employee {
	
	 private int  eid;
	 private String  name;
	 public  Employee( int id,String name) {
		 
		 this.eid=eid;
		 this.name=name;
		 
	 }
	 
	 
	 
 
	 
	@Override
	public int hashCode() {
		return Objects.hash(eid, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	

}
