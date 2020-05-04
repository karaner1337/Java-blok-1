import java.util.Date;

public class human {
    animal pet;
    private car myCar;
    Double salary;

    Date date = new Date();

    public String toString(){
        return pet+" "+myCar+"  "+salary;
    }
    void addMyCar(car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("wartosc ma byc dodatnia !");
        } else {
            System.out.println("wyplata wyslana ");
            System.out.println("anex");
            System.out.println("zmiany ");

            return salary;
        }
        return salary;
    }

    public animal getPet() {
        return pet;
    }

    public car getMyCar() {
        return myCar;
    }

    public void setMyCar(car myCar) {
        if(salary>=myCar.price) {
            System.out.println("kupuj fure");
            addMyCar(myCar);
        }else if (salary>(myCar.price/12)){
            System.out.println("mozesz na kredyt");
            addMyCar(myCar);
        }else {
            System.out.println("brak siana");
        }
    }

    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }
}
