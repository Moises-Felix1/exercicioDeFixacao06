package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			List<String> courses = new ArrayList<>();
			courses.add("A");
			courses.add("B");
			courses.add("C");
			
			Set<Students> std = new HashSet<>();
			for(String crss : courses) {
				
				System.out.print("How many students for course " +crss+"? ");
				int quanti = sc.nextInt();
				
				for(int i=0; i<quanti; i++) {
					
					int id = sc.nextInt();
					std.add(new Students(id));
				}
				System.out.println();
			}
			
			System.out.print("Total students: "+std.size());
			
		}catch(InputMismatchException e) {
			System.out.println("Error! "+e.getMessage());
		}finally {
			sc.close();
		}
	}

}
