package fr.imie;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ItemListServlet
 */
@WebServlet("/itemList")
public class ItemListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ItemListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		request.setAttribute("itemList", request.getSession().getAttribute("itemList"));
		request.getRequestDispatcher("WEB-INF/itemList.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Item> itemList=null;
		if(request.getParameter("addItem")!=null){
			itemList=  (List<Item>) request.getSession().getAttribute("itemList");
			Item newItem =  new Item();
			newItem.setDescription(request.getParameter("newItemDescInput"));
			newItem.setDone(false);
			itemList.add(newItem);
		}else if (request.getParameter("updateItems")!=null) {
			Enumeration<String> params = request.getParameterNames();
			while (params.hasMoreElements()) {
				String param = (String) params.nextElement();
				Pattern pattern = Pattern.compile("idInput-(\\d*)");
				Matcher matcher = pattern.matcher(param);
				boolean b = matcher.matches();
				// si recherche fructueuse
				if (b) {
					Integer id=Integer.parseInt(matcher.group(1));
					String checkedString = request.getParameter("checkboxInput-".concat(id.toString()));
					Boolean checked = checkedString!=null;
					itemList=  (List<Item>) request.getSession().getAttribute("itemList");
					for (Item item : itemList) {
						if (item.getId()==id){
							item.setDone(checked);
							break;
						}
					}
				}
			}
			
		
		}

		
		request.setAttribute("itemList", itemList);
		request.getRequestDispatcher("WEB-INF/itemList.jsp").forward(request, response);

	}

}
