public class BlogPostMain {
    public static void main (String[]args) {

        BlogPost loremIpsum;
        loremIpsum = new BlogPost();
        loremIpsum.authorName = "John Doe";
        loremIpsum.title = "Lorem Ipsum";
        loremIpsum.text = "Lorem ipsum dolor sit amet.";
        loremIpsum.publicationDate = "2000.05.04";
        loremIpsum.putTitle();
        loremIpsum.putText();

        BlogPost waitButWhy;
        waitButWhy = new BlogPost();
        waitButWhy.authorName = "Tim Urban";
        waitButWhy.title = "Wait but why";
        waitButWhy.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        waitButWhy.publicationDate = "2010.10.10";
        waitButWhy.putTitle();
        waitButWhy.putText();

        BlogPost oneEngineer;
        oneEngineer = new BlogPost();
        oneEngineer.authorName = "William Turton";
        oneEngineer.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        oneEngineer.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        oneEngineer.publicationDate = "2017.03.28";
        oneEngineer.putTitle();
        oneEngineer.putText();

        Blog myBlog = new Blog();
        myBlog.add(loremIpsum);
        myBlog.add(waitButWhy);
        myBlog.add(oneEngineer);
        myBlog.delete(2);
        myBlog.update(1, oneEngineer);
    }
}
