package pl.net.bluesoft.rnd.newsletter.portlets;

import com.vaadin.Application;
import com.vaadin.service.ApplicationContext;
import com.vaadin.terminal.gwt.server.PortletApplicationContext2;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;
import pl.net.bluesoft.rnd.newsletter.gui.NewsletterAdminPane;
import pl.net.bluesoft.rnd.newsletter.gui.NewsletterSendingPane;

/**
 * @author tlipski@bluesoft.net.pl
 */
public class NewsletterAdminApplication extends Application {

	@Override
	public void init() {

		final Window mainWindow = new Window();
		setMainWindow(mainWindow);

		ApplicationContext applicationContext = getContext();
		if (!(applicationContext instanceof PortletApplicationContext2)) {
			mainWindow.addComponent(new Label("Please use this application from a Portlet"));
			return;
		} else {
			mainWindow.addComponent(new NewsletterAdminPane());
		}

	}

}
