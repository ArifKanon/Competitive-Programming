import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // long appleCount = 0;
        // for(Integer x : apples) {
        // int y = a + x;
        // if (y >= s && y <= t) appleCount+=1;
        // }

        long appleCount = apples.stream()
                .map(p -> p + a)
                .filter(r -> s <= r && r <= t)
                .count();

        long orangeCount = oranges.stream()
                .map(p -> p + b)
                .filter(r -> s <= r && r <= t)
                .count();

        System.out.println(appleCount + "\n" + orangeCount);
    }

}

public class AppleAndOrange {

    public static void main(String args[]) throws IOException {

        int s, t, a, b, m, n;
        List<Integer> apples, oranges;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Taken house positions
        String[] homePositions = bufferedReader.readLine().replaceAll("\\\\s+$", "").split(" ");
        s = Integer.parseInt(homePositions[0]);
        t = Integer.parseInt(homePositions[1]);

        // Taken tree positions
        String[] treePositions = bufferedReader.readLine().replaceAll("\\\\s+$", "").split(" ");
        a = Integer.parseInt(treePositions[0]);
        b = Integer.parseInt(treePositions[1]);

        // Taken number of Apple and Oranges (Useless block)
        String[] numberOfAppleAndOranges = bufferedReader.readLine().replaceAll("\\\\s+$", "").split(" ");
        m = Integer.parseInt(numberOfAppleAndOranges[0]);
        n = Integer.parseInt(numberOfAppleAndOranges[1]);

        apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
