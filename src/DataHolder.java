
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.stream.Stream;

public class DataHolder {

    private Hashtable<String, Integer> Frequencies = new Hashtable<String, Integer>();
    private int total;
    private FileWriter csvmaker;

    public DataHolder(){}

    public void addFrequencies(Stream<Integer> categories, Stream<Integer> counts, int total){
        this.total = total;
        var categoriesIt = categories.iterator();
        var countsIt = counts.iterator();
        while (categoriesIt.hasNext()) {

            Frequencies.put(categoriesIt.next().toString(), countsIt.next());
            Frequencies.put("total", total);
        }
    }

    public void recordData(File file){
        try {
            csvmaker = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder data = new StringBuilder();
        data.append(Frequencies);

        try {
            System.out.println(Frequencies);
            csvmaker.write(data.toString());
            csvmaker.flush();
            csvmaker.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
