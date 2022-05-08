# Factory Method

### Description
Behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
### Goal & Use for

● Use the Mediator pattern when it’s hard to change some of the classes because they are tightly coupled to a bunch of other classes.

A common usage for the mediator pattern, identified by the Gang of Four, is for dialog boxes with
many components. As the user makes selections, such as checking a box or choosing a certain
bullet out of a list, other parts of the dialog may have to be grayed out or changed in some other
way. Instead of components talking to each other directly, a mediator can easily manage the
different interactions like this.



 

