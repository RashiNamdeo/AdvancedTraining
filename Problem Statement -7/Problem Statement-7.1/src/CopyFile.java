import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) throws IOException { 
	    try (Scanner s = new Scanner(System.in)) {
			FileReader fr = null; 
			FileWriter fw = null; 
			try { 
			    String file1=args[0]; 
			    fr = new FileReader(file1); 
			    String file2=args[1];

			    File f2=new File(file2); 
			    if(!f2.exists()) { 
			        fw = new FileWriter(file2); 
			        f2.createNewFile(); 
			        int c = fr.read(); 
			        while(c!=-1) { 
			            fw.write(c); 
			            c = fr.read(); 
			        } 
			        fr.close();
			        System.out.println("File copied successfully"); 
			    } else { 

			        System.out.println("Do you want to overwrite? enter 'yes' or 'no'...:"); 
			        char ans = s.next().charAt(0);

			        if(ans=='N'||ans=='n') { 
			            fr.close();
			        //  fw.close();
			            System.out.println("Could not enter data"); 
			        } else { 
			              fw = new FileWriter(file2); 
			            int c = fr.read(); 
			            while(c!=-1) { 
			                fw.write(c); 
			                c = fr.read(); 
			            } 
			            fr.close();
			            System.out.println("File updated successfully"); 
			        } 
			    } 
			} catch(IOException e) { 
			    System.out.println("File coudn't be found!!!"); 
			} finally { 
			    close(fr); 
			    close(fw); 
			}
		} 
	} 
	public static void close(Closeable stream) { 
	    try { 
	        if (stream != null) { 
	            stream.close(); 
	        } 
	    } catch(IOException e) {
	        e.printStackTrace();
	        } 
	    }
}