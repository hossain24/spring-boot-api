package hilltrackSpringBoot.Model;

public class User {
	private int id;
	private String name;
	private String choice;
	
	public User(int id, String name, String choice) {
		super();
		this.id = id;
		this.name = name;
		this.choice = choice;
	}

	public User() {
		
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

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	
}
