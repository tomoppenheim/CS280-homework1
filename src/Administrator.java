import java.util.Scanner;
public class Administrator extends SalariedEmployee{

	private String title;
	private String areaOfResponsibility;
	private String supervisorName;
	
	
	public Administrator(){
		super();
		this.title = "";
		this.areaOfResponsibility = "";
		this.supervisorName = "";
	}
	
	// 3 argument constructor
	public Administrator(String title, String responsibility, String supervisor){
		this.title = title;
		this.areaOfResponsibility = responsibility;
		this.supervisorName = supervisor;
	}
	
	// 6 argument constructor
	public Administrator(String name, Date hireDate, double salary, String title, String responsibility,
			String supervisor){
		
		super(name, hireDate, salary);
		this.title = title;
		this.areaOfResponsibility = responsibility;
		this.supervisorName = supervisor;	
	}
	
	// Accessors
	public String getTitle(){
		return title;
	}

	public String getResponbility(){
		return areaOfResponsibility;
	}
	
	public String getSupervisor(){
		return supervisorName;
	}	
	
	//Mutators 
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setResponbility(String responsibility){
		this.areaOfResponsibility = responsibility;
	}
	
	public void setSupervisor(String supervisor){
		this.supervisorName = supervisor;
	}
	
	public void dataEntry(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the name of the Administrator");
		String name = keyboard.nextLine();
		
		System.out.print("Enter the number of the month of the Hire Date of the Administrator");
		int month = keyboard.nextInt();
		
		System.out.print("Enter the day of the hire date for the administrator");
		int day = keyboard.nextInt();
		
		System.out.print("Enter the year of the hire date for the administrator");
		int year = keyboard.nextInt();
		
		System.out.print("Enter the salary of the Administrator");
		double salary = keyboard.nextDouble();
		
		setName(name);
		setSalary(salary);
		setHireDate(new Date(month, day, year));
		
		System.out.print("Enter the title of the Administrator");
		title = keyboard.nextLine();
		
		System.out.print("Enter the responsibility of the Administrator");
		areaOfResponsibility = keyboard.nextLine();
		
		System.out.print("Enter the supervisor of the Administrator");
		supervisorName = keyboard.nextLine();
	}
	
	public String toString()
	{
		return super.toString() + " Title: " + title + ", Responsibility: " + areaOfResponsibility
				+ ", Supervisor: " + supervisorName;
		
	}
}

