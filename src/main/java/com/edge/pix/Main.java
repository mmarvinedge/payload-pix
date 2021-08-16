/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edge.pix;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
 *
 * @author marvi
 */
public class Main {

    public static void main(String[] args) throws WriterException, IOException {
        Payload pay = new Payload();
        pay.params.setPixKey("marvinedge@live.com");
        pay.params.setDescription("Pagamento do pedido 123");
        pay.params.setMerchantName("Marvin Edge");
        pay.params.setMerchantCity("DIVINOPOLIS");
        pay.params.setAmount("28.50");
        pay.params.setTxid("EDGE123");
        System.out.println(pay.getPayload());

        // The path where the image will get saved
        String path = File.createTempFile("qrcode", ".png").getAbsolutePath();

        // Encoding charset
        String charset = "UTF-8";

        Map<EncodeHintType, ErrorCorrectionLevel> hashMap
                = new HashMap<EncodeHintType, ErrorCorrectionLevel>();

        hashMap.put(EncodeHintType.ERROR_CORRECTION,
                ErrorCorrectionLevel.L);

        // Create the QR code and save
        // in the specified folder
        // as a jpg file
        QRCodeGenerator.createQR(pay.getPayload(), path, charset, hashMap, 200, 200);
        System.out.println("QR Code Generated!!! ");
    }

}
