package edo.csuft.sheng.go;
/**
 * 游戏模型
 * @author 盛惠鹏
 *
 */
public class GoModel {
	/**
	 * 棋盘数据
	 */
	int[][] data=new int[9][9];
	/**
	 * 显示
	 */
	public void show() {
		System.out.println("-------------------------");
		for(int[] row:data){
			for(int e:row) {
				System.out.print(e+"\t");
			}
			System.out.println();
			
		}
	}
	//落子后更新
	public void update(Piece piece) {
		int x=(piece.y-50)/100;
		int y=(piece.x-50)/100;
		data[x][y]=piece.isBlack? 1:2;
		
	}
}
