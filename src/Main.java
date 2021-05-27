import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        int[] interval =  {1,100};

        Distribution distribution = new Distribution(interval, 1000000);
        distribution.generateNumbers(Path.of("C:/Users/scott/OneDrive/Desktop/StatsProject/ApstatsProjectCode/Data/data.txt"));
    }
}
