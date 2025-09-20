public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "John";
        employee.lastName = "Doe";
        employee.age = 30;
        employee.gender = 'M';
        System.out.println(employee.firstName);
        System.out.println(employee.lastName);
        System.out.println(employee.age);
        System.out.println(employee.gender);
    }
}
