public class SokobanGame{

  private static int rows;
  private static int columns;
  private static boolean[][] occupiableMap;
  private static int[][] goals;
  private static int[][] boxes;
  private static int[] playerPos;
  private static int level;

  public SokobanGame(){
  /*  this.boxes = SokobanMapGenerator.getBoxes(int level);
    this.goals = getGoals(int level);
    this.columns = getNrColumns(int level);
    this.rows = getNrRows(int level);
    this.occupiableMap = getOccupiableMap(int level);
    this.playerPos = getPlayer(int level);
    this.level = numberOfLevels(); */
  }

  public int getRows(){
    return this.rows;
  }

  public int getColumns(){
    return this.columns;
  }

  public int[] getPlayerPosition(){
    return this.playerPos;
  }

  public Direction getDirection(){
    // TO DO
    return Direction.DOWN;
  }

  public int getLevel(){

    return this.level;
  }

  public int getNrMoves(){
    // TO DO
    return 0;
  }

  public int[][] getPositionBoxes(){
    return this.boxes;
  }

  public int[][] getPositionGoals(){
    return this.goals;
  }

  public boolean isOccupiable(int i, int j){

    return this.occupiableMap[i][j];
  }

  public void move(Direction dir){
    // TO DO
  }

  public boolean levelComplete(){
    // TO DO
    return true;
  }

  public boolean isTerminated(){
    // TO DO
    return true;
  }

  public void loadNextLevel(){
    // TO DO
  }

  public void restartLevel(){
    // TO DO
  }

  public String toString(){
    // TO DO
    return " ";
  }
}
