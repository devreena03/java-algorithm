package recursion;

public class TowerOfHanoi {
	
	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.solve(3, 'A', 'B', 'C');
	}

	public void solve(int disk, char source, char middle, char destination) {
		
		// disk count, 1,2,3 .if it starts with 0 then disk 0,1,2
		if(disk==1) {
			System.out.println("Moved Disk "+disk+ " from "+source + " to "+destination);
			return;
		}
		
		//we have to move n-1 disk to the middle rod to move nth rod to destination
		solve(disk-1, source, destination, middle);
		//move nth disk to destination
		System.out.println("Moved Disk "+disk+ " from "+source + " to "+destination);
		//repeat same for n-1 disk
		solve(disk-1, middle, source, destination);
	}
}
