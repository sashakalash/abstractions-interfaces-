package classes;

import interfaces.Supplier;

import java.util.Arrays;

public class SupplierReader extends ActiveReader implements Supplier {

		public SupplierReader(String name) {
				super(name);
		}

		@Override
		public String recievedBooks(String[] titles) {
				Library.books = titles;
				return "Поставщик " + name + " доставил " +  " следующие книги: " + Arrays.toString(titles);
		}
}
