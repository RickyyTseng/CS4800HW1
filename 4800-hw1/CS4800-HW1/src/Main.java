class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        CommissionEmployee nicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        CommissionEmployee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        System.out.println("-------Employee Information-------");
        System.out.println("Salaried Employee Information:");
        System.out.println("Name: " + joeJones.getFirstName() + " " + joeJones.getLastName());
        System.out.println("SSN: " + joeJones.getSocialSecurityNumber());
        System.out.println("Weekly Salary: " + joeJones.getWeeklySalary());

        System.out.println("Name: " + renwaChanel.getFirstName() + " " + renwaChanel.getLastName());
        System.out.println("SSN: " + renwaChanel.getSocialSecurityNumber());
        System.out.println("Weekly Salary: " + renwaChanel.getWeeklySalary());

        System.out.println("\nHourly Employee Information:");
        System.out.println("Name: " + stephanieSmith.getFirstName() + " " + stephanieSmith.getLastName());
        System.out.println("SSN: " + stephanieSmith.getSocialSecurityNumber());
        System.out.println("Wage: " + stephanieSmith.getWage());
        System.out.println("Hours Worked: " + stephanieSmith.getHoursWorked());

        System.out.println("Name: " + maryQuinn.getFirstName() + " " + maryQuinn.getLastName());
        System.out.println("SSN: " + maryQuinn.getSocialSecurityNumber());
        System.out.println("Wage: " + maryQuinn.getWage());
        System.out.println("Hours Worked: " + maryQuinn.getHoursWorked());

        System.out.println("\nCommission Employee Information:");
        System.out.println("Name: " + nicoleDior.getFirstName() + " " + nicoleDior.getLastName());
        System.out.println("SSN: " + nicoleDior.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + nicoleDior.getCommissionRate());
        System.out.println("Gross Sales: " + nicoleDior.getGrossSales());

        System.out.println("Name: " + mahnazVaziri.getFirstName() + " " + mahnazVaziri.getLastName());
        System.out.println("SSN: " + mahnazVaziri.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + mahnazVaziri.getCommissionRate());
        System.out.println("Gross Sales: " + mahnazVaziri.getGrossSales());

        System.out.println("\nBase Employee Information:");
        System.out.println("Name: " + mikeDavenport.getFirstName() + " " + mikeDavenport.getLastName());
        System.out.println("SSN: " + mikeDavenport.getSocialSecurityNumber());
        System.out.println("Base Salary: " + mikeDavenport.getBaseSalary());
    }
}