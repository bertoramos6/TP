package es.ucm.tp1.supercars.logic;

import java.util.Random;

import es.ucm.tp1.supercars.logic.gameobjects.GameObject;
import es.ucm.tp1.supercars.logic.gameobjects.Player;
import es.ucm.tp1.supercars.control.Level;

public class Game {
	
	private Player player;
	private GameObjectContainer gameObjectContainer;
	private Random rand;
	private Level level;
	private double initialTime;
	private boolean modoTest, gameFinished;
	private int cycleNum;
	
public Game(long seed, Level level) {
		
		this.level = level;
		player = new Player(this, 0, getRoadWidth() / 2);
		rand = new Random(seed);
		initialTime = 0;
		modoTest = false;
		gameFinished = false;
		cycleNum = 0;	 
	}

	//MÉTODOS PARA OBTENER INFORMACIÓN DEL NIVEL
	public int getPlayerPositionX() {
		return player.getPositionX();
	}

	public int getVisibility() {
		return level.getRoadVisibility() + getPlayerPositionX();
	}

	public int getRoadLength() {
		return level.getRoadLength();
	}
	
	public int getRoadWidth() {
		return level.getRoadWidth();
	}
	
	public int getDistanceToEnd() {
		return getRoadLength() - getPlayerPositionX();
	}
	
	public int getCycle() {
		return cycleNum;
	}
	
	public void addCycle() {
		cycleNum += 1;
	}
	
	//MÉTODOS DE RANDOM Y TIEMPO ACTUAL
	public int getRandomLane() {
		return (int) (getRandomNumber() * getRoadWidth());
	}
	
	private double getRandomNumber() {
		return rand.nextDouble(); 
	}
	
	public void startTimer(){
		this.initialTime = System.currentTimeMillis();
	}
	
	public void tryToAddObject (GameObject o, double frequency) {
		//TODO: FALTA IMPLEMENTARLO
	}
	
	//MÉTODOS PARA OBTENER INFORMACIÓN Y MANEJAR OBJETOS
	public String positionToString(int x, int y) {
		// TODO FALTA IMPLEMENTARLO
		return null;
	}
	
	public int getTotalCoins() {
		// TODO FALTA IMPLEMENTARLO CON EL CONTAINER
		return 0;
	}
	
	public int getActualCoins() {
		return player.getActualCoins();
	}
	
	public int getTotalObstacles() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public GameObject getObjectInPosition(int x, int y) {
		return gameObjectContainer.getObjectInPosition(x, y);
	}

	
	//MÉTODOS QUE MANEJAN INFORMACIÓN DEL JUEGO
	public boolean isFinished() {
		return this.gameFinished;
	}
	
	public boolean testMode() {
		return this.modoTest;
	}
	
	public double getInitialTime() {
		return this.initialTime;
	}
}
