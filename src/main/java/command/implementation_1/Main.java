package command.implementation_1;

import command.implementation_1.commands.*;

public class Main {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        Command insertCommand = new InsertCommand(contactList, "NewContact");
        Command updateCommand = new UpdateCommand(contactList, "NewContact", "NewNewContact");
        Command removeCommand = new RemoveCommand(contactList, "NewNewContact");
        Command printAllCommand = new PrintAllCommand(contactList);


        insertCommand.execute();
        printAllCommand.execute();
        updateCommand.execute();
        printAllCommand.execute();
        removeCommand.execute();
        printAllCommand.execute();

    }
}
