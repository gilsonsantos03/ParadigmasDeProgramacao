package br.ufma.ecp.paradigmas.tutorial;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	static private int countPerson = 0; //countPerson é uma variável da classe
	//pesquisar sobre variável de classe x variável de instância
	//testar sem o static
	
	public Person () {
		countPerson++;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		countPerson++;
	}
	
	
	public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.gender = gender;
		countPerson++;
	}
	
	public static int countPerson () {
		return countPerson;
	}
	   
	public void setName(String name) {
		   this.name = name;
	}
	   
	public String getName () {
		   return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return countPerson + ":" + name + "," + age ;
	}
	

}
