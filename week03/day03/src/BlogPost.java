public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {

    }


    public void putTitle() {
        System.out.println('"' + title + '"' + " " + "titled by" + " " + authorName + " " + "posted at" + " " + '"' + publicationDate + '"');
    }

    public void putText() {
        System.out.println(text);
        System.out.println();
    }
}
