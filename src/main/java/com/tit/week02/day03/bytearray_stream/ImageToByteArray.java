package com.tit.week02.day03.bytearray_stream;

import java.io.*;

import static java.lang.System.out;

public class ImageToByteArray{
    //method to convert image to bytearray
    public  byte[] convertToByteArray(String inputImage){
        try (FileInputStream fileInputStream = new FileInputStream(inputImage);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

            int bytesRead;
            while ((bytesRead = fileInputStream.read()) != -1) {
                byteArrayOutputStream.write(bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            out.println("exception while reading image");
        }
        return null;
    }
    //method to convert bytearray to image
    public void byteArrayToImage(byte[] imageBytes, String outputImage){
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
             FileOutputStream fileOutputStream = new FileOutputStream(outputImage)) {

            int bytesRead;
            while ((bytesRead = byteArrayInputStream.read()) != -1) {
                fileOutputStream.write(bytesRead);
            }
        } catch (FileNotFoundException e) {
            out.println("image not found");
        } catch (IOException e) {
            out.println("exception while writing image");
        }
    }
}
