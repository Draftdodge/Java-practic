package HW_OOP_3;

public class User implements Comparable<User> {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Personal personal;

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("FirstName: %s, LastName: %s, Age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int firstNameCompareT0 = this.firstName.compareTo(o.firstName);
        if (firstNameCompareT0 != 0){
            return firstNameCompareT0;
        }
        int lastNameCompareTo = this.lastName.compareTo(o.lastName);
        if (lastNameCompareTo != 0){
            return lastNameCompareTo;
        }
        return this.age - o.age;
    }
}
