/**
 * 
 */
package com.ef;

import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ef.entity.Log;
import com.ef.factory.EntityManagerFactoryBean;
import com.ef.service.LogService;
import com.ef.util.FileUtil;

/**
 * @author felipe
 *
 */
public class Parser {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Parser.arquivo();
	}
	public static void arquivo2() {
		// criar no business, 
	}
	public static void arquivo() throws IOException, ParseException {
		FileUtil fileUtil = new FileUtil();
		List<String> lista = new ArrayList<>();	
		List<String []> objeto = new ArrayList<>();
		Path path = fileUtil.getPath(System.getProperty("user.home"), "access.log");
		if(path != null) {// data ip request status userAgent
			lista = fileUtil.getFileAsList(path);
			List<Log> logList = new ArrayList<>();
			Log log = new Log();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			
			for(String item : lista) {
				Date date = formatter.parse(item.split("\\|")[0]);
				log.setDateLog(date);
				log.setIp(item.split("\\|")[1]);
				log.setRequest(item.split("\\|")[2]);
				log.setStatus(Integer.parseInt(item.split("\\|")[3]));
				log.setUserAgent(item.split("\\|")[4]);
				logList.add(log);
			}
			//SALVAR LISTA
			EntityManagerFactoryBean entity = new EntityManagerFactoryBean();
			LogService service = new LogService(entity);
			service.addLogs(logList);
		}
	}

}
