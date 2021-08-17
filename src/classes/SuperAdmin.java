package classes;

import interfaces.Administrator;
import interfaces.Librarian;

public class SuperAdmin extends ActiveAdmin implements Administrator, Librarian {

		public SuperAdmin(String name) {
				super(name);
		}

		@Override
		public String orderBook(String title, ActiveSupplier supplier) {
				return "Администратором " + name +" заказана книга " + title + " у поставщика " + supplier.name;
		}
}
