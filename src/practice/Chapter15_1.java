package practice;

import java.util.Scanner;//キーボードからの入力を受け取るjava側で用意されたクラス

public class Chapter15_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		
		while(true) {
			String bun = sc.nextLine();//次の文を読み込む
				if(bun.equals("exit")) {//読み込んだ文字列がexitと合致した場合、breakする
					break;
				}
				
				s.append(bun);//読み込んだ文字列をStringBuilderに追加し蓄えさせる
				
				//Javaでは、すべてのクラスに、toString()メソッドが用意されています。
				//toStringメソッドは、数値型などを文字列に変換するときなどに使用します。
				//それ以外にも、オブジェクトの中身を文字列表現として取得でき、
				//デバッグで確認するときなども活用します。
				
				System.out.println(s.toString());//結合した文字列を出力する
				
				//文字列の読み込みを終了する
				sc.close();
				
		}
	}

}
