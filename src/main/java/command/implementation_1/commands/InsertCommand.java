package command.implementation_1.commands;

import command.implementation_1.ContactList;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InsertCommand implements Command {

    private ContactList contactList;
    private String contact;

    @Override
    public void execute() {
        contactList.add(contact);
    }

}
