package edo.csuft.sheng.go;
/**
 * ��Ϸģ��
 * @author ʢ����
 *
 */
public class GoModel {
	/**
	 * ��������
	 */
	int[][] data=new int[9][9];
	/**
	 * ��ʾ
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
	//���Ӻ����
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
			 * ���Ҳ���
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
					System.out.println("����ʤ��");
					return 1;
				}
				else
					System.out.println("����ʤ��");
					return 2;
			}
				

				/**
				 * ���²���
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
						System.out.println("����ʤ��");
						return 1;
					}
					else
						System.out.println("����ʤ��");
						return 2;
				}
			
			/**
			 * ����-����
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
					System.out.println("����ʤ��");
					return 1;
				}
				else
					System.out.println("����ʤ��");
					return 2;
			}

			/**
			 * ����-����
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
					System.out.println("����ʤ��");
					return 1;
				}
				else
					System.out.println("����ʤ��");
					return 2;
			}
	
		return 0;
	}
}
