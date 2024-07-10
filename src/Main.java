//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        player player1 = new player(50, 5, 10);
        player player2 = new player(100, 10, 5);

        magicalArena arena = new magicalArena();
        arena.fight(player1, player2);
    }
}