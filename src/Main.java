import classes.ActiveReader;
import classes.ActiveSupplier;
import classes.SuperAdmin;

public class Main {

		public static void main(String[] args) {
				SuperAdmin admin = new SuperAdmin("Вячеслав Геннадьевич");
				ActiveReader reader = new ActiveReader("Сережка Николаев");
				ActiveSupplier supplier = new ActiveSupplier("ООО МногоКниг");
				String bookToOrder = "Смирение и определённость";
				String bookToRead = "Принесенные штилем";

				supplier.recievedBooks(new String[]{
								"Подданый цепей",
								"Чернодырные миры",
								"Игорь Новиков и математический пенопласт",
								"Мир или война",
								"Второстепенный персонаж их расстояния",
								"Принесенные штилем"
				});
				System.out.println(reader.takeBook(bookToRead, admin));
				System.out.println(admin.giveBook(bookToRead, reader));
				System.out.println(admin.giveBook(bookToOrder, reader));
				System.out.println(admin.orderBook(bookToOrder, supplier));
				System.out.println(admin.overdueNotification(reader, bookToRead));
				System.out.println(reader.returnBook(bookToRead, admin));
		}

}
