#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
//Made By Siho
#if ($Tomcat_Version >= 10)
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
#else
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
#end
import java.io.IOException;

@WebServlet(name = "${Class_Name}",value = "/${Class_Name}") //value는 JSP에서 호출할 이름입니다.
public class ${Class_Name} extends HttpServlet {
//필드변수를 입력하는 곳입니다.

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        
        
    }
}
