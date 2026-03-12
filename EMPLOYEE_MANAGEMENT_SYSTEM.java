# 9-Mark-Salary
IT IS USED FOR THE SALARY OF EMPLOYEE OF GOVERMENT WORKER
<br>
//242
import java.util.*;
class Incometax
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double Professional_Tax = 200;
double Tranport_Tax = 900;
double BasicPay = 0;
double HRA = 0;
double DRA = 0;
double other_allowance = 0;
double EmpProF;
System.out.println("Enter The Grade Level");
char GradeLevel = sc.next().charAt(0);
switch(GradeLevel)
{
case 'A': 
BasicPay = 60000;
other_allowance = 8000;
break;
case 'B':
BasicPay= 50000;
other_allowance = 7000;
break;
case 'C':
BasicPay=40000;
other_allowance=6000;
break;
case 'D':
BasicPay = 30000;
other_allowance = 5000;
break;
case 'E':
BasicPay=20000;
other_allowance=4000;
break;
case 'F':
BasicPay=10000;
other_allowance=3000;
break;
}
System.out.println("Enter 1 for tier 1 City, Enter 2 for tier 2 City, Enter 3 for tier 3 City");
int City = sc.nextInt();
switch(City)
{
case 1:
HRA=BasicPay*0.3;
DRA = BasicPay*0.5;
break;
case 2:
HRA=BasicPay*0.2;
DRA= BasicPay*0.5;
break;
case 3:
HRA=BasicPay*0.1;
DRA = BasicPay*0.5;
break;
}
EmpProF=0.11*BasicPay;
double GrossPay = BasicPay+HRA+DRA+other_allowance+Tranport_Tax-Professional_Tax-EmpProF;
System.out.println("YOUR GROSS PAY AMOUNT IS  "+GrossPay);
double Annual_Pay = GrossPay*12;
double IncTax=0;
if(Annual_Pay<250000)
{
IncTax=0;
}
else if(Annual_Pay<=50000 && Annual_Pay>=250001)
{
IncTax=(Annual_Pay-250000)*0.05;
}
else if(Annual_Pay<=750000 && Annual_Pay>=500001)
{
IncTax=(Annual_Pay-500000)*0.1+12500;
}
else if(Annual_Pay<=1000000 && Annual_Pay>=750001)
{
IncTax=(Annual_Pay-750000)*0.15+37500;
}
else if(Annual_Pay>=1000000 && Annual_Pay<=1250001)
{
IncTax=(Annual_Pay-1000000)*0.2+75000;
}
else if(Annual_Pay<=1500001 && Annual_Pay>=1250000)
{
IncTax=(Annual_Pay-1250000)*0.25+125000;
}
else if(Annual_Pay>=1550001)
{
IncTax=(Annual_Pay-1500000)*0.3+187500;
}
System.out.println("INCOME TAX TAKEN BY GOV = "+IncTax);
System.out.println("Annual income of employee = "+Annual_Pay);
}
}
