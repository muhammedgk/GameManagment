package game_management;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private int BirthofDay;
	private String nationalatyId;
	
	public Gamer(int id, String firstName, String lastName, int birthofDay, String nationalatyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		BirthofDay = birthofDay;
		this.nationalatyId = nationalatyId;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthofDay() {
		return BirthofDay;
	}

	public void setBirthofDay(int birthofDay) {
		BirthofDay = birthofDay;
	}

	public String getNationalatyId() {
		return nationalatyId;
	}

	public String setNationalatyId(String nationalatyId) {
		return this.nationalatyId = nationalatyId;
	}
	
	
	

}
