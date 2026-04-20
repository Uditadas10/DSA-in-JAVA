/*
PROBLEM: distribute candies
APPROACH:
START
create HashSet chocolates

for each candy in candyType
    add candy to chocolates

unique ← size of chocolates
maxAllowed ← length(candyType) / 2

return min(unique, maxAllowed)
END
*/

import java.util.HashSet;

class DistributeCandies {

    public int distributeCandies(int[] candyType) {

        HashSet<Integer> chocolates = new HashSet<>();

        for (int type : candyType) {
            chocolates.add(type);
        }

        int unique = chocolates.size();
        int maxAllowed = candyType.length / 2;

        return Math.min(unique, maxAllowed);
    }

    public static void main(String[] args) {

        DistributeCandies obj = new DistributeCandies();

        int candyType[] = {1,1,2,2,3,3};

        int result = obj.distributeCandies(candyType);

        System.out.println(result);
    }
}