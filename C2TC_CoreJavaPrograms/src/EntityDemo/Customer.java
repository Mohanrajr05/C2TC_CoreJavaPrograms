package EntityDemo;

public class Customer {
	private int id;
	private String name;
	private String city;
	Customer(){
		System.out.println("currently in defaut constructor");
	}
	
	Customer(int id, String name){
		
		System.out.println("id : " +id+ "name : " +name);
	}
	Customer(int id, String name,String city){
		
		System.out.println("id : " +id+ "name : " +name+ "City :" +city);
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
	
	
	

}
