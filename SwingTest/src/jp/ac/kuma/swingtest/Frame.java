package jp.ac.kuma.swingtest;

import javax.swing.JFrame;

public class Frame {

	private JFrame frame;
	private String Title = "名無し";

	Frame(){
		System.out.println("タイトルのないwindowが作成されました");
		frame = new JFrame(Title);
		frame.setSize(600, 400);
	}

	Frame(String x){
		System.out.println("window「"+x+"」が作成されました");
		Title = x;
		frame = new JFrame(Title);
		frame.setSize(600, 400);
	}

	void setFrameTitle(String x){
		System.out.println("windowに名前「"+x+"」が設定されました");
		Title = x;
		frame.setTitle(x);
	}

	void displayFrame(){
		System.out.println("window"+Title+"を表示します");
		frame.setVisible(true);
	}

	void deleteFrame(){
		System.out.println("window"+Title+"を削除します");
		frame.setVisible(false);
	}

	void chengeFrameSize(int x,int y){
		System.out.println(Title+"のサイズが変更されました");
		frame.setSize(x, y);
	}

}
