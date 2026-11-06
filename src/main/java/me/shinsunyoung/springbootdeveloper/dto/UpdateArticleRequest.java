package me.shinsunyoung.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateArticleRequest {
    private String title;
    private String content;
    private String imageUrl;

    public UpdateArticleRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
