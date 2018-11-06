import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;

public class cp {
    public static void main(String[] args) {
        if (0 == args.length) {
            usage();
            return;
        } else if (1 == args.length) {
            System.out.println("No destination provided");
            return;
        }
        try {
            Path source = Paths.get(args[0]);
            Path destination = Paths.get(args[1]);
            List<String> lines = Files.readAllLines(source);
            Files.write(destination, lines);
            System.out.println("ok");
        } catch (IOException e) {
            System.out.println(e.toString());
            usage();
        }
    }

    private static void usage() {
        System.out.println("usage: cp <source file> <destination file>");
    }
}