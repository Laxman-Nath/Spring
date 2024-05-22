package setter_injection;

public class Employee {
   public int Id;
   public String Name;
   public String Address;
@Override
public String toString() {
	return "Employee [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getId() {
	return Id;
}
public Employee(int id, String name, String address) {
	super();
	Id = id;
	Name = name;
	Address = address;
}
public void setId(int id) {
	Id = id;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
   
}
