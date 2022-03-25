package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.sound.midi.Patch;

public class HighScore {
	private ArrayList<Integer> highScore;
	private File file;
	private static HighScore highScoreInstance;

	private HighScore() {	
		highScore = new ArrayList<Integer>();
		file = new File("D:\\git\\GameSnake\\src\\data\\data.txt");
		readData();
	}
	
	public static HighScore getInstance() {
		if(highScoreInstance == null) {
			highScoreInstance = new HighScore();
		}
		return highScoreInstance;
	}

	public void readData() {
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				highScore.add(Integer.parseInt(line));
			}
			reader.close();
			bufferedReader.close();
		} catch (IOException e) {
		}

	}

	public void UpdateData() {
		try {

			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (Integer score : highScore) {
				bufferedWriter.write(score + "");
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			fileWriter.close();

		} catch (IOException e) {
		}
	}

	public ArrayList<Integer> get() {
		ArrayList<Integer> res = (ArrayList<Integer>) highScore.clone();
		return res;
	}

	public void save(int score) {
		highScore.add(score);
		Collections.sort(highScore, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return 1;
				} else {
					if (o1 == o2)
						return 0;
					else {
						return -1;
					}
				}
			}

		});
		UpdateData();
	}

}
