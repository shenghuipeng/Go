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
		System.out.println("-------------------------");
	}
	//落子后更新
	public void update(Piece piece) {
		int x=(piece.y-15)/85;
		int y=(piece.x-15)/85;
		data[x][y]=piece.isBlack? 1:2;
		
	}
	
	public int referee(Piece piece) {
		int x=(piece.y-15)/85;
		int y=(piece.x-15)/85;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
			/**
			 * 左右查找
			 */
			
			for(int i=1;i<5;i++) {
				if(data[x][y]==data[x][y+i])
					a++;
				else
					break;
			}
			for(int i=1;i<5;i++) {
						if(data[x][y]==data[x][y-i])
							a++;
						else
							break;
					}
			if(a>=4) {
				if(data[x][y]==1) {
					System.out.println("黑子胜利");
					return 1;
				}
				else
					System.out.println("白子胜利");
					return 2;
			}
				

				/**
				 * 上下查找
				 */
			
				for(int i=1;i<5;i++) {
					if(data[x][y]==data[x+i][y])
						b++;
					else
						break;
				}
				for(int i=1;i<5;i++) {
							if(data[x][y]==data[x-i][y])
								b++;
						else
							break;
							
						}
				if(b>=4) {
					if(data[x][y]==1) {
						System.out.println("黑子胜利");
						return 1;
					}
					else
						System.out.println("白子胜利");
						return 2;
				}
			
			/**
			 * 东北-西南
			 */
			
			for(int i=1;i<5;i++) {
				if(data[x][y]==data[x-i][y+i])
					c++;
				else
					break;
			}
			for(int i=1;i<5;i++) {
						if(data[x][y]==data[x+i][y-i])
							c++;
					else
						break;
						
					}
			if(c>=4) {
				if(data[x][y]==1) {
					System.out.println("黑子胜利");
					return 1;
				}
				else
					System.out.println("白子胜利");
					return 2;
			}

			/**
			 * 西北-东南
			 */
			for(int i=1;i<5;i++) {
				if(data[x][y]==data[x-i][y-i])
					d++;
				else
					break;
			}
			for(int i=1;i<5;i++) {
						if(data[x][y]==data[x+i][y+i])
							d++;
					else
						break;
						
					}
			if(d>=4) {
				if(data[x][y]==1) {
					System.out.println("黑子胜利");
					return 1;
				}
				else
					System.out.println("白子胜利");
					return 2;
			}
	
		return 0;
	}
}
