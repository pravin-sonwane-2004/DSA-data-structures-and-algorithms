//class Employee{
//	private int id;
//	private String name;
//	private String address;
//
//	void setId(int id) {
//		this.id = id;
//	}
//	int getId() {
//		return id;
//	}
//	void setName(String name) {
//		this.name = name;
//	}
//	String getName() {
//		 return name;
//	}
//	void setAddress(String address) {
//		this.address = 	address;
//	}
//	String getAddress() {
//		return address;
//	}
//}
//
//class Dept {
//	private Employee emp;
//	void addEmp(Employee emp) {
//		this.emp =emp;
//	}
//	void showEmp() {
//		 System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAddress());
//	}
//}
//class POJO {
//	void main() {
//		Dept d = new Dept();
//		Employee e = new Employee();
//		e.setId(1);
//		e.setName("ABC");
//		e.setAddress("Afaf");
//		d.addEmp(e);
//		d.showEmp();
//		// IO.println(emp.getName());
//	}
//}