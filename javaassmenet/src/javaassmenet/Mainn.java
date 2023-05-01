package javaassmenet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mainn {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 35, "Male", "Sales", 50000.0, 2010));
        employees.add(new Employee(2, "Jane", 28, "Female", "Marketing", 60000.0, 2015));
        employees.add(new Employee(3, "Bob", 42, "Male", "Sales", 75000.0, 2005));
        employees.add(new Employee(4, "Alice", 31, "Female", "Marketing", 55000.0, 2013));
        employees.add(new Employee(5, "Tom", 29, "Male", "Engineering", 80000.0, 2011));
        employees.add(new Employee(6, "Samantha", 38, "Female", "Engineering", 90000.0, 2008));
        employees.add(new Employee(7, "Bill", 65, "Male", "Sales", 90000.0, 2004));
        employees.add(new Employee(8, "Emily", 26, "Female", "Marketing", 50000.0, 2018));
        employees.add(new Employee(9, "snjana", 26, "Female", "Marketing", 50000.0, 2018));

        
        long maleCount = employees.stream()
            .filter(e -> e.getGender().equals("Male"))
            .count();
        System.out.println("Number of male employees: " + maleCount);

        long femaleCount = employees.stream()
            .filter(e -> e.getGender().equals("Female"))
            .count();
        System.out.println("Number of female employees: " + femaleCount);

        double maleAverageAge = employees.stream()
            .filter(e -> e.getGender().equals("Male"))
            .mapToInt(Employee::getAge)
            .average()
            .orElse(0.0);
        System.out.println("Average age of male employees: " + maleAverageAge);

        double femaleAverageAge = employees.stream()
            .filter(e -> e.getGender().equals("Female"))
            .mapToInt(Employee::getAge)
            .average()
            .orElse(0.0);
        System.out.println("Average age of female employees: " + femaleAverageAge);
        
      
        Employee highestPaidEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary))
            .orElse(null);
        System.out.println("Details of highest paid employee: " + highestPaidEmployee.getName());

//        double empdeptcount = employees.stream()
//                .filter(e -> e.getGender().equals("Female"))
//                .mapToInt(Employee::getAge)
//                .average()
//                .orElse(0.0);
//            System.out.println("Average age of female employees: " + femaleAverageAge);
//            System.out.println(employees.size());
            int sales=0;
            int Marketing=0;
            int Engineering=0;
            int salesavg=0;
            int Marketingavg=0;
            int Engineeringavg=0;
            for(var i=0;i<employees.size();i++) {
            	
            	
            	if(employees.get(i).getDepartment()=="Sales") {
            		sales+=1;
            		salesavg+=employees.get(i).getSalary();
            		
            		
            	}else if(employees.get(i).getDepartment()=="Marketing") {
            		Marketing+=1;
            		Marketingavg+=employees.get(i).getSalary();
            		
            	}else if(employees.get(i).getDepartment()=="Engineering") {
            		Engineering+=1;
            		Engineeringavg+=employees.get(i).getSalary();
            	}
            }
            	
            	System.out.println("Count of number of employees in Engineering Department is = "+Engineering);
            	System.out.println("Count of number of employees in Marketing Department is = "+Marketing);
            	System.out.println("Count of number of employees in Engineering Department is = "+sales);
            	
            	
            	

            	System.out.println(" the average salary of employees in Sales Avg is = "+ salesavg/sales);
            	
            	System.out.println(" the average salary of employees in Engineering is  = "+Engineeringavg/Engineering);
            	System.out.println("the average salary of employees in Marketing is  = "+Marketingavg/Marketing);
            	
          
            
            
        
            	
            	
        
    }
}
