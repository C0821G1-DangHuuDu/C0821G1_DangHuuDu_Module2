package s22_structural_design_pattern.bai_tap.facade_pattern;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public List<Integer> generateList(int size, int min, int max){
        List<Integer> numbersList = new ArrayList<>();
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i < size; i++){
            int randomInteger = randomNumber.generateInteger(min, max);
            numbersList.add(randomInteger);
        }
        return numbersList;
    }
}
