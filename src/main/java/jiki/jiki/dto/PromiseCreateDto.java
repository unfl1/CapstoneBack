package jiki.jiki.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PromiseCreateDto {
    private String date;
    private String time;
    private int penalty;
    private String title;
    private String creatorUsername;
    private double latitude;
    private double longitude;
}