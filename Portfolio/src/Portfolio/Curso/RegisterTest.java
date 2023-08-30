package Portfolio.Curso;

public class RegisterTest {
	public static void main(String[] args) {
		
		register student = new StudentOfSchool();
		
		student.entrance("Renan", "Masculine", 33);
		
		System.out.println(student);
		
		register student2 = new StudentOfSchool();
		student2.entrance("Karolina", "feminine", 32);
		
		
	}
	
}
