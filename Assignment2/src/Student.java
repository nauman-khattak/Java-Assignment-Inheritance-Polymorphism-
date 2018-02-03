public class Student extends Person {

    private String program;
    private int year;
    private double fees;

    public Student(String name, String address, String program, int year, double fees) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student[Person[name=" + getName() + ", address=" + getAddress() + "], program=" + getProgram() + ", year=" + getYear() + ", fees=" + getFees() + ']';
    }
}
