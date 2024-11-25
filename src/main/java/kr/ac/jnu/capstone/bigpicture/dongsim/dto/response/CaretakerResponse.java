package kr.ac.jnu.capstone.bigpicture.dongsim.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Builder
public class CaretakerResponse {

    @Schema(description = "소셜 ID", example = "28810299182")
    private final String socialId;

    @Schema(description = "비즈니스 모델 구독정보", example = "Premium")
    private final String businessModelInfo;

    @Schema(description = "앱 테마", example = "Light")
    private final String theme;

    @Schema(description = "현재 감정분석 날짜 범위", example = "1Day(응답형식 추후 변경예정)")
    private final String emotionAnalysisInterval;

}
