package inhatc.cse.sohyunshop.member.entity;

import inhatc.cse.sohyunshop.member.constant.Role;
import inhatc.cse.sohyunshop.member.dto.MemberDto;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_id")
    private long id;

    @Column(length = 30, nullable = false)
    private String name; //사용자 이름

    @Column(unique = true, nullable = false)
    private String email; //사용자 이메일

    @Column(nullable = false)
    private String password;

    @Column(length = 200, nullable = true)
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static Member createMember(MemberDto memberDto, PasswordEncoder passwordEncoder){
        return Member.builder()
                .name(memberDto.getName())
                .email(memberDto.getEmail())
                .address(memberDto.getAddress())
                .password(passwordEncoder.encode(memberDto.getPassword()))
                .role(Role.USER)
                .build();

    }

}
