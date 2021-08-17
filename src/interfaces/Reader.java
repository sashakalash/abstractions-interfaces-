package interfaces;

import classes.ActiveAdmin;

public interface Reader {
		String takeBook(String title, ActiveAdmin admin);
		String returnBook(String title, ActiveAdmin admin);
}
