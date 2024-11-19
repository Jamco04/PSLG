public class HarryPotterGame {
    public static void main(String[] args) {
        int random = ((int) (Math.random() * 4));

        String[] spells = {"Expelliarmus", "Stupefy", "Lumos"};

        int player1Choice = ((int) (Math.random() * 3));
        int player2Choice = ((int) (Math.random() * 3));

        System.out.println("Welcome to the Harry Potter Spell Duel!");
        System.out.println("Player 1 chose: " + spells[player1Choice]);
        System.out.println("Player 2 chose: " + spells[player2Choice]);

        if (player1Choice == player2Choice) {
            System.out.println("It's a draw!");
        } else if ((player1Choice == 0 && player2Choice == 1) ||
                (player1Choice == 1 && player2Choice == 2) ||
                (player1Choice == 2 && player2Choice == 0)){
            System.out.println("Player 1 wins!");
            }
        else {
            System.out.println("Player 2 wins!");
        }
    }
}
