package Package_1;

public class ClassObject {
	// Instance Variables
			String name;
			String gender;
			int age;
			String id;

			public ClassObject(String name, String gender,
						int age, String id)
			{
				this.name = name;
				this.gender = gender;
				this.age = age;
				this.id = id;
			}

		
			public String getName()
			{
				return name;
			}

			
			public String getgender()
			{
				return gender;
			}

			
			public int getAge()
			{
				return age;
			}

			
			public String getid()
			{
				return id;
			}

			public String toString()
			{
				return("Hi my name is "+ this.getName()+
					".\nMy gender,age and id are " +
					this.getgender()+"," + this.getAge()+
					","+ this.getid());
			}

			public static void main(String[] args)
			{
				ClassObject student = new ClassObject("ABC","Female", 22, "student1");
				System.out.println(student.toString());
			}
}
