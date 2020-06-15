package main.java.view.frame;

import javax.swing.JFrame;

import main.java.common.setting.Setting;
import main.java.view.panel.UserPanel;

public class UserFrame extends JFrame {
	public static int SCREEN_WIDTH = 400, SCREEN_HEIGH = 300;

	UserPanel userPanel;

	public UserFrame() {
		setSize(SCREEN_WIDTH, SCREEN_HEIGH);
		setLocation(Setting.SCREEN_WIDTH - 410, 20);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setUndecorated(true);

		userPanel = new UserPanel();
		add(userPanel);
		setVisible(true);
	}

}