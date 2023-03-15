package ust.sonar;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class MainEmployee {

	public static void main(String[] args) {
		Employeelist e1 = new Employeelist("Anuja Ajay", 25, 3, 50000);
		Employeelist e2 = new Employeelist("Finla Andrew", 28, 5, 45000);
		Employeelist e3 = new Employeelist("Sagar", 40, 8, 75000);
		Employeelist e4 = new Employeelist("Aysha", 30, 14, 60000);

		List<Employeelist> ls = Arrays.asList(e1, e2, e3, e4);

		for (Employeelist k : ls) {
			if ((k.getNoofyears() >= 1) && (k.getNoofyears() <= 3))
				k.setSalary(k.getSalary() + (0.025) * k.getSalary());
			else if ((k.getNoofyears() >= 3) && (k.getNoofyears() <= 6))
				k.setSalary(k.getSalary() + (0.05) * k.getSalary());
			else if ((k.getNoofyears() >= 6) && (k.getNoofyears() <= 10))
				k.setSalary(k.getSalary() + (0.10) * k.getSalary());
			else if (k.getNoofyears() > 10)
				k.setSalary(k.getSalary() + (0.15) * k.getSalary());
		}
		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		for(Employeelist e:ls) {
		    
		     myout.print(e);
		     
		}myout.close();
	}
}
