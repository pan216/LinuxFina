import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.*;

public class HelloworldJson extends HttpServlet { 
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("application/json;charset=UTF-8");
      response.setCharacterEncoding("UTF-8");
      PrintWriter out = response.getWriter();
      Gson gson = new Gson();
      Student stu = new Student("pc",21,"19软件1");
      String json = gson.toJson(stu);
      out.println(json);
      out.flush();
      out.close();
   }
}
class Student{
        private String name;
        private int age;
        private String className;
        public Student() {
        }
        public Student(String name, int age, String className ) {
                this.name = name;
                this.age = age;
		this.className = className;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
        @Override
        public String toString() {
                return "Stu [name=" + name + ", age=" + age + ", className=" + className + "]";
        }
}

