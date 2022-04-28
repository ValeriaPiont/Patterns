package com.example.sharingapp.commands;

import android.content.Context;

import com.example.sharingapp.Command;
import com.example.sharingapp.Contact;
import com.example.sharingapp.ContactList;

public class EditContactCommand extends Command {

    private ContactList contactList;
    private Contact oldContact;
    private Contact newContact;
    private Context context;

    public EditContactCommand(ContactList contactList, Contact oldContact, Contact newContact, Context context) {
        this.contactList = contactList;
        this.oldContact = oldContact;
        this.newContact = newContact;
        this.context = context;
    }

    @Override
    public void execute() {
        contactList.deleteContact(oldContact);
        contactList.addContact(newContact);
        setIsExecuted(contactList.saveContacts(context));
    }

}
