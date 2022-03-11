package builder.implementation_1;

import builder.implementation_1.ingredients.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Soup {

    private List<Vegetables> vegetables;
    private List<Meat> meat;
    private List<Condiment> condiment;

    public Soup(SoupBuilder soupBuilder) {
        this.vegetables = soupBuilder.vegetables;
        this.meat = soupBuilder.meat;
        this.condiment = soupBuilder.condiment;
    }

    public static class SoupBuilder {

        private List<Vegetables> vegetables;
        private List<Meat> meat;
        private List<Condiment> condiment;

        public SoupBuilder vegetables(Vegetables ... vegetables){
            this.vegetables = List.of(vegetables);
            return this;
        }

        public SoupBuilder meat(Meat ... meat){
            this.meat = List.of(meat);
            return this;
        }

        public SoupBuilder condiment(Condiment ... condiment){
            this.condiment = List.of(condiment);
            return this;
        }

        public Soup build(){
            return new Soup(this);
        }
    }
}
