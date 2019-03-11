package tema.mihai.teste;

import tema.mihai.clase.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import tema.mihai.clase.Student;

public class StudentTests {

	@Test
	public void test1(){
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		assertNotNull(s, "student null");
	}
	
	@Test
	public void test2(){
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		assertNotNull(s.getNume(), "nume student null");
	}
	
	@Test
	public void test3()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok=true;
		
		if(s.medieIntrare(s)<9)
			ok=false;
		
		if(s.medieIntrare(s)>10)
			ok=false;
		
		assertTrue(ok,"medie liceu invalida");
	}
	
	public void test4()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok=true;
		
		if(s.medieBursaAn1(s)<9)
			ok=false;
		
		if(s.medieBursaAn1(s)>10)
			ok=false;
		
		assertTrue(ok,"medie bursa an 1 invalida");
	}
	
	public void test5()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok=true;
		
		if(s.medieBursaAn2(s)<8.5)
			ok=false;
		
		if(s.medieBursaAn2(s)>10)
			ok=false;
		
		assertTrue(ok,"medie bursa an 2 invalida");
	}

	public void test6()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok = true;
		
		if(s.medieBursaAn3(s)<8)
			ok=false;
		
		if(s.medieBursaAn3(s)>10)
			ok=false;
		
		assertTrue(ok,"medie bursa an 3 invalida");
	}
	
	public void test7()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok = true;
		
		if(s.medieBursaPremiere(s)<9.5)
			ok=false;
		
		if(s.medieBursaPremiere(s)>10)
			ok=false;
		
		assertTrue(ok, "medie bursa premiere invalida");
	}
	
	public void test8()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok = true;
		
		if(s.medieMasterAn1(s)<9)
			ok=false;
		
		if(s.medieMasterAn1(s)>10)
			ok=false;
		
		assertTrue(ok, "medie bursa master an 1 invalida");
	}
	
	public void test9()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok = true;
		
		if(s.medieMasterAn2(s)<9)
			ok=false;
		
		if(s.medieMasterAn2(s)>10)
			ok=false;
		
		assertTrue(ok, "medie bursa master an 2 invalida");
	}
	
	public void test10()
	{
		Student s = new Student("Aaa", 18, 9.8, 9.7, 0.0, 9.5, 9.8, 9.6);
		
		boolean ok = true;
		
		if(s.medieDizertatie(s)<8.5)
			ok=false;
		
		if(s.medieDizertatie(s)>10)
			ok=false;
		
		assertTrue(ok, "medie dizertatie master invalida");
	}
}
