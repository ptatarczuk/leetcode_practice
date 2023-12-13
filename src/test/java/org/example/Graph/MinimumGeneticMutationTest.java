package org.example.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumGeneticMutationTest {
    @Test
    public void testMinMutationExample1() {
        MinimumGeneticMutation mutation = new MinimumGeneticMutation();
        String startGene = "AACCGGTT";
        String endGene = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        int result = mutation.minMutation(startGene, endGene, bank);
        assertEquals(1, result);
    }

    @Test
    public void testMinMutationExample2() {
        MinimumGeneticMutation mutation = new MinimumGeneticMutation();
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int result = mutation.minMutation(startGene, endGene, bank);
        assertEquals(2, result);
    }
}