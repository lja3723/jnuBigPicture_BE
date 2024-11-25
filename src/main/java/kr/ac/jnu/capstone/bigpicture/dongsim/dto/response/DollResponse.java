package kr.ac.jnu.capstone.bigpicture.dongsim.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Builder
public class DollResponse {

    @Schema(description = "소셜 ID", example = "1992017827")
    private final String modelName;

    @Schema(description = "인형 이름", example = "동심이")
    private final String dollName;

    @Schema(description = "볼륨 잔량", example = "29 (0~100)")
    private final Long volumeLevel;

    @Schema(description = "배터리 잔량", example = "80 (0~100)")
    private final Long batteryLevel;

    @Schema(description = "IPv4 주소", example = "111.94.1.59")
    private final String ipv4Address;
}

