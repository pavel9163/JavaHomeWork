import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
private Map<String, List<String» phonebook;

public Phonebook() {
phonebook = new HashMap<>();
}

public void addContact(String name, String phoneNumber) {
if (phonebook.containsKey(name)) {
List<String> numbers = phonebook.get(name);
numbers.add(phoneNumber);
} else {
List<String> numbers = new ArrayList<>();
numbers.add(phoneNumber);
phonebook.put(name, numbers);
}
System.out.println("Контакт успешно добавлен.");
}

public void getContact(String name) {
if (phonebook.containsKey(name)) {
List<String> numbers = phonebook.get(name);
System.out.println("Номера телефонов для фамилии " + name + ":");
for (String number : numbers) {
System.out.println(number);
}
} else {
System.out.println("Фамилии " + name + " нет в справочнике.");
}
}

public void removeContact(String name) {
if (phonebook.containsKey(name)) {
phonebook.remove(name);
System.out.println("Все номера телефонов для фамилии " + name + " были удалены.");
} else {
System.out.println("Фамилии " + name + " нет в справочнике.");
}
}

public void listContacts() {
if (phonebook.isEmpty()) {
System.out.println("Справочник пуст.");
} else {
System.out.println("Записи в справочнике:");
for (Map.Entry<String, List<String» entry : phonebook.entrySet()) {
String name = entry.getKey();
List<String> numbers = entry.getValue();
System.out.println(name + ":");
for (String number : numbers) {
System.out.println(number);
}
}
}
}

public static void main(String[] args) {
Phonebook phonebook = new Phonebook();
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("Введите команду (ADD, GET, REMOVE, LIST, EXIT):");
String command = scanner.next();

if (command.equals("ADD")) {
String name = scanner.next();
String phoneNumber = scanner.next();
phonebook.addContact(name, phoneNumber);
} else if (command.equals("GET")) {
String name = scanner.next();
phonebook.getContact(name);
} else if (command.equals("REMOVE")) {
String name = scanner.next();
phonebook.removeContact(name);
} else if (command.equals("LIST")) {
phonebook.listContacts();
} else if (command.equals("EXIT")) {
break;
} else {
System.out.println("Некорректная команда.");
}
}

scanner.close();
}
}
