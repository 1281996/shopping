package com.mallika.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.of(1980, 12, 17);
		LocalDate d2 = LocalDate.of(1981, 2, 20);
		LocalDate d3 = LocalDate.of(1981, 02, 22);
		LocalDate d4 = LocalDate.of(1981, 4, 02);
		LocalDate d5 = LocalDate.of(1981, 9, 28);
		LocalDate d6 = LocalDate.of(1981, 5, 1);
		List<Employee> l1 = new ArrayList();
		l1.add(new Employee(7396, "smith", "clerk", d1, 7902, 800, 0, 10));
		l1.add(new Employee(7499, "allen", "saleman", d2, 7698, 1600, 300, 30));
		l1.add(new Employee(7521, "allen", "saleman", d3, 7698, 1250, 500, 30));
		l1.add(new Employee(7566, "jones", "manager", d4, 7839, 2975, 0, 20));
		l1.add(new Employee(7654, "martin", "saleman", d5, 7698, 1250, 1400, 30));
		l1.add(new Employee(7698, "blake", "clerk", d6, 7839, 2850, 0, 30));

		l1.stream().map(emp -> emp.getEmpNo() + ":" + emp.getName())
				.forEach(System.out::println);
		System.out
				.println("-----------------------------------------------------");

		l1.stream()
				.filter(emp -> emp.getDeptNo() == 30)
				.map(emp -> emp.getEmpNo() + ":" + emp.getName() + ":"
						+ emp.getDeptNo()).forEach(System.out::println);

		System.out
				.println("-----------------------------------------------------");

		l1.stream()
				.filter(emp -> emp.getJob() == "clerk")
				.map(emp -> emp.getEmpNo() + ":" + emp.getName() + ":"
						+ emp.getDeptNo()).forEach(System.out::println);

		System.out
				.println("-----------------------------------------------------");

		l1.stream()
				.filter(emp -> emp.getDeptNo() >= 20)
				.map(emp -> emp.getEmpNo() + ":" + emp.getName() + ":"
						+ emp.getDeptNo()).forEach(System.out::println);

		System.out
				.println("-----------------------------------------------------");

		l1.stream()
				.filter(emp -> emp.getComm() > emp.getSal())
				.map(emp -> emp.getEmpNo() + ":" + emp.getName() + ":"
						+ emp.getDeptNo() + ":" + emp.getSal() + ":"
						+ emp.getComm()).forEach(System.out::println);

		// System.out.println(l1);
		System.out
				.println("-----------------------------------------------------");
		l1.stream()
				.filter(emp -> emp.getComm() > 0.6 * emp.getSal())
				.map(emp -> emp.getEmpNo() + ":" + emp.getName() + ":"
						+ emp.getDeptNo() + ":" + emp.getSal() + ":"
						+ emp.getComm()).forEach(System.out::println);

		System.out
				.println("-----------------------------------------------------");

		l1.stream()
				.filter(emp -> emp.getDeptNo() == 20 && emp.getSal() > 2000)
				.map(emp -> emp.getEmpNo() + ":" + emp.getName() + ":"
						+ emp.getDeptNo() + ":" + emp.getSal() + ":"
						+ emp.getComm()).forEach(System.out::println);

		System.out
				.println("-----------------------------------------------------");
		Object min=l1.stream().mapToDouble(emp->emp.sal).min();
		System.out.println(min);
		
		System.out
		.println("-----------------------------------------------------");
	
		Object max=l1.stream().mapToDouble(emp->emp.sal).max();
		System.out.println(max);
		System.out
		.println("-----------------------------------------------------");
		
	l1.stream().filter(emp->emp.getName()
			.startsWith("m"))
			.map(emp->emp.getName())
			.forEach(System.out::println);
		
	System.out
	.println("-----------------------------------------------------");
	
	l1.stream().filter(emp->emp.getName()
			.endsWith("h"))
			.map(emp->emp.getName())
			.forEach(System.out::println);
	
	
	System.out
	.println("-----------------------------------------------------");
	
	
	l1.stream().filter(emp->emp.getName()
			.contains("m"))
			.map(emp->emp.getName())
			.forEach(System.out::println);
	
	System.out
	.println("-----------------------------------------------------");
	
	l1.stream().filter(emp->emp.getName().length()==5 &&
			emp.getName().contains("m"))
			.map(emp->emp.getName())
			.forEach(System.out::println);
	
	
	System.out
	.println("-----------------------------------------------------");
	
	
//	l1.stream().filter(emp->emp.getName().charAt(0)=="r")
//	.filter(emp->emp.getName().equals())
//	.forEach(System.out::Println);
	
	
	//List l2=new ArrayList();
	
 l1.stream().filter(emp -> emp.getName().charAt(2)=='r').map(emp->emp.getName()).forEach(System.out::println);



	
	System.out
	.println("-----------------------------------------------------");
	
	l1.stream()
	.filter(emp->emp.getSal()>=1200 && emp.getSal()<=1400)
	.map(emp->emp.getSal())
	.forEach(System.out::println);
	
	System.out
	.println("-----------------------------------------------------");
	
	l1.stream().sorted(Comparator.comparing(Employee::getName).reversed())
	.map(emp->emp.getName()+":"+emp.getJob())
	.forEach(System.out::println);
	

	System.out
	.println("-----------------------------------------------------");
	l1.stream().map(emp->emp.getJob()).distinct().forEach(System.out::println);
	System.out
	.println("-----------------------------------------------------");
	
	l1.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSal))
	.map(emp->emp.getName()+":"+emp.getSal())
	.forEach(System.out::println);
	
	}
	

}
