import java.util.ArrayList;
import java.util.List;

public class Blog {
    /*
           Create a Blog class which can
           store a list of BlogPosts
           add BlogPosts to the list
           delete(int) one item at given index
           update(int, BlogPost) one item at the given index and update it with another BlogPost
           */

    List<BlogPost> posts = new ArrayList<>();

    public Blog() {


    }


    public void add(BlogPost newPost) {

        posts.add(newPost);
    }

    public void delete(int index) {
        posts.remove(index);


    }

    public void update(int index, BlogPost newPost) {
        posts.set(index, newPost);
    }


}
