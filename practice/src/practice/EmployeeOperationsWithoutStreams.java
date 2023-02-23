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
				int count = map.get(e.getDepartment());
				count = count + 1;

				map.put(e.getDepartment(), count);

			} else {
				map.put(e.getDepartment(), 1);
			}
		}
		return map;

	}

	// get employees by department wise
	public static Map<String, List<Employee>> getEmployeesByDept(List<Employee> empList) {
		Map<String, List<Employee>> deptWiseEmps = new HashMap<String, List<Employee>>();

		for (Employee e : empList) {
			if (deptWiseEmps.containsKey(e.getDepartment())) {
				List<Employee> deptwiseEmplist = deptWiseEmps.get(e.getDepartment());

				deptwiseEmplist.add(e);

				deptWiseEmps.put(e.getDepartment(), deptwiseEmplist);

			} else {
				List<Employee> list = new ArrayList<Employee>();
				list.add(e);
				deptWiseEmps.put(e.getDepartment(), list);
			}
		}

		return deptWiseEmps;
	}

	public Map<String, Double> totalSalDeptwise(List<Employee> empList) {

		Map<String, Double> deptWiseTotalSal = new HashMap<String, Double>();

		for (Employee e : empList) {
			double total = e.getSalary();
			if (deptWiseTotalSal.containsKey(e.getDepartment())) {

				double sal = deptWiseTotalSal.get(e.getDepartment());
				total = total + sal;

				deptWiseTotalSal.put(e.getDepartment(), total);
			} else {
				deptWiseTotalSal.put(e.getDepartment(), e.getSalary());
			}
		}
		return deptWiseTotalSal;

	}

	public Map<String, Double> deptWiseAvgSal(List<Employee> list) {
		Map<String, Double> deptWiseAvgSalmap = new HashMap<String, Double>();

		Map<String, List<Employee>> newmap = getEmployeesByDept(list);

		for (Entry<String, List<Employee>> entry : newmap.entrySet()) {
			// System.out.println(entry.getKey()+":"+entry.getValue());
			String dept = entry.getKey();
			List<Employee> deptwiseEmpList = entry.getValue();
			double deptwiseAvgSal = avgSalaryOfEmployees(deptwiseEmpList);

			deptWiseAvgSalmap.put(dept, deptwiseAvgSal);

		}

		return deptWiseAvgSalmap;

	}

	// group by department wise
	// test:[]
	// hr=
	// get salary from list
	// total
	// sal =e.sal

	public List<String> getMatchedNames(List<Employee> empList, String name) {
		List<String> getMatchedEmpNames = new ArrayList<String>();

		for (Employee e : empList) {

			String str = e.getName();
			if (str.matches(name)) {
				getMatchedEmpNames.add(e.getName());
			}

		}

		return getMatchedEmpNames;
	}

	public List<String> getExactMatchedNames(List<Employee> empList, String name) {
		List<String> getExactMatchedEmpNames = new ArrayList<String>();

		for (Employee e : empList) {

			String str = e.getName();
			if (str.equals(name)) {
				getExactMatchedEmpNames.add(e.getName());
			}

		}

		return getExactMatchedEmpNames;
	}

	public List<String> getconMatchedNames(List<Employee> empList, String name) {
		List<String> getCMatchedEmpNames = new ArrayList<String>();

		for (Employee e : empList) {

			String str = e.getName();
			if (str.contains(name)) {
				getCMatchedEmpNames.add(e.getName());
			}

		}

		return getCMatchedEmpNames;
	}

	public List<Employee> getempsAgeIsgraterthan(List<Employee> emplist, int age) {
		List<Employee> givenAgeGraterThanEmpslist = new ArrayList<Employee>();
		for (Employee e : emplist) {
			if (e.getAge() > age) {
				givenAgeGraterThanEmpslist.add(e);
			}
		}
		return givenAgeGraterThanEmpslist;

	}

	public List<Employee> getempsAgeIsLessthan(List<Employee> emplist, int age) {
		List<Employee> givenAgelessThanEmpslist = new ArrayList<Employee>();
		for (Employee e : emplist) {
			if (e.getAge() < age) {
				givenAgelessThanEmpslist.add(e);
			}
		}
		return givenAgelessThanEmpslist;

	}

	public List<Employee> betweenageEmpsList(List<Employee> emplist, int startAge, int endAge) {
		List<Employee> betweenAgeList = new ArrayList<Employee>();
		for (Employee e : emplist) {

			if (e.getAge() > startAge && e.getAge() < endAge) {
				betweenAgeList.add(e);
			}

		}
		return betweenAgeList;
	}

	// max salary of employee
	public double getMaxSal(List<Employee> empList) {

		double maxsalary = 0;
		double sal = 0;
		for (Employee e : empList) {
			sal = e.getSalary();
			if (sal > maxsalary) {
				maxsalary = sal;
			}
		}

		System.out.println("maximum salary..." + maxsalary);
		return maxsalary;
	}

//sal ,maxsal
//25,0
//190,250
//190,250
//180,250
//325,250
//225,325
//100,325
//270,325
//325,345
//115,345
//110,345
//157,345
//282,345
//22,345
//100,345
//150,345
//200,345
//500,345
//345,500
	//500,345
// min salary of employee
	public double getMinSal(List<Employee> empList) {
		double minimumSal = empList.get(0).getSalary();

		for (Employee e : empList) {
			double salary = e.getSalary();
			if (minimumSal > salary) {
				minimumSal = salary;

			}

		}

		System.out.println("minimum salary..." + minimumSal);
		return minimumSal;
	}
//minsal,sal 
//	25000,25000
//250,190
//190,180 
//180, 320
//180,220	
//180,105
//105,270
//105,345
//105,115
//105,110
//105,157
//105,280
//105,220
//105,100
//100,150
//100,200
//100,500
//	

	public double getTotalSal(List<Employee> empList) {
		double total = 0;
		double sal;
		for (Employee e : empList) {
			sal = e.getSalary();
			total = total + sal;

		}
		return total;

	}
//total ,sal
//0,250
//250,190
//440,180
//620,325
//945,227
//1172,105
//1277,270
//1447,345
//1792,115
//1907,110

	public int employeeCount(List<Employee> empList) {
		int count = 0;
		for (Employee e1 : empList) {
			count++;
		}
		return count;

	}

	public double avgSalaryOfEmployees(List<Employee> empList) {
		double avgSal = 0;
		double total = 0;
		double sal;
		// int count = empList.size();
		for (Employee e : empList) {

			sal = e.getSalary();
			total = total + sal;
			avgSal = total / empList.size();
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
		double sal = emp.getMaxSal(employeeList);
		System.out.println("max sal :" + sal);
		System.out.println("...........");
		double minSal = emp.getMinSal(employeeList);
		System.out.println("min sal :" + minSal);
		System.out.println(".........");
		double totalSal = emp.getTotalSal(employeeList);
		System.out.println("total salary :" + totalSal);
		System.out.println("............");
		int count = emp.employeeCount(employeeList);
		System.out.println("Employee count : " + count);
		System.out.println(".............");
		System.out.println();
		double avgSalary = emp.avgSalaryOfEmployees(employeeList);
		System.out.println("average salary of employees   :: " + avgSalary);
		System.out.println("...........................");

		Map<String, Double> totalSalDepwise = emp.totalSalDeptwise(employeeList);
		System.out.println("Department wise total Salary");
		System.out.println("...........................");
		for (Entry<String, Double> entry : totalSalDepwise.entrySet()) {

			System.out.println(entry.getKey() + " :" + entry.getValue());

		}
		System.out.println();
		Map<String, Double> salAvgMap = emp.deptWiseAvgSal(employeeList);
		System.out.println("Average Salary Department Wise");
		System.out.println("................................");
		for (Entry<String, Double> entry : salAvgMap.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		String name = "(.*)na(.*)";
		List<String> matchedNames = emp.getMatchedNames(employeeList, name);
		System.out.println("Pattren Matched Names @@@@@ :" + matchedNames);
		System.out.println(".............................");
		System.out.println();
		String exactName = "renu";
		List<String> exactMatchedNames = emp.getExactMatchedNames(employeeList, exactName);
		System.out.println(" Exact Names ######:" + exactMatchedNames);
		System.out.println(".......................");
		System.out.println();
		String matchedName = "nav";
		List<String> cmatchedNames = emp.getconMatchedNames(employeeList, matchedName);
		System.out.println("List Contained Names ######:" + cmatchedNames);
		System.out.println();
		int age = 35;
		List<Employee> graterAgeEmpList = emp.getempsAgeIsgraterthan(employeeList, age);
		System.out.println(graterAgeEmpList);
		System.out.println();
		int lessAge = 40;
		List<Employee> lessAgeEmpList = emp.getempsAgeIsLessthan(employeeList, lessAge);
		System.out.println(lessAgeEmpList);

		System.out.println();
		int startAge = 35, endAge = 40;
		List<Employee> betweenAgeEmpList = emp.betweenageEmpsList(employeeList, startAge, endAge);
		System.out.println(betweenAgeEmpList);
	}

}
