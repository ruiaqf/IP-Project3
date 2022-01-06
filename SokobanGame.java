public class SokobanGame{
  private SokobanMap map;
  private int level = 1;
  private int rows = SokobanMapGenerator.getNrRows(level);
  private int columns = SokobanMapGenerator.getNrColumns(level);
  private boolean[][] occupiableMap = SokobanMapGenerator.getOccupiableMap(level);
  private int[][] goals = SokobanMapGenerator.getGoals(level);
  private int[][] boxes = SokobanMapGenerator.getBoxes(level);
  private int[] playerPos = SokobanMapGenerator.getPlayer(level);
  private int numberOfMoves;

  public SokobanGame(){
    map = new SokobanMap(this.rows, this.columns, this.occupiableMap, this.goals, this.boxes, this.playerPos);
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
    Direction result = Direction.DOWN;
    numberOfMoves = getNrMoves();
    if (numberOfMoves != 0) {

    }
    return result;
  }

  public int getLevel(){
    return this.level;
  }

  public int getNrMoves(){

    int counter = 0;

    return counter;
  }

  public int[][] getPositionBoxes(){
    return SokobanMapGenerator.getBoxes(level);
  }

  public int[][] getPositionGoals(){
    return SokobanMapGenerator.getGoals(level);
  }

  public boolean isOccupiable(int i, int j){
    boolean[][] occupiableMap = new boolean[rows][columns];
    occupiableMap = SokobanMapGenerator.getOccupiableMap(level);
    return occupiableMap[i][j];
  }

  public void move(Direction dir){

  }

  public boolean levelCompleted(){
    boolean levelCompleted = true;
    for (int i = 0;i < boxes.length ;i++ ) {
      for (int j = 0;j < boxes[0].length ;j++ ) {
        if (boxes[i][j] == goals[i][j]) {
          levelCompleted = false;
        }
      }
    }
    return levelCompleted;
  }

  public boolean isTerminated(){
    return levelCompleted() == true && level == SokobanMapGenerator.numberOfLevels();
  }


  public void loadNextLevel(){
    if (level < SokobanMapGenerator.numberOfLevels()) {
      level++;
      map = new SokobanMap(this.rows, this.columns, this.occupiableMap, this.goals, this.boxes, this.playerPos);
    }
  }

  public void restartLevel(){
    map = new SokobanMap(this.rows, this.columns, this.occupiableMap, this.goals, this.boxes, this.playerPos);
  }

  public String toString(){
    int result = 0;
    switch () {

    }

  }
}
