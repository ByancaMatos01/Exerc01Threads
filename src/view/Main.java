package view;

import Controller.ThreadID;

public class Main {

	public static void main(String[] args) {
		for (int idThread=0; idThread<5; idThread++) {
			ThreadID threadID = new ThreadID(idThread);
		}

	}

}
