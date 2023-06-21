public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        super(name, position, basicSalary, experience, educationalLevel);
    }

    @Override
    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * 0.05 * experience);
        if (educationalLevel.equalsIgnoreCase("bachelor degree")) {
            salary += 500;
        } else if (educationalLevel.equalsIgnoreCase("diploma")) {
            salary += 250;
        }
        return salary;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.015;
    }
}