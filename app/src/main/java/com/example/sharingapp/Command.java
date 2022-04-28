package com.example.sharingapp;

/**
 * Superclass of AddContactCommand, EditContactCommand, DeleteContactCommand,
 * AddItemCommand, EditItemCommand, DeleteItemCommand
 */
public abstract class Command {

    private boolean isExecuted;

    public Command(){
        isExecuted = false;
    }

    public abstract void execute();

    public boolean isExecuted(){
        return isExecuted;
    }

    public void setIsExecuted(boolean is_executed) {
        this.isExecuted = is_executed;
    }
}

