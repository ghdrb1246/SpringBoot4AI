package me.shinsunyoung.springbootdeveloper.service;

import me.shinsunyoung.springbootdeveloper.dto.UploadResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String fileName);
}
