package interfaces;

import classes.ActiveReader;

public interface Administrator {

		String overdueNotification(ActiveReader reader, String title);

		boolean findBook(String title);
		String giveBook(String title, ActiveReader reader);
}
