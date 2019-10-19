package br.ufma.ecp.paradigmas.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person p = new Person ("Sergio",38, 166, 65, "blue", "male");
		Logger l = Logger.getLogger(Person.class.getName());
		l.info("Name: " + p.getName());
		l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight());
		l.info("Eye Color:" + p.getEyeColor());
		l.info("Gender:" + p.getGender());
		assertEquals("Sergio", p.getName());
		assertEquals(38, p.getAge());
		assertEquals(166, p.getHeight());
		assertEquals(65, p.getWeight());
		assertEquals("blue", p.getEyeColor());
		assertEquals("male", p.getGender());
	}

}
