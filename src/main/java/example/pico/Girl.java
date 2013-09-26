package example.pico;

public class Girl {
	public final School school;

	public Girl(School school) {
		this.school = school;
	}

	public void setSchool(String name){
		school.setName(name);
	}
	
	public void saySchoolName() {
		System.out.println("School Name: "+ this.school.getName());		
	}

}
