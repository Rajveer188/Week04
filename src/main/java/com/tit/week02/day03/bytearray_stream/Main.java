package com.tit.week02.day03.bytearray_stream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    //define image path
    private static String inputImage = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\input_image.jpg";
    private static String outputImage = "D:\\Com\\Capgemini_Training\\Streams\\src\\main\\resources\\output_image.jpg";

    public static void main(String[] args) {
        ImageToByteArray imageToByteArray = new ImageToByteArray();

        //convert image to byte array
        byte[] imageBytes = imageToByteArray.convertToByteArray(inputImage);
        //write byte to file
        imageToByteArray.byteArrayToImage(imageBytes, outputImage);

        //check if image is same
        try {
            if (Arrays.equals(Files.readAllBytes(new File(inputImage).toPath()), imageBytes)) {
                System.out.println("files are identical");
            } else {
                System.out.println("files are not identical");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
