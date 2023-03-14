package USTBATCHNO3.SONARQUBETEST;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainEmployee  {

	public static void main(String[] args) {
	        Employeelist e1=new Employeelist("Anuja Ajay",25,3,50000);
	        Employeelist e2=new Employeelist("Finla Andrew",28,5,45000);
	        Employeelist e3=new Employeelist("Sagar",40,8,75000);
	        Employeelist e4=new Employeelist("Aysha",30,14,60000);
	        
	        List<Employeelist>ls=Arrays.asList(e1,e2,e3,e4);
	  

List<Employeelist> l2=ls.stream().sorted(Comparator.comparingDouble(Employeelist::getSalary).reversed())
				.peek(k->{
			if((k.getNo_of_years()>=1)&&(k.getNo_of_years()<=3))
					k.setSalary(k.getSalary()+(0.025)*k.getSalary());
			if((k.getNo_of_years()>=3)&&(k.getNo_of_years()<=6))
				k.setSalary(k.getSalary()+(0.05)*k.getSalary());
			if((k.getNo_of_years()>=6)&&(k.getNo_of_years()<=10))
				k.setSalary(k.getSalary()+(0.10)*k.getSalary());
				else if(k.getNo_of_years()>10)
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
			      ).toList();
				l2.forEach(t->System.out.println(t));
	}
}
