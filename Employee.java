public abstract class Employee {
    protected String name;
    protected String position;
    protected double basicSalary;
    protected int experience;
    protected String educationalLevel;

    public Employee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.educationalLevel = educationalLevel;
    }

    public abstract double calculateSalary();

    public abstract double calculateBonus();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEducationalLevel() {
		return educationalLevel;
	}

	public void setEducationalLevel(String educationalLevel) {
		this.educationalLevel = educationalLevel;
	}    
}
