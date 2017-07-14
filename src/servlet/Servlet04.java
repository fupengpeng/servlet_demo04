package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͨ��ServletContext��ȡ����webroot��WEB-INF·���µ��ļ�
 * ��ȡ·���Ժ��ִ���ϴ����صȲ���
 * Servlet implementation class Servlet01
 */
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		//��ȡwebroot��WEB-INF·���µ��ļ�
		String path = sc.getRealPath("text.properties");
		String path1 = sc.getRealPath("/upload");
//		System.out.println(path1);
//		System.out.println(path);
		
		
		InputStream in = sc.getResourceAsStream("/WEB-INF/test.properties");
		Properties prop = new Properties();
		
		try {
			prop.load(in);
			System.out.println(prop.get("key"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//��ȡServletContext��������
//		ServletContext sc = getServletContext();
//		//ͨ�����������ȡȫ�ֵ�����ֵ
//		//pvcount ����Servlet01�Ĵ���
//		Integer pvcount = (Integer) sc.getAttribute("pvcount");
//		if(pvcount == null){
//			sc.setAttribute("pvcount", 1);
//		}else{
//			sc.setAttribute("pvcount", ++pvcount);
//		}
//		pvcount = (Integer) sc.getAttribute("pvcount");
//		String result = "<font color='red' size='20'>--��ǰվ�㱻�����"+pvcount+"��</font>";
//		response.getOutputStream().write(result.getBytes());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
