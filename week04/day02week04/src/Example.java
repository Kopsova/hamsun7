public class Example {
    public static void main(String[]args){
        Object john = new Student("John Doe", 20, "male", "BME");
        Student bestudent = (Student)john;
        bestudent.introduce();
        Student jake = (Student) john.clone();
        jake.introduce();
    }
}
