/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/**
 *
 * @author ThomasBriggs
 */
public class FILEIO {
    
    public void save(String fileName, String saveData) throws IOException{
        FileWriter wr = new FileWriter(fileName, true);
        wr.write(saveData);
        wr.close();
    }
    
    public String[] search(String fileName, int searchId) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(fileName);
        BufferedReader buffer = new BufferedReader(reader);
        
        String lineRead = null;
        String[] outputData;
        
        while ( (lineRead = buffer.readLine()) != null){
            outputData = lineRead.split(",");
            if (Integer.parseInt(outputData[0]) == searchId){
                return outputData;
            }
            
        }
        return new String[1];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here;
        FILEIO fileio = new FILEIO();
        String fN = "test.txt";
        fileio.save(fN, "21, thomas, briggs, 04/06/00\n");
        fileio.save(fN, "66, thomas, briggs, 04/06/00\n");
        fileio.save(fN, "23, thomas, briggs, 04/06/00\n");
        fileio.save(fN, "84, thomas, briggs, 04/06/00\n");
        
        System.out.println(Arrays.toString(fileio.search(fN, 99)));
        
        
        
    }
    
}
