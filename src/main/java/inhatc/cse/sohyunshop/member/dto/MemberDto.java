package inhatc.cse.sohyunshop.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MemberDto {

    @NotBlank(message = "이름은 필수 항목입니다.")
    private String name; //사용자 이름

    @NotEmpty(message = "이메일은 필수 항목입니다.")
    @Email(message = "이메일 형식으로 입력하세요.")
    private String email; //사용자 이메일

    @NotEmpty(message = "비밀번호는 필수 항목입니다.")
    @Length(min = 3, max = 16, message = "비밀번호는 3자 이상 16자 이하입니다.")
    private String password;

    @NotEmpty(message = "주소는 필수 항목입니다.")
    private String address;

}
