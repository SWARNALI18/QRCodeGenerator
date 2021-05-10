/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author user
 */
//import com.sun.javafx.iio.ImageStorage.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.File;

import net.glxn.qrgen.image.ImageType;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
public class QRCodeGen  {
    public static void main(String[] args)throws Exception {
        String Details="I am Swarnali , ,Mythology Lover.";
        ByteArrayOutputStream out=QRCode.from(Details).to(ImageType.JPG).stream();
        File f=new File("C:\\Users\\user\\Downloads\\MyChannel.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
    }

}
