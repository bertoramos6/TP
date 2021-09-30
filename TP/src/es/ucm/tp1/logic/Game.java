package es.ucm.tp1.logic;

import es.ucm.tp1.control.Level;

public class Game {

	private Player player;
	private Obstacle obstacle; //No sé si obstacle y coin hay que importarlas aqui (los tengo para el info)
	private Coin coin;		   //No sé si obstacle y coin hay que importarlas aqui (los tengo para el info)
	private Level level;
	private CoinList coinList;
	private ObstacleList obstacleList;

	public Game(long seed, Level level) {
		// TODO
		player = new Player(this);
		this.level = level;
		obstacleList = new ObstacleList(level.getRoadWidth());
		coinList = new CoinList(level.getRoadWidth());
		
		int roadLength = level.getRoadLength();

		//TODO las funciones de try to add obstacle son funciones privadas porque son auxiliares
		
//		 for (int x = getVisibility() / 2; x < roadLength; x++) {
//		 tryToAddObstacle(this, x, level.getRandomLane(), level.obstacleFrequency());
//		 tryToAddCoin(this, x, level.getRandomLane(), level.coinFrequency()); }
		 
	}

	// private void tryToAddObstacle(Game game, int x, int randomLane, double
	// obstacleFrequency) {}

	// private void tryToAddCoin(Game game, int x, int randomLane, double
	// coinFrequency) {}

	// public boolean Random.nextDouble(){}

	public void update() {
		// TODO
	}

	public void toggleTest() {
		// TODO
		level = Level.TEST;
	}

	public int getVisibility() {
		// TODO: hacer función
		return 8;
	}

	public int getRoadWidth() {
		// TODO: hacer función
		return 3;
	}

	public void moveForward() {
		player.moveForward();
	}

	public void moveUp() {
		player.moveUp();
	}

	public void moveDown() {
		player.moveDown();
	}

	public String positionToString(int x, int y) {
		if (player.playerIsInPosition(x, y))
			return ">";
		else
			return "";
	}

	public void getObjectsInfo() {
		System.out.println(player.INFO);
		System.out.println(coin.INFO);
		System.out.println(obstacle.INFO);
	}

	public int getPosition() {
		return player.getPosition();
	}
}