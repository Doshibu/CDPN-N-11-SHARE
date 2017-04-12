package fr.imie;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ItemListFiller
 *
 */
@WebListener
public class ItemListFiller implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public ItemListFiller() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent httpSessionEvent)  { 
		List<Item> itemList = new ArrayList<>();
		Item item1 = new Item();
		item1.setId(1);
		item1.setDone(false);
		item1.setDescription("tache 1");
		itemList.add(item1);
		
		Item item2 = new Item();
		item2.setId(2);
		item2.setDone(true);
		item2.setDescription("tache 2");
		itemList.add(item2);
		
		Item item3 = new Item();
		item3.setId(3);
		item3.setDone(false);
		item3.setDescription("tache 3");
		itemList.add(item3);
		
		httpSessionEvent.getSession().setAttribute("itemList", itemList);// TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
