/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Player;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 *
 */
public class SaveAndLoad {

    public List<Memento> Load() throws FileNotFoundException {
        List<Memento> mementoList = new ArrayList<Memento>();
        FileReader fr = new FileReader("internal.txt");
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {

            String line = sc.nextLine();
            String Separated[] = line.split(",");
            Player player = Player.getInstance();
            player.setxPlayer(Integer.parseInt(Separated[0]));
            player.setyPlayer(Integer.parseInt(Separated[1]));
            player.setScore(Integer.parseInt(Separated[2]));
            player.setNumberOfBullets(Integer.parseInt(Separated[3]));
            player.setLives(Integer.parseInt(Separated[4]));
            Memento finalPlayer = new Memento(player);
            mementoList.add(finalPlayer);
        }
        return mementoList;
    }

    public void Save(List<Memento> x) throws IOException {
        File f = new File("file.txt");
        FileWriter fw = new FileWriter(f, true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            int i;
            for (i = 0; i < x.size(); i++) {
                bw.write(x.get(i).getState().getxPlayer());
                bw.write(",");
                bw.write(x.get(i).getState().getyPlayer());
                bw.write(",");
                bw.write(x.get(i).getState().getScore());
                bw.write(",");
                bw.write(x.get(i).getState().getNumberOfBullets());
                bw.write(",");
                bw.write(x.get(i).getState().getLives());
                bw.newLine();
            }
            bw.close();
        }
    }

}
