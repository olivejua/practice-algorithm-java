package com.olivejua.greedy;

import java.util.Comparator;
import java.util.List;

public class KnapsackProblem {

    public static class Cargo {
        int price;
        int weight;
        float unitPrice;

        public Cargo(int price, int weight) {
            this.price = price;
            this.weight = weight;
            this.unitPrice = (float) price / weight;
        }
    }

    public float fractionalKnapsack(int capacity, List<Cargo> cargos) {
        cargos.sort(Comparator.comparingDouble(c -> c.unitPrice * -1));

        float totalPrice = 0;
        for (Cargo cargo : cargos) {
            if (cargo.weight < capacity) {
                totalPrice += cargo.price;
                capacity -= cargo.weight;
            } else {
                float fraction = (float) capacity / cargo.weight;
                totalPrice += cargo.price * fraction;
                break;
            }
        }

        return totalPrice;
    }
}
