package cn.dwt.strategy;

public interface Strategy {

	Hand nextHand();

	void study(boolean win);
}
