package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class BackPack {
    public List<Item> calculateOprimalItems(List<Item> items, int maxBackPackCapacity) {
        List<Item> [][] table = new List[items.size()][maxBackPackCapacity];

        for (int i = 0;i< items.size();i++) {
            Item current = items.get(i);

            for(int j = 0; j< maxBackPackCapacity; j++) {
                List<Item> prevMax = null;
                int currentCapacity = j + 1;

                if(i - 1 >= 0) {
                    prevMax = table[i-1][j];
                }

                if(prevMax == null) {
                    if(currentCapacity >= current.getWeight()) {
                        List<Item> tmp = new ArrayList<Item>();
                        tmp.add(current);
                        table[i][j] = tmp;
                    }
                } else {
                    int sumPrevMax = 0;

                    //проверяем уберается ли текущий предмет в ячейку
                    int leftSpace = (int)(currentCapacity - current.getWeight());
                    if(leftSpace < 0) {
                        table[i][j] = prevMax;
                        continue;
                    }

                    //считаем сумму предыдущего максимума
                    for(Item item : prevMax) {
                        sumPrevMax += item.getPrice();
                    }

                    //вычисляем чем заполнить новую ячейку
                    List<Item> newCell = new ArrayList<>();

                    if(leftSpace > 0) {
                        List<Item> tmp = table[i-1][leftSpace-1];
                        newCell.add(current);
                        newCell.addAll(tmp);
                    } else {
                        newCell.add(current);
                    }

                    int newSum = 0;
                    //cчитаем сколько получится стоимость
                    for(Item item : newCell) {
                        newSum+=item.getPrice();
                    }

                    //сравниваем
                    if(sumPrevMax < newSum) {
                        table[i][j] = newCell;
                    } else {
                        table[i][j] = prevMax;
                    }
                }
            }
        }

        return table[items.size()-1][maxBackPackCapacity-1];
    }
}
