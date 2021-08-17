package classes;

import interfaces.Administrator;

import java.util.Arrays;

public class ActiveAdmin extends User implements Administrator {

		public ActiveAdmin(String name) {
				super(name);
		}

		@Override
		public String overdueNotification(ActiveReader reader, String title) {
				return "Пользователь " + reader.name + " просрочил выдачу книги " + title;
		}

		@Override
		public boolean findBook(String title) {
				return Arrays.asList(Library.books).contains(title);
		}

		@Override
		public String giveBook(String title, ActiveReader reader) {
				return findBook(title)
								? "Книга " + title + " выдана пользователю " + reader.name + " администратором " + name
								: "Книги " + title + " нет в наличии:(";
		}
}
