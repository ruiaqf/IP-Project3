public class SokobanMap{
  private int rows;
  private int columns;
  private boolean[][] occupiableMap;
  private int[][] goals;
  private int[][] boxes;
  private int[] playerPos;

  public SokobanMap(int rows, int columns, boolean[][] occupiableMap, int[][] goals, int[][] boxes, int[] playerPos){
    this.rows = rows;
    this.columns = columns;
    this.occupiableMap = occupiableMap;
    this.goals = goals;
    this.boxes = boxes;
    this.playerPos = playerPos;
  }

  public static boolean IsValidMap(int rows, int columns, boolean[][] occupiableMap, int[][] goals, int[][] boxes, int[] playerPos){

    boolean firstCondition = rows > 2 && columns > 2;
    boolean secondCondition = occupiableMap != null && occupiableMap.length == rows && occupiableMap[0].length == columns;
      boolean goalsA = goals != null && goals.length > 0;
      boolean goalsB = true;
        for (int i = 0;i < goals.length ;i++ ) {
          if (goals[i] == null || goals[i].length != 2 ||
          !(goals[i][0] < rows && goals[i][1] >= 0) || !(goals[i][1] < columns && goals[i][1] >= 0)) {
            goalsB = false;
          }
        }
      boolean goalsC = true;
        for (int i = 0;i < goals.length ;i++ ) {
          for (int j = 1;j < goals.length ;j++ ) {
            if (goals[i][0] == goals[j][0] && goals[i][1] == goals[j][1] && i != j) {
              goalsC = false;
            }
          }
        }
    boolean thirdCondition = goalsA && goalsB && goalsC;

    boolean boxesA = boxes != null && boxes.length > 0;
    boolean boxesB = true;
      for (int i = 0;i < boxes.length ;i++ ) {
        if (boxes[i] == null || boxes[i].length != 2 ||
        !(boxes[i][0] < rows && boxes[i][1] >= 0) || !(boxes[i][1] < columns && boxes[i][1] >= 0)) {
          boxesB = false;
        }
      }
    boolean boxesC = true;
      for (int i = 0;i < boxes.length ;i++ ) {
        for (int j = 1;j < boxes.length ;j++ ) {
          if (boxes[i][0] == boxes[j][0] && boxes[i][1] == boxes[j][1] && i != j) {
            boxesC = false;
          }
        }
      }
    boolean fourthCondition = boxesA && boxesB && boxesC;
    boolean fifthCondition = goals.length == boxes.length;
    boolean sixthCondition = true;
      for (int i = 0;i < goals.length ;i++ ) {
        if (occupiableMap[goals[i][0]][goals[i][1]] == false || occupiableMap[boxes[i][0]][boxes[i][1]] == false) {
          sixthCondition = false;
        }
      }
    boolean seventhCondition = true;
    for (int i = 0;i < boxes.length ;i++ ) {
      if (!occupiableMap[playerPos[0]][playerPos[1]] || (boxes[i][0] == playerPos[0] && boxes[i][1] == playerPos[1])) {
        seventhCondition = false;
      }
    }

    return firstCondition && secondCondition && thirdCondition && fourthCondition
          && fifthCondition && sixthCondition && seventhCondition;
  }


  public int getRows(){
    return this.rows;
  }

  public int getColumns(){
    return this.columns;
  }

  public int getNrBoxes(){
    return this.boxes.length;
  }

  public int[] getInitialPlayerPosition(){
    return this.playerPos;
  }

  public int[][] getInitialPositionBoxes(){
    return this.boxes;
  }

  public int[][] getInitialPositionGoals(){
    return this.goals;
  }

  public boolean isOccupiable(int i,int j){
    return this.occupiableMap[i][j];
  }

}
