import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class Distribution {


    private int[] interval;
    private int sampleSize;
    private HashMap<Integer, Integer> occurances = new HashMap<Integer, Integer>();
    public Distribution(int[] interval, int sampleSize){

        this.interval = interval;
        this.sampleSize = sampleSize;

    }

    public void generateNumbers(Path path){
        int range =  interval[1] - interval[0] + 1;
        for (int i = 1; i <= range ; i++) {
            occurances.put(i,0);
        }

        for (int i = 0; i < sampleSize; i++) {
            int observation = (int)(Math.random() * range) + interval[0];

            occurances.put(observation, occurances.get(observation)+1);

        }

        DataHolder recorder = new DataHolder();
        recorder.addFrequencies(occurances.keySet().stream(), occurances.values().stream(), sampleSize);
        recorder.recordData(new File(String.valueOf(path)));



    }

}
