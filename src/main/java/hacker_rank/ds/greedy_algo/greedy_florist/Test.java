package hacker_rank.ds.greedy_algo.greedy_florist;

import org.junit.Assert;

public class Test {
    public Answer[] validResult = new Answer[]{
            new Answer(3, new int[]{1, 3, 5, 7, 9}),
            new Answer(3, new int[]{390225, 426456, 688267, 800389, 990107 ,439248, 240638, 15991, 874479, 568754, 729927, 980985, 132244,
                    488186, 5037, 721765, 251885, 28458, 23710, 281490, 30935, 897665, 768945, 337228, 533277, 959855, 927447, 941485, 24242, 684459, 312855, 716170, 512600,
                    608266, 779912, 950103, 211756, 665028, 642996, 262173, 789020, 932421, 390745, 433434, 350262, 463568, 668809, 305781, 815771, 550800})
    };

    @org.junit.Test
    public void validTest() {
        for(Answer a : validResult) Assert.assertEquals(29, Solution.getMinimumCost(a.numberOfFriends, a.flowerCosts));
    }

    class Answer {
        public int numberOfFriends;
        public int[] flowerCosts;

        public Answer(int numberOfFriends, int[] flowerCosts) {
            this.numberOfFriends = numberOfFriends;
            this.flowerCosts = flowerCosts;
        }
    }

}
