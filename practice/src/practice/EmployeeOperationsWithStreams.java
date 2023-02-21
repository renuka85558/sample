package practice;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int id;
    
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
    public Employee() {
    	
    }

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	//Count the number of employees in each department
	public static Map<String, Long> employeeCountByDepartment(List<Employee>empList){
		Map<String, Long> map =empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        

	return map;	
	}
	// get employees by department wise
   public Map<String,List<Employee>> getEmployeesByDept(List<Employee>empList){
	   Map<String,List<Employee>> map1 =empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	   return map1;
   }
  //average salary of each department
   public Map<String,Double> getAvgSalByDept(List<Employee>empList){
	   Map<String,Double> map2 =empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	   return map2;
   }
   //List down the names of all employees in each department?
   
   public void getAllNamesDeptWise(List<Employee>empList){
	   
	   Map<String, List<Employee>> deptWiseNames=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	   Set<Entry<String, List<Employee>>> entrySet=deptWiseNames.entrySet();
	   for (Entry<String, List<Employee>> entry : entrySet) 
	   {
	       System.out.println("--------------------------------------");
	                
	       System.out.println("Employees In "+entry.getKey() + " : ");
	                
	       System.out.println("--------------------------------------");
	                
	       List<Employee> list = entry.getValue();
	                
	       for (Employee e : list) 
	       {
	           System.out.println(e.getName());
	       }
	   }
	   
   }
  
   
    
}

public class EmployeeOperationsWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(1, "renu", 32, "Female", "HR", 2020, 25000.0));
		employeeList.add(new Employee(2, "edu", 25, "Male", "Test", 2015, 19000.0));
		employeeList.add(new Employee(3, "ram", 29, "Male", "dev", 2012, 18000.0));
		employeeList.add(new Employee(4, "navaneeth", 28, "Male", "prod", 2014, 32500.0));
		employeeList.add(new Employee(5, "bilva", 27, "Female", "HR", 2020, 22700.0));
		employeeList.add(new Employee(6, "nani", 43, "Male", "dev", 2016, 10500.0));
		employeeList.add(new Employee(7, "veer", 35, "Male", "HR", 2010, 27000.0));
		employeeList.add(new Employee(8, "nava", 31, "Male", "prod", 2019, 34500.0));
		employeeList.add(new Employee(9, "jyothi", 24, "Female", "Test", 2016, 11500.0));
		employeeList.add(new Employee(10, "nag", 38, "Male", "Test", 2015, 11000.5));
		employeeList.add(new Employee(11, "navya", 27, "Female", "dev", 2014, 15700.0));
		employeeList.add(new Employee(12, "rayudu", 25, "Male", "prod", 2016, 28200.0));
		employeeList.add(new Employee(13, "abhi", 27, "Female", "HR", 2020, 22000.0));
		employeeList.add(new Employee(14, "cherry", 24, "Male", "Test", 2017, 10000.5));
		employeeList.add(new Employee(15, "seshu", 23, "Male", "dev", 2018, 15000.0));
		employeeList.add(new Employee(16, "mokshi", 26, "Female", "prod", 2015, 20000.0));
		employeeList.add(new Employee(17, "nav", 31, "Male", "prod", 2019, 50000.0));
Employee emp = new Employee();
		Map<String, Long> map =emp.employeeCountByDepartment(employeeList);
		System.out.println("Count the number of employees in each department");
		System.out.println("................................................");
		for(Entry<String, Long> entry :map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());	
		}
		System.out.println(map);
		
		Map<String,List<Employee>>map1=emp. getEmployeesByDept(employeeList);
		System.out.println("department wise employees");
		System.out.println(".........................");
		for(Entry<String, List<Employee>> entry :map1.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());	
		}
		System.out.println(map1);
		
		DoubleSummaryStatistics employeeSalaryStatistics=
				employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
				         
				System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
				System.out.println("count  :"+employeeSalaryStatistics.getCount() );
				System.out.println("max salary  "+employeeSalaryStatistics.getMax());
				System.out.println("min salary  :"+employeeSalaryStatistics.getMin());
				Map<String,Double> map2= emp.getAvgSalByDept(employeeList);
				System.out.println("average salary of each department");
				System.out.println(".....................................");
				for(Entry<String, Double> entry :map2.entrySet()) {
					System.out.println(entry.getKey()+" : "+entry.getValue());	
					
					
				}
			Optional<Employee>e =	employeeList.stream().filter(employee -> employee.getAge() <30).findFirst();
			System.out.println(e.get());
			
			emp.getAllNamesDeptWise(employeeList);
			//System.out.println(m);
	}

}
