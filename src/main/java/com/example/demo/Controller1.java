package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Controller1 {

	@RequestMapping("/demopage")
	//public String display(HttpServletRequest req) {
		public String display(@RequestParam("Name") String n,@RequestParam("Rollno") String r,@RequestParam("City") String p,HttpServletRequest req,HttpSession session) {
		
//		HttpSession session=req.getSession();
//		String n=req.getParameter("name");
//		String r=req.getParameter("rollno");
//		String p=req.getParameter("city");
	//	System.out.println(" sonu jsp page is accessed");
		session.setAttribute("Name", n);
		session.setAttribute("Rollno", r);
		session.setAttribute("City", p);
		System.out.println(" My name is " + n);
		System.out.println(" My rollno is " + r);
		System.out.println(" My city is " + p);
		return "demo";
	}
	
}