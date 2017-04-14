/**
 * 
 */
package fr.imie.sesssionBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.persistence.Transient;

import fr.imie.CrowdFundingEntity;
import fr.imie.ICrowdFundingService;
import fr.imie.model.Project;

/**
 * @author imiedev
 *
 */
@SessionScoped
public class ProjectsBean implements IProjectsBean, Serializable {

	private List<Project> projects =  new ArrayList<>();
	
	
	
	public ProjectsBean() {
		super();
//		Project project1 = new Project();
//		project1.setId(1);
//		project1.setDescription("myFirstProject");
//		project1.setGoal(20000);
//		project1.setName("myFirstProject");
//		project1.addDonation(2000);
//		project1.addDonation(2000);
//		project1.addDonation(2000);
//		projects.add(project1);
//		
//		Project project2 = new Project();
//		project2.setId(2);
//		project2.setDescription("mySecondProject");
//		project2.setGoal(20000);
//		project2.setName("mySecondProject");
//		project2.addDonation(200);
//		project2.addDonation(400);
//		projects.add(project2);
//		
//		Project project3 = new Project();
//		project3.setId(3);
//		project3.setDescription("myThirdProject");
//		project3.setGoal(20000);
//		project3.setName("myThirdProject");
//		project3.addDonation(15000);
//		projects.add(project3);
//		System.out.println(crowdFundingService);
//		List<CrowdFundingEntity> crowdFundingEntities = crowdFundingService.getAllCrowdFunfingDTO();
//		for (CrowdFundingEntity crowdFundingEntity : crowdFundingEntities) {
//			Project project = new Project();
//			project.setId(crowdFundingEntity.getId());
//			project.setDescription(crowdFundingEntity.getDescription());
//			project.setGoal(crowdFundingEntity.getGoal());
//			project.setName(crowdFundingEntity.getName());
//			projects.add(project);
//		}
	}

	@Override
	public List<Project> getProjects() {
		return projects;
	}
	

}
