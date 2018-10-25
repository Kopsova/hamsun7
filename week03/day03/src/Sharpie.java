public class Sharpie {
    String colour;
    float width;
    float inkAmount;

    public Sharpie(String colour,float width){
        this.colour= colour;
        this.width = width;
        this.inkAmount = 100;

    }
    public void use (){
        inkAmount --;
    }
}
