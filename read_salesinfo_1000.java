package org.example;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//using haspmap here is waste dont get confued becasue 1000 records
//have 100 keys only values are replaces
public class read_salesinfo_1000 {
    public static void main(String[] args)
    {
        HashMap<String, List<String>> mp =new HashMap<>();
        List<List<String>> sales_info = new ArrayList<>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\sales_info_1000.csv"));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {

                List<String> temp =  new ArrayList<String>();
                for (String token : nextLine) {
                    temp.add(token);
                }
                mp.put(temp.get(0),temp);
                sales_info.add(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sales_info.size());
        for(int i=0;i<sales_info.size();i++)
        {
            System.out.println(sales_info.get(i));
        }
    }
}