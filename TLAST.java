//12S25037 - Laura Lubis

import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalData;

        totalData = 0;
        String command;

        command = "---";
        String[] deskripsi = new String[10], kode = new String[10], matkul = new String[10], dosen = new String[10], deadline = new String[10], ketID = new String[10], status = new String[10];
        int[] kesulitan = new int[10], hari = new int[10];
        double[] prioritas = new double[10];

        while (!command.equals("---")) {
            if (command.equals("Add Task")) {
                addTask();
            }
            if (command.equals("Update task status")) {
                UpdateTask();
            }
            if (command.equals("Show Assignment")) {
                ShowAssignment();
            }
            if (command.equals("---")) {
            }
        }
    }
    
    public static void addTask() {
        if (totalDta > 10) {
            deskripsi[totaldata] = input.nextLine();
            if (deskripsi[totaldata] == "---") {
                kode[totaldata] = input.nextLine();
                matkul[totaldata] = input.nextLine();
                dosen[totaldata] = input.nextLine();
                deadline[totaldata] = input.nextLine();
                ketID[totaldata] = input.nextLine();
                kesulitan[totaldata] = input.nextLine();
                hari[totaldata] = input.nextLine();
                status[totaldata] = input.nextLine();
            }
        }
    }
}
