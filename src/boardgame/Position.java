package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	protected int getRow() {
		return row;
	}

	protected void setRow(int row) {
		this.row = row;
	}

	protected int getColumn() {
		return column;
	}

	protected void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
	
	

}
