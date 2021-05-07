//package com.clone.instagram.authservice.test;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import lombok.Data;
//
//@Data
//public class Employee implements Serializable {
//
//	static transient String password="vikram";
//	private String name;
//	private String  exceptionName="invalid data in ";
//	List<Long> mobileNumbers;
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//	private boolean isPalindromeString(String name) {
//		if(name==null||name.isEmpty()) {
//			throw new RuntimeException("invalid data");
//		}
//		String reverseName=reverse(name);
//		return reverseName.equals(name);
//	}
//	private String reverse(String name) {
//		
//		StringBuilder reverseName=new StringBuilder(name);
//		return reverseName.reverse().toString();
//	}
//	
//	private List<String> getNames(List<Employee> employees){
//		if(employees==null)
//			return null;
//		return employees.stream().map(x->x.getName()).collect(Collectors.toList());
//		
//	}
//	//pallerilism
//	CompletableFuture<String> cfCompletableFuture= new CompletableFuture();
//	cfCompletableFuture.complete("vikra");
//	
//	
//	private List<List<Long>> getMobileNumbers(List<Employee> employees){
//		if(employees==null)
//			return null;//sonar 
//		return employees.stream()
//				
//				.map(x->x.getMobileNumbers())//list<long>->long
//				.flatMap(Stream::of)				
//				.collect(Collectors.toList());
//		
//	}
//	//
//	
//	//id,name.moblieno	//dep// did,name,empid
//	
//	//emplyess vs db
//	//select e.name as employeename,d.name as departmanetname from employee e join ;
//	
//	///runable vs callable,java 8 ,coding style,design pattern(solid)
//	//venkat subramnium->microserces,serilization,copyonwritearraylist,
//	//
//	
//	
//	
//	
//	
//	
//	//
////	1)null
////	2)empty name1
////	3)abbcca
////	4)aba
////5)d
////6)long string "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
////7)String "klkllklkklklklklklklklklklklklklklklklk"
//
//}
