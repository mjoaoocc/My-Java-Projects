package org.academiadecodigo.nanderthals;


public class Game {
    public static final double ENEMY_PROBABILITY = 0.7;
    public static final int BULLET_DAMAGE = 1;

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;

    public Game(int numberOfObjects){
        this.gameObjects = createGameObjects(numberOfObjects);
        this.sniperRifle = new SniperRifle(BULLET_DAMAGE);
    }

    public void start() {
        for (GameObject gameObject : gameObjects) {
            System.out.println(gameObject.getMessage());

            if (gameObject instanceof Enemy) {
                Enemy target = (Enemy) gameObject;
                while(!target.isDead()){
                    System.out.println("Shooting...");
                    sniperRifle.shoot(target);
                }
                System.out.println("Target is dead.");
            }
        }
        System.out.println("Everyone is dead. You used " + sniperRifle.getShotsFired() + " shots");

    }

    public GameObject[] createGameObjects(int numberOfObjects) {
        GameObject[] gameObjects = new GameObject[numberOfObjects];

        for(int i = 0; i < gameObjects.length; i++){
            gameObjects[i] = Math.random() < ENEMY_PROBABILITY ? GameObjectFactory.createEnemy() : GameObjectFactory.createBarrelOrTree();
        }
        return gameObjects;
    }
}
