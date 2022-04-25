package command.implementation_1.commands;

import command.implementation_1.ContactList;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateCommand implements Command {

    private ContactList contactList;
    private String oldContact;
    private String newContact;

    @Override
    public void execute() {
        contactList.update(oldContact, newContact);
    }

}
