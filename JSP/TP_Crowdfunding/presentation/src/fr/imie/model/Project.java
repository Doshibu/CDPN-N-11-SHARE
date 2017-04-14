/**
 * 
 */
package fr.imie.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author imiedev
 *
 */
public class Project {

	private Integer id;
	private String name;
	private String description;
	private Integer goal;
	private List<Donation> donations= new ArrayList<>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getGoal() {
		return goal;
	}

	public void setGoal(Integer goal) {
		this.goal = goal;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	/**
	 * 
	 */
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public void addDonation(Integer value){
		Donation donation = new Donation();
		donation.setValue(value);
		donations.add(donation);
	}
	
	public Integer getCurrentFunding(){
		Integer sum = 0;
		for (Donation donation : donations) {
			sum+=donation.getValue();
		}
		return sum;
	}

}
