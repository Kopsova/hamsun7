class Student {

    public void learn (){

    }
    public void question (Teacher teacher){
        teacher.answer();
    }
}

class Teacher {

    public void teach(Student student) {
        student.learn();
    }

    public void answer() {

    }

}


class StudentsAndTeachers{
    public static void main (String [] args){
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.teach(student);
        student.question(teacher);
    }

}

