package com.ssg.webmvc_membermain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class AdminDTO {
    private String mid;
    private String mpw;
}
