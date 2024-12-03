package kadai_015;

	//フィールド
	public class Car_Chapter15{
		private int gear = 1;  // ギア(初期値)
		private int speed = 10; // 速度(初期値)

		// ギアチェンジメソッド
		public void gearChange(int afterGear) {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear; //ギアを更新(this.gearにafterGearの3を渡す)
		}

		// 車を走らせるメソッドrunの引数は空なので引数は空
		//gearが1未満 または gearが5以上の場合のif分を作成
		public void run() {
			if(gear < 1 || gear > 5) {
				this.speed = 10; //1~5以外の時は10をthis.speedに渡す
			} else {
				this.speed = this.gear * 10; //1~5の時はthis.gear * 10をthis.speedに渡す
			}
			//this.gearに入っている3*10=30をthia.speedに渡す
			System.out.println("現在の速度は時速" + this.speed + "kmです");
			}
	}




	
