import java.util.Scanner;

//import required packages

class Faculty
{
public void salary()
{
  //write your Faculty class statements
	Main main = new Main();
	int salary = main.Salarybase;
	System.out.println("Base Salary: "+salary);
}
}
class CSE
{
public void salary()
{
  //write your CSE class statements
	Main main = new Main();
	Faculty faculty = new Faculty();
	faculty.salary();
	int salary = main.Salarybase+3000;
	System.out.println("CSE Faculty: "+salary);

}
}
class IT
{
public void salary()
{
  //write your IT class statements
	Main main = new Main();
	CSE cse = new CSE();
	cse.salary();
	int salary = main.Salarybase+5000;
	System.out.println("IT Faculty: "+salary);
}
}
class ECE
{
public void salary()
{
  //write your ECE class statements
	Main main = new Main();
	int salary = main.Salarybase+4500;
	IT it = new IT();
	it.salary();
	System.out.println("ECE Faculty: "+salary);
}
}

class Main
{
	static int Salarybase;
public static void main(String[] args)
{
  ECE obj = new ECE();
  //implement your required concept here
  Scanner in = new Scanner(System.in);
  Salarybase = in.nextInt();
  obj.salary();
}
}