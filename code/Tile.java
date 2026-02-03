//Fatma Beyza Sever
//2023400270

import java.util.ArrayList;

public class Tile {
    private int column; //column number of the tile
    private int row; //row number of the tile
    private int type; //type of the tile
    private ArrayList<Tile > adjacentTiles; //an array list to store the adjacent tiles of the main tile

    Tile(int column, int row, int type){ //tile constructor using setters
        setColumn(column);
        setRow(row);
        setType(type);
        this.adjacentTiles = new ArrayList<>();
    }

    private void setColumn(int column){this.column=column;} //Set the column
    private void setRow(int row){this.row=row;} //Set the row
    private void setType(int type){this.type=type;} //set the type of the tile

    public int getColumn(){return column;} //return the column
    public int getRow(){return row;} //return the row
    public int getType(){return type;} //return the type of the tile
    public ArrayList<Tile> getAdjacentTiles() { return adjacentTiles; } //return the adjacentTiles ArrayList

    public void addAdjacentTile(Tile tile) {adjacentTiles.add(tile);} //add tiles to the adjacentTiles ArrayList
    public boolean isPassable() { //check whether the tile is a passable one
        if(getType()==2){ //if it is not passable, return false, otherwise, return true
            return false;
        }else{
            return true;
        }
    }
    public boolean samePosition(Tile other) {
        return getColumn() == other.getColumn() && getRow() == other.getRow();
    }

    public String toString() { return "(" + column + ", " + row + ")";} //toString method that will help us to write in the
    //output.txt file

}
