package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet02
 */
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡServletContext��������
		ServletContext sc = getServletContext();
		//ͨ�����������ȡȫ�ֵ�����ֵ
		//pvcount ����Servlet01�Ĵ���
		Integer pvcount = (Integer) sc.getAttribute("pvcount");
		if(pvcount == null){
			sc.setAttribute("pvcount", 1);
		}else{
			sc.setAttribute("pvcount", ++pvcount);
		}
		pvcount = (Integer) sc.getAttribute("pvcount");
		String result = "<font color='red' size='20'>��ǰվ�㱻�����"+pvcount+"��</font>";
		response.getOutputStream().write(result.getBytes());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
