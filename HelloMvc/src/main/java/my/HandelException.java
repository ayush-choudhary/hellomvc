package my;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandelException {
@ ExceptionHandler(ArithmeticException.class)
	public void handleException(HttpServletResponse res)
	{
		try {
			res.sendRedirect("http://yahoo.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
