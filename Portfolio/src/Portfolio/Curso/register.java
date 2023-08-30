package Portfolio.Curso;

public class register {

	String name;
	String gender;
	int age;
	
	
	void entrance(String name, String gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Nome do aluno eh: " + name + " com a idade de: " + age + " do sexo: " + gender;
	}
	
	
}
