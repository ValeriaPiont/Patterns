package decorator.implementation_1;

import decorator.implementation_1.abstract_Munchkin.Munchkin;
import decorator.implementation_1.advanced_characters.Warrior;
import decorator.implementation_1.advanced_characters.Wizard;
import decorator.implementation_1.standart_characters.Dwarf;
import decorator.implementation_1.standart_characters.Elf;

public class Demo {

    public static void main(String[] args) {

        //Munchkin myMunchkin = new Dwarf();
        //Munchkin enemy = new Elf();

        Munchkin myMunchkin = new Warrior(new Dwarf());
        Munchkin enemy = new Wizard(new Elf());
        Munchkin superChar = new Warrior(new Wizard(new Dwarf()));

        System.out.println(myMunchkin.getStatus());
        System.out.println();
        System.out.println(enemy.getStatus());
        System.out.println();
        System.out.println(myMunchkin.fight(enemy));

        System.out.println(superChar.getStatus());
        System.out.println(myMunchkin.fight(superChar));
    }
}
