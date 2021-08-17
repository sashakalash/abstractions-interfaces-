package classes;

import interfaces.Reader;

public class ActiveReader extends User implements Reader {

		public ActiveReader(String name) {
				super(name);
		}

		@Override
		public String takeBook(String title, ActiveAdmin admin) {
				return "Пользователь " + name + " запросил почитать книгу " + title + " у администратора " + admin.name;
		}

		@Override
		public String returnBook(String title, ActiveAdmin admin) {
				return "Пользователь " + name + " вернул книгу " + title + " адмнистратору " + admin.name;
		}
}
