public class Student extends Person {

    String previousOrganization;
    int skippedDays = 0;

    public Student(String name, int age, String gender, String previousOrganization){

    }
    public Student(String name, int age, String gender){
        super (name, age, gender);
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }
    public Student(){

    }









  public void getGoal() {
      System.out.println("Be a junior software developer");
  }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm"+ name+", a " +age +" year old " + gender + " from "+ previousOrganization + " who skipped "+ skippedDays + " days from the curse already");


    }
    public void skipDays( int numberOfDays) {
      this.skippedDays+= numberOfDays;
    }






}
