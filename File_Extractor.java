/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_extractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;

/**
 *
 * @author OLAOPA
 */
public class File_Extractor {

    static class FileExtractor{
        
        
        
//        public method that accepts a parameter which represents the location of the file to be extracted
        public void getThis(String location) throws IOException {
            File file = new File(location);
//            perform function extract(File file) on the file in the specified location
            extract(file);
            
            out.println("Extraction Completed!!");
        }
        int i = 0;
        
//        function extract(File file), accepts a File datatyped parameter
        public void extract(File file) throws FileNotFoundException, IOException {
            
//            if the file is a folder(i.e if it contains other files / has subfiles), all the files should be copied into an array of Files[sub_files]
            if(file.list() != null){
                File[] sub_files = file.listFiles();
//                perform the function extract(File file) on each sub file(nesting), and print the location of each file
                for(File sub_file : sub_files){
                    out.println(++i  +"     "+ sub_file.getAbsolutePath());
                    extract(sub_file);
                }
            }else{
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        
    }
    
}
