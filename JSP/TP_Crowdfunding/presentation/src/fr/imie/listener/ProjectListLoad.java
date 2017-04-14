package fr.imie.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import fr.imie.model.Project;

/**
 * Application Lifecycle Listener implementation class ProjectListLoad
 *
 */
@WebListener
public class ProjectListLoad implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public ProjectListLoad() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		List<Project> loadedProject = new ArrayList<>();
		Project project1 = new Project();
		project1.setId(1);
		project1.setDescription("myFirstProject");
		project1.setGoal(20000);
		project1.setName("myFirstProject");
		project1.addDonation(2000);
		project1.addDonation(2000);
		project1.addDonation(2000);
		loadedProject.add(project1);
		
		Project project2 = new Project();
		project2.setId(2);
		project2.setDescription("mySecondProject");
		project2.setGoal(20000);
		project2.setName("mySecondProject");
		project2.addDonation(200);
		project2.addDonation(400);
		
		
		loadedProject.add(project2);
		
		Project project3 = new Project();
		project3.setId(3);
		project3.setDescription("myThirdProject");
		project3.setGoal(20000);
		project3.setName("myThirdProject");
		project3.addDonation(15000);
		loadedProject.add(project3);
		// No need this listener because sessionScoped Injection provides same use
		//sessionEvent.getSession().setAttribute("projectList", loadedProject);
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
	}

}
