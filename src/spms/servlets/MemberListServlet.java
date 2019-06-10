package spms.servlets;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MemberListServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		try {
			// TODO Auto-generated method stub
			//1, 사용할 JDBC 드라이버를 등록하라. |
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//2. 드라이버를 사용하여 MySQL 서버와 연결하라.
			
			//3. 커넥션 객체로부터 SQL을 던질 객체를 준비하라.

			//4. SQL을 던지는 객체를 사용하여 서버에 질의하라!

			//5. 서버에 가져온 데이터를 사용하여 HTML 만들어서 웹 브라우저로 출력하라.
			
		} catch(SQLException e) {
			throw new ServletException(e);
		}


	}

}
