package CodingRound;

public class CardGame {
    public boolean solution(int total_money, int total_damage, int[] costs, int[] damages) {
        return solutionUtil(total_money, total_damage, costs, damages, 0);
    }

    public boolean solutionUtil(int total_money, int total_damage, int[] costs, int[] damages, int index) {
        if(index >= costs.length)
            return false;

        if(total_money - costs[index] < 0) {
            return solutionUtil(total_money,total_damage,costs,damages,index+1);
        } else {
            if(total_damage - damages[index] <= 0)
                return true;
            else
                return solutionUtil(total_money - costs[index],
                        total_damage - damages[index], costs, damages, index+1) ||
                        solutionUtil(total_money, total_damage, costs, damages, index+1);
        }
    }

    public static void main(String[] args) {
        int total_money = 500;
        int total_damage = 300;
        int[] costs = {600, 500, 100};
        int[] damages = {100 ,200 , 300};

        CardGame cardGame = new CardGame();
        System.out.println(cardGame.solution(total_money, total_damage, costs, damages));

    }

}
