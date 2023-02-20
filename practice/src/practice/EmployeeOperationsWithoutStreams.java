package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Emp {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Emp() {

	}

	public Emp(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
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

	// Count the number of employees in each department
	public Map<String, Integer> employeeCountByDepartment(List<Employee> empList) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (Employee e : empList) {
			if (map.containsKey(e.getDepartment())) {

				map.put(e.getDepartment(), map.get(e.getDepartment()) + 1);

			} else {
				map.put(e.getDepartment(), 1);
			}
		}
		return map;

	}

	// get employees by department wise
	public static Map<String, List<Employee>> getEmployeesByDept(List<Employee> empList) {
		Map<String, List<Employee>> map2 = new HashMap<String, List<Employee>>();
		List<Employee> list = new ArrayList<Employee>();
		for (Employee e : empList) {
			if (map2.containsKey(e.getDepartment())) {
				
				
				map2.put(e.getDepartment(), list);

			} else {
				list.add(e);
				map2.put(e.getDepartment(), list);
			}
		}

		return map2;
	}

	// max salary of employee
	public double getMaxSal(List<Employee> empList) {

		Iterator<Employee> i = empList.iterator();
		double maxsalary = 0;
		double sal = 0;
		while (i.hasNext()) {
			Employee e = i.next();
			sal = e.getSalary();
			if (sal > maxsalary) {
				maxsalary = sal;
			}
		}
		
		System.out.println("maximum salary..." + maxsalary);
		return maxsalary;
	}

	// min salary of employee
		public double getMinSal(List<Employee> empList) {

			Iterator<Employee> i = empList.iterator();
			double minsalary = 0;
			double sal = 0;
			while (i.hasNext()) {
				Employee e = i.next();
				sal = e.getSalary();
				if (sal < minsalary) {
					minsalary = sal;
				}
			}
			
			System.out.println("minimum salary..." + minsalary);
			return minsalary;
		}
		public double getTotalSal(List<Employee> empList) {
			double total=0;
			double sal;
			for(Employee e:empList) {
				sal=e.getSalary();
				total=total+sal;
				
			}
			return total;
			
		}
		
		public int employeeCount(List<Employee> empList) {
			int count =0;
			for(Employee e1 :empList) {
				count++;
			}
			return count;
			
		}
		
		public double avgSalaryOfEmployees(List<Employee> empList) {
			double avgSal=0;
			double total=0;
			double sal;
			int count =0;
			for(Employee e:empList) {
				count++;
				sal=e.getSalary();
				total=total+sal;
				 avgSal =total/count;
			}
			return avgSal;
		}

}

public class EmployeeOperationsWithoutStreams {

	public static void main(String[] args) {
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
		Emp emp = new Emp();
		Map<String, Integer> map = emp.employeeCountByDepartment(employeeList);
		System.out.println("Count the number of employees in each department");
		System.out.println("................................................");
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(map);

		Map<String, List<Employee>> map2 = emp.getEmployeesByDept(employeeList);

		System.out.println("department wise employees");
		System.out.println(".........................");

		for (Entry<String, List<Employee>> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//System.out.println(map2);

//map2.forEach((k,v) -> System.out.println(k+ ";"+v));
		double sal=emp.getMaxSal(employeeList);
		System.out.println("max sal :"+sal);
		
		double minSal=emp.getMaxSal(employeeList);
		System.out.println("min sal :"+minSal);
		double totalSal =emp.getTotalSal(employeeList);
		System.out.println("total salary :"+totalSal);
		int count =emp.employeeCount(employeeList);
		System.out.println("Employee count : "+count);
		
		double avgSalary =emp.avgSalaryOfEmployees(employeeList);
		System.out.println("average salary of employees   :: "+avgSalary);
	}

}
