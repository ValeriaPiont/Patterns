package builder.implementation_1;

import builder.implementation_1.ingredients.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Salad {

    private List<Vegetables> vegetables;
    private List<Condiment> condiment;
    private Oil oil;

    public Salad(SaladBuilder saladBuilder) {
        this.vegetables = saladBuilder.vegetables;
        this.condiment = saladBuilder.condiment;
        this.oil = saladBuilder.oil;
    }

    public static class SaladBuilder{

        private List<Vegetables> vegetables;
        private List<Condiment> condiment;
        private Oil oil;

        public SaladBuilder vegetables(Vegetables ... vegetables){
            this.vegetables = List.of(vegetables);
            return this;
        }

        public SaladBuilder condiment(Condiment ... condiment){
            this.condiment = List.of(condiment);
            return this;
        }

        public SaladBuilder oil(Oil oil){
            this.oil = oil;
            return this;
        }

        public Salad build(){
            return new Salad(this);
        }
    }
}
