package com.citi;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class utill {
	
	public void writeToJson(KYCReportDto kycReportDto)
	{
	  ObjectMapper mapper = new ObjectMapper();
	  String json = null;
	  String fileName= "";
	  try
	  {
		  mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
		  mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		  json= mapper.writeValueAsString(kycReportDto);
		  writeToFile(json,"KYCBranch.json");
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}

	private void writeToFile(String json, String fileName) {
		URL fileUrl = getClass().getResource("/");
		try(FileWriter fw = new FileWriter(fileUrl.getPath()+fileName))
		{
			fw.write(json);
			fw.flush();
			
		}
		catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
