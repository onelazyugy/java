package com.le.viet.controller;

import java.security.MessageDigest;
import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rs")
public class TemplateController {
	
	@RequestMapping(value = "/getTimeNow", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTimeNow(){
		Date now = new Date();
		return now.getTime();
	}

	@RequestMapping(value = "/hash", method = RequestMethod.POST)
	public String hashPassword(@RequestBody String password){
		StringBuffer sb = new StringBuffer();
		try{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());

			byte byteData[] = md.digest();

			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
			System.out.println("Hex format : " + sb.toString());
		}catch (Exception e){
			e.printStackTrace();
		}
		return sb.toString();
	}

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping(){
		return "pong";
	}
}
