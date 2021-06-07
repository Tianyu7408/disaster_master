package group.hdx.controller;

import group.hdx.common.Result;
import group.hdx.common.ResultGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/xml")
    Result uploadXml(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return ResultGenerator.genFailResult("文件为空");
        }

        String fileName = file.getOriginalFilename();
        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return ResultGenerator.genSuccessResult("上传xml文件成功");
        } catch (IOException e) {
        }
        return ResultGenerator.genFailResult("上传文件失败");
    }

    @RequestMapping("/json")
    Result uploadJson(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return ResultGenerator.genFailResult("文件为空");
        }

        String fileName = file.getOriginalFilename();
        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return ResultGenerator.genSuccessResult("上传json文件成功");
        } catch (IOException e) {
        }
        return ResultGenerator.genFailResult("上传文件失败");
    }
}
