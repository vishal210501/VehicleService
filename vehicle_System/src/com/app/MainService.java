package com.app;

import com.dao.*;
import java.util.*;

public class MainService {
	public static void main(String[] args) {
		implementation vm = new implementation();
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("welcome to Vehicle Service Management ");
			System.out.println(
					"1. Add Vehicle\n2. Remove Vehicle\n3. Display All Vehicles\n4. Search by Make\n5. Search by Model\n6. Search by Type\n7. Add Service Record\n8. Display Service History\n0. Exit");
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			try {
				switch (ch) {
				case 1:
					vm.addVehicle();
					break;
				case 2:
					vm.removeVehicle();
					break;
				case 3:
					vm.displayAllVehicle();
					break;
				case 4:
					vm.searchByMake();
					break;
				case 5:
					vm.searchByModel();
					break;
				case 6:
					vm.searchByType();
					break;
				case 7:
					vm.addServiceRecord();
					break;
				case 8:
					vm.displayServiceHistory();
					break;
				case 0: {
					System.out.println("Exiting...");
					System.exit(0);
				}
				default:
					System.out.println("Invalid Choice!");
					break;

				}

			} catch (VException v) {
				System.out.println("Error: " + v.getMessage());
			}

			System.out.println("Do you want to continue Y/y");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');
         System.out.println("thank you..............................");
	}
}
