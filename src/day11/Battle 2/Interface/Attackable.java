package Interface;

import Player.Player;

public interface Attackable {

    public void attack(Player[] target, int index);
    public void attack(Player target);
}
