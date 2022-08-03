package Package;

public class Employee {


    private int id ;
    private String FristName ;
    private String ListName;
    private  int Salary;

    public Employee (int id ,String FristName,String ListName, int Saiary){
        this.id=id;
        this.FristName=FristName;
        this.ListName=ListName;
        this.Salary=Saiary;

    }

    public  int  getId () {
        return id ;
    }

    public String getFristName(){

       return FristName;
    }

    public String getListName(){

        return ListName;
    }

    public String getName(){
        return FristName+ ListName;
    }

    public int getSalary() {
        return Salary;

    }

    public void setSalary(int Salary) {
        this.Salary=Salary;

    }

    public int getAnnualSalary(){
        return Salary*12;
   }
public int raiseSalary(int percent){

        return Salary;
}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FristName='" + FristName + '\'' +
                ", ListName='" + ListName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}

