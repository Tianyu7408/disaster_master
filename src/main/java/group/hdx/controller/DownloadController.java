package group.hdx.controller;

import group.hdx.common.Result;
import group.hdx.common.ResultGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController

public class DownloadController {

    @RequestMapping("/downLoadFile/{fileName}")
    public Result fileDownLoad(HttpServletResponse response, @PathVariable("fileName") String fileName){

        String downloadFilePath = "D:\\download";

        File file = new File(downloadFilePath +'/'+ fileName);

        if(!file.exists()){
            return ResultGenerator.genFailResult("下载文件不存在");
        }

        response.reset();
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName );

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
            byte[] buff = new byte[1024];
            OutputStream os  = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (IOException e) {
            return ResultGenerator.genFailResult( "下载失败");
        }
        return ResultGenerator.genSuccessResult("下载成功");
    }
}
