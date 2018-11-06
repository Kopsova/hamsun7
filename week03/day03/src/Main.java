public class Main {

    public static void main(String[] args) {

        PostIt orange;
        orange = new PostIt();
        orange.backgroundColor = "orange";
        orange.text = "Idea1";
        orange.textColor = "blue";
        orange.post();

        PostIt pink;
        pink = new PostIt();
        pink.backgroundColor = "pink";
        pink.text = "Awesome";
        pink.textColor = "black";
        pink.post();

        PostIt yellow;
        yellow = new PostIt();
        yellow.backgroundColor = "yellow";
        yellow.text = "Suberb!";
        yellow.textColor = "green";
        yellow.post();
    }
}
