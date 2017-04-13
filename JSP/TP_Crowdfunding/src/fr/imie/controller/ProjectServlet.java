package fr.imie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.model.Project;

/**
 * Servlet implementation class ProjectServlet
 */
@WebServlet("/project")
public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProjectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Project currentProject = getProjectbyIdParam(request);
		request.setAttribute("curentProjectPresentation", currentProject);
		request.getRequestDispatcher("WEB-INF/project.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Project currentProject = getProjectbyIdParam(request);
		
		if (request.getParameter("editionModeAction") != null) {
			request.setAttribute("editionMode", true);
		} else if (request.getParameter("saveAction") != null) {
			String name = request.getParameter("nameInput");
			currentProject.setName(name);
			request.setAttribute("editionMode", false);
		}
		request.setAttribute("curentProjectPresentation", currentProject);
		request.getRequestDispatcher("WEB-INF/project.jsp").forward(request, response);
	}
	
	private Project getProjectbyIdParam(HttpServletRequest request) {
		String idString = request.getParameter("id");
		Integer id = Integer.parseInt(idString);
		List<Project> projects = (List<Project>) request.getSession().getAttribute("projectList");
		Project currentProject = null;
		for (Project project : projects) {
			if (project.getId() == id) {
				currentProject = project;
				break;
			}
		}
		return currentProject;
	}
	
}