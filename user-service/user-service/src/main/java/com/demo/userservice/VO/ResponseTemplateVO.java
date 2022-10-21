package com.demo.userservice.VO;

import com.demo.userservice.entity.User1;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseTemplateVO {

    private User1 user;
    private Department department;
}
