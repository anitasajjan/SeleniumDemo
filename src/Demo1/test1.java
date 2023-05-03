package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	 @AfterSuite
	 public void method1() {
	  System.out.println("test1method1aftersuite"); 
	 }
	 
	 @BeforeSuite
	 public void method3() {
	  
	  System.out.println("test1method3beforesuite");
	 }
	 
	 @BeforeTest
	 public void method4() {
	  
	  System.out.println("test1method4beforetest");
	 }

	 @AfterTest
	 public void method5() {
	  
	  System.out.println("test1method5aftertest");
	 }
	 
	 
	 @AfterClass
	 public void method7() {
	  
	  System.out.println("test1method5afterclass");
	 }
	 
	 
	 @BeforeClass
	 public void method8() {
	  
	  System.out.println("test1method5beforeclass");
	 }
	 

	 
	 @BeforeMethod
	 public void method9() {
	  
	  System.out.println("test1method9beforemtehod");
	 }
	 
	 @AfterMethod
	 public void method10() {
	  
	  System.out.println("test1method10aftermethod");
	 }

	 @Test
	 public void method6() {
	  
	  System.out.println("test1method6");
	 }
	 
	 @Test
	 public void method11() {
	  
	  System.out.println("test1method11");
	 }
}
