public class magicalArena {
    private dice attackdice;
    private dice defensedice;

    public magicalArena() {
        this.attackdice = new dice(6);
        this.defensedice = new dice(6);
    }

    public void fight(player player1, player player2) {
        player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        player defender = attacker == player1 ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            takeTurn(attacker, defender);
            player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("Winner: " + (player1.isAlive() ? "player 1" : "player 2"));
    }

    private void takeTurn(player attacker, player defender) {
        int attackRoll = attackdice.roll();
        int defenseRoll = defensedice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;
        int damage = attackDamage - defenseStrength;

        System.out.println("Attacker rolls: " + attackRoll + ", Defender rolls: " + defenseRoll);

        if (damage > 0) {
            defender.reduceHealth(damage);
        }

        System.out.println("Attacker: " + attacker + " Defender: " + defender);
    }
}
