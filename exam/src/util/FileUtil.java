package util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	static Logger log = Logger.getLogger(FileUtil.class);

	/*
	 * foldAbsolutePath 待保存文件目录的的绝对路径，格式 c:/aa/bb newFileName 新的文件文件，不含扩展名 如
	 * “我的照片” oldName 旧的文件名，含扩展名 如 “mypicture.jpg”
	 */
	public static boolean saveFile(String foldAbsolutePath, String newFileName, String oldName, InputStream inputStream)
			throws Exception {
		boolean isOk = false;
		File fold = new File(foldAbsolutePath);
		if (fold.isDirectory() && !fold.exists())
			fold.mkdirs();
		String extFileName = oldName.substring(oldName.lastIndexOf("."));
		try {
			OutputStream outputStream = new FileOutputStream(new File(fold, newFileName + extFileName));
            return copyFile(inputStream, outputStream);
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
		
	}
   /*将输入流的内容拷贝到输出流中，拷贝完成关闭输入流和输出流*/
	public static boolean copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
		byte[] buffer = new byte[256];
		BufferedOutputStream bos=null;
		if(outputStream!=null)
			bos=new BufferedOutputStream(outputStream);
		int size = -1;
		try {
			while ((size = inputStream.read(buffer)) > 0) {
				bos.write(buffer, 0, size);
			}
			bos.flush();
			return true;
		} catch (IOException e) {
			throw e;
		} finally {
			if (inputStream != null)
				inputStream.close();
			if(bos!=null)
				bos.close();
			if (outputStream != null)
				outputStream.close();
		}
	
	}
	
	public static boolean delete(File file){
		 if(file.exists()){
			  if(file.isDirectory()){
				  File[] fileList=file.listFiles();
				   if(fileList!=null&&fileList.length>0){
					 for(File f:fileList)
						 delete(f);
				   }
				   file.deleteOnExit();
				   return true;
			  }else{
				  file.delete();
				  return true;
				  }
		 }
		return false;
	}
	

}
