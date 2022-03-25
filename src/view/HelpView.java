package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;


public class HelpView extends JFrame{
	static MenuGameView menuGame;
	JPanel panelBack, panelGameCenter,panelMenu;
	JButton btBack;

	public HelpView(int width, int height) {
		// TODO Auto-generated method stub
		setTitle("Help");
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set borderLayout.
		SpringLayout layout = new SpringLayout();

		// set background game.

		
		ImageIcon iconMenu = new ImageIcon("D:\\git\\GameSnake\\src\\data\\helpbg.png");
		panelMenu = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(iconMenu.getImage(), 0, 0,getWidth(), getHeight(), null);
			}
		};
		setContentPane(panelMenu);
		
				panelGameCenter = new JPanel();
		
				
				//button Back
				ImageIcon iconBack = new ImageIcon("D:\\git\\GameSnake\\src\\data\\back.png");
				btBack = new JButton(iconBack);
				btBack.setBorderPainted(false);
				btBack.setContentAreaFilled(false);
				btBack.setFocusable(false);
				btBack.setPreferredSize(new Dimension(87,35));
				btBack.addMouseListener(new handler());
				
				//add components to jPanel
				panelGameCenter.setOpaque(false);
				
				panelGameCenter.add(btBack);
				
				layout.putConstraint(SpringLayout.SOUTH, panelGameCenter, 500, SpringLayout.SOUTH, this);
				layout.putConstraint(SpringLayout.WEST, panelGameCenter, 200, SpringLayout.WEST, this);
				
				add(panelGameCenter);
				setLayout(layout);
				setVisible(true);
	}
	private class handler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btBack) {
				MenuGameView menuGame = new MenuGameView(530,646);
				menuGame.setVisible(true);
				dispose();
			}
		}

		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btBack) {
				ImageIcon iconBack = new ImageIcon("D:\\git\\GameSnake\\src\\data\\back1.png");
				btBack.setIcon(iconBack);
				btBack.setPreferredSize(new Dimension(120, 40));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btBack) {
				ImageIcon iconBack = new ImageIcon("D:\\git\\GameSnake\\src\\data\\back.png");
				btBack.setIcon(iconBack);
				btBack.setPreferredSize(new Dimension(87, 35));
			}
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
}
