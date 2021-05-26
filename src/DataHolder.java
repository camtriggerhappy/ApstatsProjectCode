import java.util.HashMap;

public class DataHolder {

    private HashMap<String, Integer> Frequencies = new HashMap<String, Integer>();
    private int total;

    public DataHolder(){}

    public void addFrequencies(String[] categories, int[] counts, int total){
        for (int i = 0; i < counts.length; i++) {

            Frequencies.put(categories[i], counts[i]);
        }
    }
    




}
