package org.example;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String filePath = "On the Flip.wav";
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
