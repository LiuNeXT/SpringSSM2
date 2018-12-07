package com.nexoit.utils;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FastFsdUtilsTest {


    public String conf_filename = "E:\\Code\\SpringSSM2\\src\\main\\resources\\fdfs_client.conf";

    public String local_filename = "C:\\timg.jpg";
    @Test
    public void upload() {
        try {
            ClientGlobal.init(conf_filename);
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer, storageServer);

            NameValuePair nvp[] = new NameValuePair[]{
                    new NameValuePair("age", "27"),
                    new NameValuePair("sex", "fmale")
            };


            String fileIds[] = storageClient.upload_file(local_filename, "jpg", nvp);

            System.out.println(fileIds.length);
            System.out.println("组名：" + fileIds[0]);
            System.out.println("路径：" + fileIds[1]);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void download() {
    }

    @Test
    public void getFileInfo() {
    }

    @Test
    public void getFileMate() {
    }

    @Test
    public void delete() {
    }
}