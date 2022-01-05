package oop.solutions;

import java.io.*;

public class Employee 
{

    String name,city;

    String salary; 

    String yoj;

    

    public void getInfo(String name, String city, String Salary,String yoj)

    {
        

        this.name = name;

        this.city = city;

        this.salary = salary;

        this.yoj = yoj;          

    }

    

    public void printInfo()

    {

        System.out.println(name  + "\t\t" + city + "\t\t" + salary + "\t\t" +yoj );  

    }



    public static void main(String[] args)throws Exception{
        
        InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r); 

        String [] name = new String[3];

        String [] yoj = new String[3];

        String [] salary = new String [3];

        String [] city = new String[3];

        

       for (int i = 0; i <3; i++)

        {  

            System.out.println("\n---Enter Employee " +(i+1)+" Information: ---");

        

            System.out.println("Enter the name of Employee: ");

            name[i]=br.readLine();
            
            System.out.println("Enter City: ");

            city[i]=br.readLine();

            System.out.println("Enter Year of Joining: ");

            yoj[i]=br.readLine();

            System.out.println("Enter Salary: ");

            salary[i]=br.readLine();

            

        }

      

        Employee em1 = new Employee(); 

        em1.getInfo(name[0],city[0],salary[0], yoj[0]);

        

        Employee em2 = new Employee();

        em2.getInfo(name[1],city[1],salary[1], yoj[1]);

       

        Employee em3 = new Employee(); 

        em3.getInfo(name[2],city[2],salary[2], yoj[2]);

        

        System.out.println("Name \t\tAddress \tSalary   \tYear Of Joining");

        em1.printInfo();

        em2.printInfo();

        em3.printInfo();


}

}

