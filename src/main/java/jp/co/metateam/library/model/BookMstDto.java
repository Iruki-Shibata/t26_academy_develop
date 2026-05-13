package jp.co.metateam.library.model;

import java.security.Timestamp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * 書籍マスタDTO
 */
@Getter
@Setter
public class BookMstDto {

    private Long id;

    @NotEmpty(message = "書籍タイトルは必須")
    @Size(max = 255, message = "書籍名は255文字以内で入力してください")
    private String title;

    @NotEmpty(message = "ISBNは必須")
    @Pattern(regexp = "^[0-9]{13}$", message = "ISBNは13文字で入力してください（半角数字）")
    private String isbn;

    private Timestamp deletedAt;

    private BookMst bookMst;
}
