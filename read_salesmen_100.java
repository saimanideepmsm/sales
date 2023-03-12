package org.example;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
public class read_salesmen_100
{
    public static void main(String[] args)
    {
        CSVReader reader = null;
        HashMap<String,List<String>> mp =new HashMap<>();
        List<List<String>> salesman_data = new ArrayList<>();
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\salesman_info_100.csv"));
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null)
            {
                List<String> temp =  new ArrayList<String>();
                for (String token : nextLine)
                {
                    temp.add(token);
                }
                //System.out.println(temp);
                salesman_data.add(temp);
                mp.put(temp.get(0),temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<salesman_data.size();i++)
        {
            System.out.println(salesman_data.get(i));
        }
    }

}

