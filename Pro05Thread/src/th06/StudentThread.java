package th06;

public class StudentThread extends Thread{
	private ShareBoard board;
	
	public StudentThread(String name, ShareBoard board) {
		super(name);
		this.board = board;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			board.add();
	}
}
