package hello_spring;

public class Employee<Address> {
	private String ename;
	private Address addr;
	
	public Employee(Address addr) {
		this.addr=addr;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	 
	 
}
