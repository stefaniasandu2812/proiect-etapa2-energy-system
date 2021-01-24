package strategies;

import input.ProducerInput;
import java.util.List;

public interface EnergyChoiceStrategy {
    List<ProducerInput> chooseStrategy(List<ProducerInput> producers);
}
