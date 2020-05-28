package com.stormnet.homework.homework7.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.IOException;

public class WorkWithFile {
    public static void main(String[] args) throws IOException {

        File dir = new File("F://NewDir");
        boolean created = dir.mkdir();

        if (created) {
            System.out.println("Folder is created!");
        }

        List<String> lines = Collections.singletonList("Lorem ipsum dolor sit amet");
        Path file = Paths.get("F:\\NewDir\\one.txt");
        Files.write(file, lines, StandardCharsets.UTF_8);


        List<String> lines2 = Collections.singletonList("consectetur adipiscing elit");
        Path file2 = Paths.get("F:\\NewDir\\two.txt");
        Files.write(file2, lines2, StandardCharsets.UTF_8);

        List<String> lines3 = Collections.singletonList("sed do eiusmod tempor");
        Path file3 = Paths.get("F:\\NewDir\\three.txt");
        Files.write(file3, lines3, StandardCharsets.UTF_8);

        List<String> srcFiles = Arrays.asList("F:\\NewDir\\one.txt", "F:\\NewDir\\two.txt", "F:\\NewDir\\three.txt");

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("F:\\NewDir\\test.zip"))) {

            for (String srcFile : srcFiles) {
                File zipFile = new File(srcFile);
                FileInputStream fis = new FileInputStream(zipFile);
                ZipEntry zipEntry = new ZipEntry(zipFile.getName());
                zos.putNextEntry(zipEntry);

                byte[] buf = new byte[fis.available()];
                int length;
                while ((length = fis.read(buf)) >= 0) {
                    zos.write(buf, 0, length);
                }
                fis.close();
            }

            zos.closeEntry();
            System.out.println("Archive created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir2 = new File("F://rename");
        boolean rename = dir.renameTo(dir2);
        if (rename) {
            System.out.println("Folder has been renamed! Folder name: " + dir2.getName());
        }

        if (dir2.isDirectory()) {
            System.out.println("Directory contents:");
            for (File f : dir2.listFiles()) {
                System.out.println(f.getName() + " file");
            }
        }

        String[] entries = dir2.list();
        for (String s : entries) {
            File currentFile = new File(dir2.getPath(), s);
            currentFile.delete();
        }
        boolean delete = dir2.delete();
        if (delete) {
            System.out.println("Folder has been deleted!");
        }
    }
}
