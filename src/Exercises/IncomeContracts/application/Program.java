package Exercises.IncomeContracts.application;

import Exercises.IncomeContracts.entities.Department;
import Exercises.IncomeContracts.entities.HourContract;
import Exercises.IncomeContracts.entities.Worker;
import Exercises.IncomeContracts.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the departments name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));


        System.out.print("How many contracts to this worker?: ");
        int contracts = sc.nextInt();

        for (int i=0; i<contracts; i++){
            System.out.println("Enter contract #" + i + 1 + " data:");
            System.out.println("Date (DD/MM/YYYY):");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContracts(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income: ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));




        sc.close();
    }
}
