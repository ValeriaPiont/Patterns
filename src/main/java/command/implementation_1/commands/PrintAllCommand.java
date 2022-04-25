package command.implementation_1.commands;

import command.implementation_1.ContactList;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintAllCommand implements Command {

    private ContactList contactList;

    @Override
    public void execute() {
        contactList.printAll();
    }

}
