package JavaBrain.collections.compare;

public class Student implements Comparable<Student>{
    private  String firstName;
    private String lastName;
    private int id;
    private String department;

    public Student(String firstName, String lastName, int id, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
    }

    // command+N (alt insert)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getFirstName() != null ? !getFirstName().equals(student.getFirstName()) : student.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(student.getLastName()) : student.getLastName() != null)
            return false;
        return getDepartment() != null ? getDepartment().equals(student.getDepartment()) : student.getDepartment() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getId();
        result = 31 * result + (getDepartment() != null ? getDepartment().hashCode() : 0);
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Student{"+
                "firstName= " + firstName+ '\'' +
                ", lastname='" + lastName + '\'' +
                ", department='" + department+ '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if (this.id > o.getId()){
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        }
        return 0;
        //return this.id - o.getId();
    }

    // comparator interface
    // can compare item by different combinations.
    // takes comparator instance as argument

}
