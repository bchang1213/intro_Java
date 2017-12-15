public class Project{
	private String name;
	private String description;
	
	//get Name
	public String getName() {
		return name;
	}
	//set Name
	public void setName(String name) {
		this.name = name;
	}
	//get Desc
	public String getDescription() {
		return description;
	}
	//set Desc
	public void setDescription(String description) {
		this.description = description;
	}
	//overloaded Constructor method for blank arguments
	public Project() {
	}
	//overloaded Constructor method for just name
	public Project(String name) {
		this.name = name;
	}
	//overloaded Constructor method for name and desc.
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String elevatorPitch() {
		String a = this.getName();
		String b = this.getDescription();
		String phrase = "Project" + a + ":" + b;
		return phrase;
	}
}