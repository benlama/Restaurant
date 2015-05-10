package com.Functions;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
import org.springframework.web.multipart.MultipartFile;

public class Functions {
	
	static public String randomString(){
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String filename = sb.toString();
		filename+=".pdf";
		return filename;
	}

	public void deleteFile(String filename, String folder){
		String path = "C:"+File.separator+folder;
		File file = new File(path+ File.separator + filename);
		if (file.exists()) {
			file.delete();
		}
        
	}
	static public String  uploadFile(MultipartFile file,String root, String folder){
	    String filename = randomString();
        try {
        	
            byte[] bytes = file.getBytes();

            // Creating the directory to store file
            
            String DistPath = root+File.separator+folder; 
            
            File dir = new File(DistPath);
            if (!dir.exists())
                dir.mkdirs();
            
            // Create the file on server
           
            File serverFile = new File(dir.getAbsolutePath()+ File.separator + filename);
            
            while (serverFile.exists()) {
				filename = randomString();
			    serverFile = new File(dir.getAbsolutePath()+ File.separator + filename);
			}
            
            BufferedOutputStream stream = new BufferedOutputStream( new FileOutputStream(serverFile));
		                stream.write(bytes);
		                stream.close();
        } catch (Exception e){
        	
        }
		return filename;
		
	}
	

}
